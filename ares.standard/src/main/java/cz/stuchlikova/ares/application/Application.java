package cz.stuchlikova.ares.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableCaching
@EnableScheduling
@ConfigurationPropertiesScan("cz.stuchlikova.ares.application.configuration")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
