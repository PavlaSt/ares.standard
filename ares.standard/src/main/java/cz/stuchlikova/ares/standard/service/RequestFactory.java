package cz.stuchlikova.ares.standard.service;

import cz.stuchlikova.ares.standard.stub.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.GregorianCalendar;

@Component
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "request")
public class RequestFactory {

    private final ObjectFactory objectFactory;
    String email = "stuchlikova.pavla@post.cz";
    Integer maxPocet = 200;

    public RequestFactory() {
        this.objectFactory = new ObjectFactory();
    }

    public String getEmail() {
        return email;
    }

    public Integer getMaxPocet() {
        return maxPocet;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMaxPocet(Integer maxPocet) {
        this.maxPocet = maxPocet;
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
        aresDotazy.setUserMail(email);
        aresDotazy.setAnswerNamespaceRequired("http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_answer/v_1.0.1");
        aresDotazy.setId("ares_dotaz");

        dotaz.setPomocneID(1);
        dotaz.setTypVyhledani(AresVyberTyp.FREE);
        dotaz.setMaxPocet(maxPocet);
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
