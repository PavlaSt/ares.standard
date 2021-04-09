package cz.stuchlikova.ares.standard;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;

@Configuration
@Primary
public class BeanTestConfig {

   /* @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("cz.stuchlikova.ares.standard.stub");
        return marshaller;
    }

    @Bean

    public SoapClient soapConnector(Jaxb2Marshaller marshaller) {

        return new SoapClientTestImpl();
    }
    */
}
