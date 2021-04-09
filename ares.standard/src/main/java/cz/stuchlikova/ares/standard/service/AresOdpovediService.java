package cz.stuchlikova.ares.standard.service;

import cz.stuchlikova.ares.standard.dto.AresResponseDto;
import cz.stuchlikova.ares.standard.repository.AresResponseRepository;
import cz.stuchlikova.ares.standard.stub.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBException;
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
    private Transformation transformation;

    @Autowired
    private AresResponseRepository repository;

    public AresOdpovediService() {
        objectFactory = new ObjectFactory();
        transformation = new Transformation();
    }

    public List<AresResponseDto> getDtoResponseByIco(String ico) throws DatatypeConfigurationException, JAXBException {

        List<Odpoved> responses = getResponseByIco(ico);
        return transformation.transformResponseToDto(responses);
    }

    public List<AresResponseDto> getDtoResponseByFirmName(String firmName) throws DatatypeConfigurationException, JAXBException {

        List<Odpoved> responses = getResponseByFirmName(firmName);
        return transformation.transformResponseToDto(responses);
    }


    private List<Odpoved> getResponseByIco(String ico) throws DatatypeConfigurationException, JAXBException {

        KlicovePolozky polozky = objectFactory.createKlicovePolozky();
        polozky.setICO(ico);
        return repository.getAresResponse(createAresDotazy(polozky));
    }

    private List<Odpoved> getResponseByFirmName(String firmName) throws DatatypeConfigurationException, JAXBException {

        KlicovePolozky polozky = objectFactory.createKlicovePolozky();
        polozky.setObchodniFirma(firmName);
        return repository.getAresResponse(createAresDotazy(polozky));
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
    }*/

    private AresDotazy createAresDotazy(KlicovePolozky polozky) throws DatatypeConfigurationException {

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
