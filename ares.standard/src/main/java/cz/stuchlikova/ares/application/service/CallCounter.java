package cz.stuchlikova.ares.application.service;

import cz.stuchlikova.ares.application.configuration.ConfigProperties;
import cz.stuchlikova.ares.application.exceptions.ApiRateExceededException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Component
public class CallCounter {

    private final ConfigProperties properties;

    private long limit;
    private LocalDateTime from;
    private LocalDateTime to;
    private long counter;

    public CallCounter(@Autowired ConfigProperties properties) {
        this.properties = properties;
    }

    public boolean isNotFromInterval() {
        return !LocalDateTime.now().isAfter(from) || !LocalDateTime.now().isBefore(to);
    }

    public long incrementAndGet() {
        ++counter;
        return counter;
    }

    @PostConstruct
    public void setAtributes() {
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

    public void checkOrThrow() {
        if (isNotFromInterval()) {
            setAtributes();
        }
        long count = incrementAndGet();
        if (count > getLimit()) {
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
