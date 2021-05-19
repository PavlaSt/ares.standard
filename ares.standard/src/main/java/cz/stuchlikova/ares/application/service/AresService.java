package cz.stuchlikova.ares.application.service;

import cz.stuchlikova.ares.application.configuration.ConfigProperties;
import cz.stuchlikova.ares.application.controller.Firma;
import cz.stuchlikova.ares.application.controller.Ico;
import cz.stuchlikova.ares.application.domain.AresRzpResponseDto;
import cz.stuchlikova.ares.application.domain.AresStandardResponseDto;
import cz.stuchlikova.ares.application.domain.BaseResponseDto;
import cz.stuchlikova.ares.application.exceptions.ApiRateExceededException;
import cz.stuchlikova.ares.application.exceptions.RecordNotFoundException;
import cz.stuchlikova.ares.application.repository.AresRzpRepo;
import cz.stuchlikova.ares.application.repository.AresStandardRepo;
import org.springframework.cache.CacheManager;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.annotation.PostConstruct;
import javax.validation.Valid;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;

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
        List<AresStandardResponseDto> responseDtos = standardRepo.getResponseByIco(ico, callCounter);
        checkIfNotEmpty(responseDtos);
        return responseDtos;
    }

    public List<AresStandardResponseDto> getDtoResponseByCompanyName(@Valid Firma companyName) {
        List<AresStandardResponseDto> responseDtos = standardRepo.getResponseByCompanyName(companyName, callCounter);
        checkIfNotEmpty(responseDtos);
        return responseDtos;
    }

    public List<AresRzpResponseDto> getDtoRzpResponseByIco(@Valid Ico ico) {
        List<AresRzpResponseDto> rzpResponseDtos = rzpRepo.getRzpResponse(ico, callCounter);
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

    public class CallCounter {
        private final ConfigProperties properties;

        private long limit;
        private LocalDateTime from;
        private LocalDateTime to;
        private long counter;

        public CallCounter(ConfigProperties properties) {
            this.properties = properties;
            resetAtributes();
        }

        public boolean isNotFromInterval() {
            return !LocalDateTime.now().isAfter(from) || !LocalDateTime.now().isBefore(to);
        }

        public long incrementAndGet() {
            ++counter;
            return counter;
        }

        public void resetAtributes() {
            counter = 0L;
            LocalTime timeNow = LocalTime.now();
            LocalDate currentDate = LocalDate.now();
            //current time is between 8 - 18 h
            if (timeNow.isAfter(properties.getEarlierTime()) && timeNow.isBefore(properties.getLaterTime())) {
                limit = properties.getUpperLimit();
                from = LocalDateTime.of(currentDate, properties.getEarlierTime());
                to = LocalDateTime.of(currentDate, properties.getLaterTime());
            } else {
                limit = properties.getLowerLimit();
                //current time is before 8 h
                if (timeNow.isBefore(properties.getEarlierTime())) {
                    from = LocalDateTime.of(currentDate.minusDays(1L), properties.getLaterTime());
                    to = LocalDateTime.of(currentDate, properties.getLaterTime());
                } else {
                    //current time is after 18 h
                    from = LocalDateTime.of(currentDate, properties.getLaterTime());
                    to = LocalDateTime.of(currentDate.plusDays(1L), properties.getEarlierTime());
                }
            }
        }

        public void checkOrThrow() { //Supplier<RuntimeException> exceptionSupplier
            if (callCounter.isNotFromInterval()) {
                callCounter.resetAtributes();
            }
            long count = callCounter.incrementAndGet();
            if (count > callCounter.getLimit()) {
                //throw new exceptionSupplier.get();
                throw new ApiRateExceededException("Too many API requests");
            }
        }

        public LocalDateTime getFrom() {
            return from;
        }

        public LocalDateTime getTo() {
            return to;
        }

        public long getLimit() {
            return limit;
        }

        public long getCounter() {
            return counter;
        }

        public void setCounter(long counter) {
            this.counter = counter;
        }
    }
}
