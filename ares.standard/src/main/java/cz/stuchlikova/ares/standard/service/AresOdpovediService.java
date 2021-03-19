package cz.stuchlikova.ares.standard.service;

import cz.stuchlikova.ares.standard.dto.AresResponseDto;
import cz.stuchlikova.ares.standard.repository.AresResponseRepository;
import cz.stuchlikova.ares.standard.stub.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

@Service
public class AresOdpovediService {

    private final ObjectFactory objectFactory;

    @Autowired
    private AresResponseRepository repository;

    public AresOdpovediService() {
        objectFactory = new ObjectFactory();
    }

    /*public AresResponseDto getResponseByIco(List<Odpoved> responses) {
        List<Zaznam> records = new ArrayList<>();

        for (Odpoved item: responses) {
            Zaznam zaznam = item.getZaznam();

        }
    }*/

    public List<Odpoved> getResponseByIco(String ico) throws DatatypeConfigurationException {

        KlicovePolozky polozky = objectFactory.createKlicovePolozky();
        polozky.setICO(ico);
        return repository.getAresResponse(createAresDotazy(polozky));
    }

    public List<Odpoved> getResponseByFirmName(String firmName) throws DatatypeConfigurationException {

        KlicovePolozky polozky = objectFactory.createKlicovePolozky();
        polozky.setObchodniFirma(firmName);
        return repository.getAresResponse(createAresDotazy(polozky));
    }

    public AresDotazy createAresDotazy(KlicovePolozky polozky) throws DatatypeConfigurationException {

        AresDotazy aresDotazy = objectFactory.createAresDotazy();
        Dotaz dotaz = objectFactory.createDotaz();

        //LocalDate to xmlGregorianCalendar
        LocalDate date = LocalDate.now();
        GregorianCalendar gcal = GregorianCalendar.from(date.atStartOfDay(ZoneId.systemDefault()));
        XMLGregorianCalendar xcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);

        aresDotazy.setDotazDatumCas(xcal);
        aresDotazy.setDotazPocet(1);
        aresDotazy.setDotazTyp(AresDotazTyp.STANDARD);
        aresDotazy.setVystupFormat(VystupFormat.XML);
        aresDotazy.setValidationXSLT("http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_request/v_1.0.0/ares_request.xsl");
        aresDotazy.setUserMail("stuchlikova.pavla@post.cz");
        aresDotazy.setAnswerNamespaceRequired("http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_answer/v_1.0.1");
        aresDotazy.setId("ares_dotaz");

        dotaz.setPomocneID(1);
        dotaz.setTypVyhledani(AresVyberTyp.FREE);
        dotaz.setMaxPocet(100);
        dotaz.setKlicovePolozky(polozky);

        aresDotazy.getDotaz().add(dotaz);

        return aresDotazy;
    }


}
