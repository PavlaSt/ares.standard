package cz.stuchlikova.ares.application.repository;

import cz.stuchlikova.ares.application.controller.Ico;
import cz.stuchlikova.ares.application.stub.rzp.*;

import javax.validation.Valid;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.GregorianCalendar;

public class AresRzpRequestFactory {

    public AresDotazy createAresDotazyRZP(@Valid Ico ico, String email) {
        ObjectFactory objectFactory = new ObjectFactory();

        AresDotazy aresDotazy = objectFactory.createAresDotazy();

        //LocalDate to xmlGregorianCalendar
        LocalDate date = LocalDate.now();
        GregorianCalendar gcal = GregorianCalendar.from(date.atStartOfDay(ZoneId.systemDefault()));

        XMLGregorianCalendar xcal;
        try {
            xcal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gcal);
        } catch (DatatypeConfigurationException e) {
            throw new RuntimeException("Unexpected error: " + e.getMessage());
        }

        aresDotazy.setDotazDatumCas(xcal);
        aresDotazy.setDotazPocet(1);
        aresDotazy.setDotazTyp(AresDotazTyp.VYPIS_RZP);
        aresDotazy.setVystupFormat(VystupFormat.XML);
        aresDotazy.setXslt(XsltKs.KLIENT);
        aresDotazy.setValidationXSLT("http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_request_orrg/v_1.0.0/ares_request_orrg.xsl");
        aresDotazy.setUserMail(email);
        aresDotazy.setAnswerNamespaceRequired("http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_answer_rzp/v_1.0.4");
        aresDotazy.setId("Ares_dotaz");

        Dotaz dotaz = objectFactory.createDotaz();
        dotaz.setICO(ico.getValue());
        dotaz.setPomocneID(0);
        dotaz.setRozsah((short) 1);

        aresDotazy.getDotaz().add(dotaz);

        return aresDotazy;
    }

}
