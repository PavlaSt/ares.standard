package cz.stuchlikova.ares.application.service;

import cz.stuchlikova.ares.application.configuration.ConfigProperties;
import cz.stuchlikova.ares.application.controller.Firma;
import cz.stuchlikova.ares.application.controller.Ico;
import cz.stuchlikova.ares.application.domain.AresRzpResponseDto;
import cz.stuchlikova.ares.application.domain.AresStandardResponseDto;
import cz.stuchlikova.ares.application.domain.BaseResponseDto;
import cz.stuchlikova.ares.application.exceptions.RecordNotFoundException;
import cz.stuchlikova.ares.application.repository.AresRzpRepo;
import cz.stuchlikova.ares.application.repository.AresStandardRepo;
import org.springframework.cache.CacheManager;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.annotation.PostConstruct;
import javax.validation.Valid;
import java.util.List;
import java.util.Objects;

@Service
@Validated
public class AresService {

    final ConfigProperties properties;
    final AresStandardRepo standardRepo;
    final CacheManager cacheManager;
    private final AresRzpRepo rzpRepo;
    CallCounter callCounter;

    public AresService(ConfigProperties properties, AresRzpRepo rzpRepo, AresStandardRepo standardRepo, CacheManager cacheManager) {
        this.properties = properties;
        this.rzpRepo = rzpRepo;
        this.standardRepo = standardRepo;
        this.cacheManager = cacheManager;
    }

    @PostConstruct
    public void init() {
        callCounter = new CallCounter(properties);
    }

    public List<AresStandardResponseDto> getDtoResponseByIco(@Valid Ico ico) {
        List<AresStandardResponseDto> responseDtos = standardRepo.getResponseByIco(ico);
        checkIfNotEmpty(responseDtos);
        return responseDtos;
    }

    public List<AresStandardResponseDto> getDtoResponseByCompanyName(@Valid Firma companyName) {
        List<AresStandardResponseDto> responseDtos = standardRepo.getResponseByCompanyName(companyName);
        checkIfNotEmpty(responseDtos);
        return responseDtos;
    }

    public List<AresRzpResponseDto> getDtoRzpResponseByIco(@Valid Ico ico) {
        List<AresRzpResponseDto> rzpResponseDtos = rzpRepo.getRzpResponse(ico);
        checkIfNotEmpty(rzpResponseDtos);
        return rzpResponseDtos;
    }

    private void checkIfNotEmpty(List<? extends BaseResponseDto> responses) {
        if (responses.isEmpty()) {
            throw new RecordNotFoundException("There are no records for this query");
        }
    }

    @Scheduled(cron = "0 0 0 * * ?")
    public void evictCache() {
        cacheManager.getCacheNames()
                .forEach(cacheName -> Objects.requireNonNull(cacheManager.getCache(cacheName)).clear());
    }

}
