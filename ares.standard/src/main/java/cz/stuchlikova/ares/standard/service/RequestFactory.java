package cz.stuchlikova.ares.standard.service;

import cz.stuchlikova.ares.standard.stub.*;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.GregorianCalendar;

public class RequestFactory {

    private final ObjectFactory objectFactory;
    private final String EMAIL = "stuchlikova.pavla@post.cz";
    private final Integer MAX_POCET = 200;

    public RequestFactory() {
        this.objectFactory = new ObjectFactory();
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
        aresDotazy.setUserMail(EMAIL);
        //aresDotazy.setUserMail("stuchlikova.pavla@post.cz");
        aresDotazy.setAnswerNamespaceRequired("http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_answer/v_1.0.1");
        aresDotazy.setId("ares_dotaz");

        dotaz.setPomocneID(1);
        dotaz.setTypVyhledani(AresVyberTyp.FREE);
        dotaz.setMaxPocet(MAX_POCET);
        //dotaz.setMaxPocet(100);
        dotaz.setKlicovePolozky(polozky);

        aresDotazy.getDotaz().add(dotaz);

        return aresDotazy;
    }

    public KlicovePolozky createAndSetPolozkyIco(String ico){
        KlicovePolozky polozky = objectFactory.createKlicovePolozky();
        polozky.setICO(ico);
        return polozky;
    }
    public KlicovePolozky createAndSetPolozkyCompanyName(String companyName){
        KlicovePolozky polozky = objectFactory.createKlicovePolozky();
        polozky.setObchodniFirma(companyName);
        return polozky;
    }

}
