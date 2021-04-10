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
import java.util.GregorianCalendar;
import java.util.List;

@Service
public class AresOdpovediService {

    //private final ObjectFactory objectFactory;
    private final Transformation transformation;
    private final RequestCreator creator;

    @Autowired
    private AresResponseRepository repository;

    public AresOdpovediService() {
        creator = new RequestCreator();
        //objectFactory = new ObjectFactory();
        transformation = new Transformation();
    }
    //nemůže být ve fieldu, protože pro každý dotaz se musí vytvořit znovu
    //AresDotazy aresDotazy = objectFactory.createAresDotazy();
    //Dotaz dotaz = objectFactory.createDotaz();

    public List<AresResponseDto> getDtoResponseByIco(String ico) throws DatatypeConfigurationException {


        List<Odpoved> responses = getResponseByIco(ico);
        return transformation.transformResponseToDto(responses);
    }

    public List<AresResponseDto> getDtoResponseByFirmName(String firmName) throws DatatypeConfigurationException {

        List<Odpoved> responses = getResponseByCompanyName(firmName);
        return transformation.transformResponseToDto(responses);
    }


    private List<Odpoved> getResponseByIco(String ico) throws DatatypeConfigurationException {
        //create polozky
        KlicovePolozky polozky = creator.createAndSetPolozkyIco(ico);
        //create request and send to Ares SOAP WS
        return repository.getAresResponse(creator.createAresDotazy(polozky));
    }

    private List<Odpoved> getResponseByCompanyName(String companyName) throws DatatypeConfigurationException {

        KlicovePolozky polozky = creator.createAndSetPolozkyCompanyName(companyName);
        return repository.getAresResponse(creator.createAresDotazy(polozky));
    }


    /*private AresDotazy createAresDotazy(KlicovePolozky polozky) throws DatatypeConfigurationException {

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
*/
}
