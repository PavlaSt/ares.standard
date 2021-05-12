package cz.stuchlikova.ares.application.service;

import cz.stuchlikova.ares.application.configuration.ConfigProperties;
import cz.stuchlikova.ares.application.controller.Firma;
import cz.stuchlikova.ares.application.controller.Ico;
import cz.stuchlikova.ares.application.domain.AresRzpResponseDto;
import cz.stuchlikova.ares.application.domain.AresStandardResponseDto;
import cz.stuchlikova.ares.application.exceptions.ApiRateExceededException;
import cz.stuchlikova.ares.application.repository.AresRzpRepo;
import cz.stuchlikova.ares.application.repository.AresStandardRepo;
import cz.stuchlikova.ares.application.stub.rzp.OdpovedRZP;
import cz.stuchlikova.ares.application.stub.standard.Odpoved;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.xml.datatype.DatatypeConfigurationException;
import java.time.LocalTime;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;

@Service
@Validated
public class AresService {

    final ConfigProperties properties;
    final AresStandardRepo standardRepo;
    private final AresStandardTransformation aresStandardTransformation;
    private final AresRzpTransformation aresRzpTransformation;
    private final AresRzpRepo rzpRepo;

    private final AtomicLong counter;

    @Autowired
    CacheManager cacheManager;


    public AresService(ConfigProperties properties, AresRzpRepo rzpRepo, AresStandardRepo standardRepo) {
        aresRzpTransformation = new AresRzpTransformation();
        aresStandardTransformation = new AresStandardTransformation();
        this.properties = properties;
        this.rzpRepo = rzpRepo;
        this.standardRepo = standardRepo;
        counter = new AtomicLong();
    }

    @Cacheable("responses-by-ico")
    public synchronized List<AresStandardResponseDto> getDtoResponseByIco(@Valid Ico ico) throws DatatypeConfigurationException {
        checkRateLimit();
        List<Odpoved> responses = standardRepo.getResponseByIco(ico);
        return aresStandardTransformation.transformResponseToDto(responses);
    }

    @Cacheable("responses-by-company")
    public synchronized List<AresStandardResponseDto> getDtoResponseByCompanyName(Firma companyName) throws DatatypeConfigurationException {
        checkRateLimit();
        List<Odpoved> responses = standardRepo.getResponseByCompanyName(companyName);
        return aresStandardTransformation.transformResponseToDto(responses);
    }

    @Cacheable("rzp")
    public synchronized List<AresRzpResponseDto> getDtoRzpResponseByIco(@Valid Ico ico) throws DatatypeConfigurationException {
        checkRateLimit();
        List<OdpovedRZP> responsesRZP = rzpRepo.getRzpResponse(ico);
        return aresRzpTransformation.transformResponseRzpToDto(responsesRZP);
    }

    private void checkRateLimit() {
        long count = counter.incrementAndGet();
        long limit;
        LocalTime now = LocalTime.now();

        if (now.isAfter(properties.getEarlierTime()) && now.isBefore(properties.getLaterTime())) {
            limit = properties.getLowerLimit();
        } else {
            limit = properties.getUpperLimit();
        }
        if (count > limit) {
            throw new ApiRateExceededException("Too many API requests");
        }
    }

    @Scheduled(cron = "0 0 8 * * ?")
    @Scheduled(cron = "0 0 18 * * ?")
    void resetCounter() {
        counter.set(0L);
    }

    @Scheduled(cron = "0 0 0 * * ?")
    public void evictCache() {
        cacheManager.getCacheNames()
                .forEach(cacheName -> Objects.requireNonNull(cacheManager.getCache(cacheName)).clear());
    }
}
