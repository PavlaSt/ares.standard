package cz.stuchlikova.ares.standard;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
@Primary
public class BeanConfig {
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("cz.stuchlikova.ares.standard.stub");
        return marshaller;
    }
    @Bean
    public SoapClient soapConnector(Jaxb2Marshaller marshaller) {
        SoapClientImpl client = new SoapClientImpl();
        client.setDefaultUri("http://wwwinfo.mfcr.cz/cgi-bin/ares/xar.cgi");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

}
