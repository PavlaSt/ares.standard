package cz.stuchlikova.ares.application.service;

import cz.stuchlikova.ares.application.controller.Ico;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.xml.datatype.DatatypeConfigurationException;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class OdpovedCacheTest {

    @Autowired
    AresService service;

    @Test
    void getResponseById_forMultipleRequests_isRetrievedFromCache() throws DatatypeConfigurationException {
        //given
        Ico ico = new Ico("27074358");
        Ico ico2 = new Ico("12345678");

        //when
        System.out.println(1);
        System.out.println(service.getDtoResponseByIco(ico).get(0).getIco());

        System.out.println(2);
        System.out.println(service.getDtoResponseByIco(ico).get(0).getIco());
        //service.getDtoResponseByIco(ico);

        System.out.println(3);
        service.getDtoResponseByIco(ico);

        System.out.println(4);
        service.getDtoResponseByIco(ico);

        System.out.println(5);
        service.getDtoResponseByIco(ico2);

        //then

    }
}
