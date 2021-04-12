package cz.stuchlikova.ares.standard.repository;

import cz.stuchlikova.ares.standard.AresClient;
import cz.stuchlikova.ares.standard.dto.AresResponseDto;
import cz.stuchlikova.ares.standard.service.Transformation;
import cz.stuchlikova.ares.standard.stub.AresDotazy;
import cz.stuchlikova.ares.standard.stub.AresOdpovedi;
import cz.stuchlikova.ares.standard.stub.Odpoved;
import cz.stuchlikova.ares.standard.stub.Zaznam;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


@SpringBootTest(properties = "spring.main.allow-bean-definition-overriding=true")
class AresResponseRepositoryTest {

    @Autowired
    private AresClient aresClient;
    private final Transformation transformation = new Transformation();
    final String jsonIcoAnswer = "[{\"obchodniFirma\":\"Asseco Central Europe, a.s.\",\"ico\":\"27074358\",\"nazevUlice\":\"Budějovická\",\"cisloDomovni\":778,\"cisloOrientacni\":\"3a\",\"psc\":\"14000\",\"nazevObce\":\"Praha\",\"nazevCastiObce\":\"Michle\"}]";


    @Test
    void getAresResponse_fromSavedXmlAnswer_jsonIsreturned() {

        AresOdpovedi odpovedi = aresClient.getAresResponse("src/test/resources/answerIco.xml", new AresDotazy());

        List<AresResponseDto> responseDtos = transformation.transformResponseToDto(odpovedi.getOdpoved());

        assertThat(responseDtos.toString(), equalTo(jsonIcoAnswer));

    }

    @Test
    void getAresResponse_fromSavedXmlAnswerIco_rightObjectIsReturned() {

        AresOdpovedi odpovedi = aresClient.getAresResponse("src/test/resources/answerIco.xml", new AresDotazy());

        List<Odpoved> odpovedList = odpovedi.getOdpoved();
        Odpoved odpoved = odpovedList.get(0);
        List<Zaznam> zaznamList = odpoved.getZaznam();
        Zaznam zaznam1 = zaznamList.get(0);

        assertThat(zaznamList.size(), equalTo(1));
        assertThat(zaznam1.getObchodniFirma(), equalTo("Asseco Central Europe, a.s."));
        assertThat(zaznam1.getICO(), equalTo("27074358"));

    }

    @Test
    void getAresResponse_fromSavedXmlAnswerCompanyName_rightObjectIsReturned() {

        AresOdpovedi odpovedi = aresClient.getAresResponse("src/test/resources/answerCompanyName.xml", new AresDotazy());

        List<Odpoved> odpovedList = odpovedi.getOdpoved();
        Odpoved odpoved = odpovedList.get(0);
        List<Zaznam> zaznamList = odpoved.getZaznam();
        Zaznam zaznam1 = zaznamList.get(0);

        assertThat(zaznamList.size(), equalTo(4));
        assertThat(zaznam1.getObchodniFirma(), startsWith("Etnetera"));
        assertThat(zaznam1.getObchodniFirma(), containsString("Etnetera"));
        assertThat(zaznam1.getICO(), equalTo("24133272"));

    }
}