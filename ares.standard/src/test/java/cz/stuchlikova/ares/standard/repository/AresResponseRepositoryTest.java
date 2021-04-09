package cz.stuchlikova.ares.standard.repository;

import cz.stuchlikova.ares.standard.SoapClient;
import cz.stuchlikova.ares.standard.SoapClientTestImpl;
import cz.stuchlikova.ares.standard.dto.AresResponseDto;
import cz.stuchlikova.ares.standard.service.AresOdpovediService;
import cz.stuchlikova.ares.standard.stub.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.xml.bind.JAXBException;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


@SpringBootTest(properties = "spring.main.allow-bean-definition-overriding=true")
class AresResponseRepositoryTest {


    @Autowired
    //private SoapClient soapClient = new SoapClientTestImpl();
    private SoapClient soapClient;

    @Autowired
    private AresOdpovediService service;


    final String jsonIcoAnswer = "[{\"obchodniFirma\":\"Asseco Central Europe, a.s.\",\"ico\":\"27074358\",\"nazevUlice\":\"Budějovická\",\"cisloDomovni\":778,\"cisloOrientacni\":\"3a\",\"psc\":\"14000\",\"nazevObce\":\"Praha\",\"nazevCastiObce\":\"Michle\"}]";


    @Test
    void getAresResponse_fromSavedXmlAnswer_jsonIsreturned() throws JAXBException {

        AresOdpovedi odpovedi = soapClient.getAresResponse("cokoliv", new AresDotazy());

        List<AresResponseDto> responseDtos = service.transformResponseToDto(odpovedi.getOdpoved());

        assertThat(responseDtos.toString(), equalTo(jsonIcoAnswer));

    }

    @Test
    void getAresResponse_fromSavedXmlAnswer_rightObjectIsReturned() throws JAXBException {

        AresOdpovedi odpovedi = soapClient.getAresResponse("cokoliv", new AresDotazy());

        List<Odpoved> odpovedList = odpovedi.getOdpoved();
        Odpoved odpoved = odpovedList.get(0);
        List<Zaznam> zaznamList = odpoved.getZaznam();
        Zaznam zaznam1 = zaznamList.get(0);


        assertThat(zaznam1.getObchodniFirma(), equalTo("Asseco Central Europe, a.s."));


    }

}