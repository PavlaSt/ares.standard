package cz.stuchlikova.ares.application.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
@Configuration
@ConfigurationProperties(prefix = "app")
public class ConfigProperties {

    AresClientProperties standardProperties;
    AresClientProperties rzpProperties;
    long lowerLimit;
    long upperLimit;
    LocalTime earlierTime;
    LocalTime laterTime;


    public ConfigProperties() {
    }

    public ConfigProperties(AresClientProperties standardProperties, AresClientProperties rzpProperties) {
        this.standardProperties = standardProperties;
        this.rzpProperties = rzpProperties;
    }

    public AresClientProperties getStandardProperties() {
        return standardProperties;
    }

    public void setStandardProperties(AresClientProperties standardProperties) {
        this.standardProperties = standardProperties;
    }

    public long getLowerLimit() {
        return lowerLimit;
    }

    public void setLowerLimit(long lowerLimit) {
        this.lowerLimit = lowerLimit;
    }

    public long getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(long upperLimit) {
        this.upperLimit = upperLimit;
    }

    public LocalTime getEarlierTime() {
        return earlierTime;
    }

    public void setEarlierTime(LocalTime earlierTime) {
        this.earlierTime = earlierTime;
    }

    public LocalTime getLaterTime() {
        return laterTime;
    }

    public void setLaterTime(LocalTime laterTime) {
        this.laterTime = laterTime;
    }

    public AresClientProperties getRzpProperties() {
        return rzpProperties;
    }

    public void setRzpProperties(AresClientProperties rzpProperties) {
        this.rzpProperties = rzpProperties;
    }

    public static class AresClientProperties {
        String url;
        String email;
        Integer maxPocet;


        public AresClientProperties() {
        }


        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Integer getMaxPocet() {
            return maxPocet;
        }

        public void setMaxPocet(Integer maxPocet) {
            this.maxPocet = maxPocet;
        }


    }

}
