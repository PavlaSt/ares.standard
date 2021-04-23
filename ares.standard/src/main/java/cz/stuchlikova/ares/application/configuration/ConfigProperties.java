package cz.stuchlikova.ares.application.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
@ConfigurationProperties(prefix = "standard")
public class ConfigProperties {
    private String url;
    private String email;
    private Integer maxPocet;

    public ConfigProperties() {
    }

    public ConfigProperties(String url, String email, Integer maxPocet) {
        this.url = url;
        this.email = email;
        this.maxPocet = maxPocet;
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
