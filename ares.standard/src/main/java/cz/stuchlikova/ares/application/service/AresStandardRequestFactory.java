package cz.stuchlikova.ares.application.service;

import cz.stuchlikova.ares.application.controller.Firma;
import cz.stuchlikova.ares.application.controller.Ico;
import cz.stuchlikova.ares.application.exceptions.ChangeToXmlGregCalendarFailedException;
import cz.stuchlikova.ares.application.stub.standard.*;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.GregorianCalendar;

public class AresStandardRequestFactory {

    private final ObjectFactory objectFactory;

    public AresStandardRequestFactory() {
        this.objectFactory = new ObjectFactory();
    }

    public AresDotazy createAresDotazy(KlicovePolozky polozky, String email, Integer maxPocet) {

        AresDotazy aresDotazy = objectFactory.createAresDotazy();
        Dotaz dotaz = objectFactory.createDotaz();

        //LocalDate to xmlGregorianCalendar
        LocalDate date = LocalDate.now();
        GregorianCalendar gcal = GregorianCalendar.from(date.atStartOfDay(ZoneId.systemDefault()));

        XMLGregorianCalendar xcal;
        try {
            xcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
        } catch (DatatypeConfigurationException e) {
            throw new ChangeToXmlGregCalendarFailedException("Conversion of GregorianCalendar data type to " +
                    "XmlGregorianCalendar failed" + e.getMessage());
        }

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

    public KlicovePolozky createAndSetPolozkyIco(Ico ico) {
        KlicovePolozky polozky = objectFactory.createKlicovePolozky();
        polozky.setICO(ico.getValue());
        return polozky;
    }

    public KlicovePolozky createAndSetPolozkyCompanyName(Firma companyName) {
        KlicovePolozky polozky = objectFactory.createKlicovePolozky();
        polozky.setObchodniFirma(companyName.getValue());
        return polozky;
    }

}
