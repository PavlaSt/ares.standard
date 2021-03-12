package cz.stuchlikova.ares.standard.controller;

import cz.stuchlikova.ares.standard.SoapClient;
import cz.stuchlikova.ares.standard.stub.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.GregorianCalendar;
import java.util.List;

@RestController


public class AresController {

    @Autowired
    private SoapClient soapClient;


    private ObjectFactory objectFactory;        // = new ObjectFactory();
    private AresDotazy aresDotazy;              // = objectFactory.createAresDotazy();
    private Dotaz dotaz;                        // = objectFactory.createDotaz();
    private KlicovePolozky polozky;            // = objectFactory.createKlicovePolozky();

    public AresController() {

        objectFactory = new ObjectFactory();
        aresDotazy = objectFactory.createAresDotazy();
        dotaz = objectFactory.createDotaz();
        polozky = objectFactory.createKlicovePolozky();

    }


    @RequestMapping(value = "/ico", method = RequestMethod.GET)
    public List<Odpoved> showResponseIco(@RequestParam String ico) throws DatatypeConfigurationException {

        //objectFactory = new ObjectFactory();

        //AresDotazy aresDotazy = objectFactory.createAresDotazy();

        setAresDotazy();


       /* //LocalDate to xmlGregorianCalendar
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
        aresDotazy.setId("ares_dotaz");*/
        //Dotaz dotaz = objectFactory.createDotaz();

//        dotaz.setPomocneID(1);
//        dotaz.setTypVyhledani(AresVyberTyp.FREE);

        //KlicovePolozky polozky = objectFactory.createKlicovePolozky();
        polozky.setICO(ico);

        dotaz.setKlicovePolozky(polozky);

        aresDotazy.getDotaz().add(dotaz);

        AresOdpovedi response = soapClient.getAresOdpovedi(
                "http://wwwinfo.mfcr.cz/cgi-bin/ares/xar.cgi", aresDotazy);

        return response.getOdpoved();


    }

    @RequestMapping(value = "/firma", method = RequestMethod.GET)
    public List<Odpoved> showResponseFirma(@RequestParam String firma) throws DatatypeConfigurationException {
        //ObjectFactory objectFactory = new ObjectFactory();

        //AresDotazy aresDotazy = objectFactory.createAresDotazy();
        setAresDotazy();
        /*
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
*/
        //Dotaz dotaz = objectFactory.createDotaz();
//        dotaz.setPomocneID(1);
//        dotaz.setTypVyhledani(AresVyberTyp.FREE);
        dotaz.setMaxPocet(100);

        //KlicovePolozky polozky = objectFactory.createKlicovePolozky();

        polozky.setObchodniFirma(firma);

        dotaz.setKlicovePolozky(polozky);

        aresDotazy.getDotaz().add(dotaz);

        AresOdpovedi response = soapClient.getAresOdpovedi(
                "http://wwwinfo.mfcr.cz/cgi-bin/ares/xar.cgi", aresDotazy);

        return response.getOdpoved();


    }

    public void setAresDotazy() throws DatatypeConfigurationException {
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
    }
}
