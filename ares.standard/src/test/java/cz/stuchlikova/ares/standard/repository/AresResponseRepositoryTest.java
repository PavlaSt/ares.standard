package cz.stuchlikova.ares.standard.repository;

import cz.stuchlikova.ares.standard.SoapClient;
import cz.stuchlikova.ares.standard.SoapClientImpl;
import cz.stuchlikova.ares.standard.SoapClientTestImpl;
import cz.stuchlikova.ares.standard.dto.AresResponseDto;
import cz.stuchlikova.ares.standard.service.AresOdpovediService;
import cz.stuchlikova.ares.standard.stub.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import javax.xml.bind.JAXBException;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


@SpringBootTest(properties = "spring.main.allow-bean-definition-overriding=true")
class AresResponseRepositoryTest {


    //@Autowired
    private SoapClient soapClient = new SoapClientTestImpl();
    //private SoapClient soapClient;

    @Autowired
    private AresOdpovediService service;


    final String jsonIcoAnswer = "[{\"obchodniFirma\":\"Asseco Central Europe, a.s.\",\"ico\":\"27074358\",\"nazevUlice\":\"Budějovická\",\"cisloDomovni\":778,\"cisloOrientacni\":\"3a\",\"psc\":\"14000\",\"nazevObce\":\"Praha\",\"nazevCastiObce\":\"Michle\"}]";


    @Test
    void getAresResponse() throws JAXBException {

        AresOdpovedi odpovedi = soapClient.getAresResponse("cokoliv", new AresDotazy());
        List<AresResponseDto> responseDtos = service.transformResponseToDto(odpovedi.getOdpoved());

        //List<AresResponseDto> responseDtos = this.transformResponseToDto(odpovedi.getOdpoved());

        assertThat(responseDtos.toString(), equalTo(jsonIcoAnswer));
    }

/*

    public List<AresResponseDto> transformResponseToDto(List<Odpoved> responses) {
        List<AresResponseDto> responseDtos = new ArrayList<>();

        for (Odpoved response : responses) {
            List<Zaznam> records = response.getZaznam();
            for (Zaznam record : records) {
                String obchodniFirma = record.getObchodniFirma();
                String ico = record.getICO();

                Identifikace identifikace = record.getIdentifikace();
                AdresaARES2 adresa = identifikace.getAdresaARES();
                String nazevObce = adresa.getNazevObce();
                String nazevCastiObce = adresa.getNazevCastiObce();
                String nazevUlice = adresa.getNazevUlice();
                Integer cisloDomovni = adresa.getCisloDomovni();
                String cisloOrientacni = adresa.getCisloOrientacni();
                String psc = adresa.getPSC();

                AresResponseDto responseDto = new AresResponseDto(obchodniFirma, ico, nazevUlice, cisloDomovni,
                        cisloOrientacni, psc, nazevObce, nazevCastiObce);
                responseDtos.add(responseDto);
            }

        }
        return responseDtos;
    }
*/

}