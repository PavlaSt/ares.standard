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
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import javax.xml.bind.JAXBException;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class AresResponseRepositoryTest {

    @Autowired
    Jaxb2Marshaller marshaller;

    @Autowired
    private SoapClientTestImpl soapClient = new SoapClientTestImpl();

    @Autowired
    private AresOdpovediService service;

    @BeforeEach
    void setUp() {
        /*String jsonIcoAnswer = "[\n" +
                "    {\n" +
                "        \"obchodniFirma\": \"Asseco Central Europe, a.s.\",\n" +
                "        \"ico\": \"27074358\",\n" +
                "        \"nazevUlice\": \"Budějovická\",\n" +
                "        \"cisloDomovni\": 778,\n" +
                "        \"cisloOrientacni\": \"3a\",\n" +
                "        \"psc\": \"14000\",\n" +
                "        \"nazevObce\": \"Praha\",\n" +
                "        \"nazevCastiObce\": \"Michle\"\n" +
                "    }\n" +
                "]";*/
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getAresResponse() throws JAXBException {

        AresOdpovedi odpovedi = soapClient.getAresResponse("cokoliv", new AresDotazy());


        List<AresResponseDto> responseDtos = this.transformResponseToDto(odpovedi.getOdpoved());
        System.out.println(responseDtos.toString());
        String jsonIcoAnswer = "[{\"obchodniFirma\":\"Asseco Central Europe, a.s.\",\"ico\":\"27074358\",\"nazevUlice\":\"Budějovická\",\"cisloDomovni\":778,\"cisloOrientacni\":\"3a\",\"psc\":\"14000\",\"nazevObce\":\"Praha\",\"nazevCastiObce\":\"Michle\"}]";
        assertThat(responseDtos.toString(), equalTo(jsonIcoAnswer));
       /* List<Odpoved> responses = soapClient.getAresResponse("http://wwwinfo.mfcr.cz/cgi-bin/ares/xar.cgi",
                aresDotazy);

        assertThat(responses.getZaznam, equalTo());*/
    }

    /*public List<Odpoved> getAresResponse(File file) throws JAXBException {
        //File file = new File("question.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(AresOdpovedi.class);

        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        AresOdpovedi response = (AresOdpovedi) jaxbUnmarshaller.unmarshal(file);

        return response.getOdpoved();

    }*/

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

}