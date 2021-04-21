package cz.stuchlikova.ares.application.service;

import cz.stuchlikova.ares.application.domain.AresResponseDto;
import cz.stuchlikova.ares.application.domain.AresResponseRzpDto;
import cz.stuchlikova.ares.application.repository.AresStandardRepo;
import cz.stuchlikova.ares.application.stub.standard.KlicovePolozky;
import cz.stuchlikova.ares.application.stub.standard.Odpoved;
import cz.stuchlikova.ares.application.stub.rzp.OdpovedRZP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.datatype.DatatypeConfigurationException;
import java.util.List;

@Service
public class AresOdpovediService {

    private final Transformation transformation;
    private final TransformationRzp transformationRzp;
    private final RequestFactory requestFactory;
    private final RequestRzpFactory requestRzpFactory;

    @Autowired
    private AresStandardRepo repository;

    public AresOdpovediService() {
        transformationRzp = new TransformationRzp();
        requestRzpFactory = new RequestRzpFactory();
        requestFactory = new RequestFactory();
        transformation = new Transformation();
    }

    public List<AresResponseRzpDto> getAresResponseRzpDto(String ico) throws DatatypeConfigurationException {
        List<OdpovedRZP> responsesRZP = getAresResponseRzp(ico);
        return transformationRzp.transformResponseRzpToDto(responsesRZP);
    }

    public List<AresResponseDto> getDtoResponseByIco(String ico) throws DatatypeConfigurationException {
        List<Odpoved> responses = getResponseByIco(ico);
        if (responses.get(0).getPocetZaznamu() == 0) {
            throw new RecordNotFoundException("There are no records for this query");
        }
        return transformation.transformResponseToDto(responses);
    }

    public List<AresResponseDto> getDtoResponseByCompanyName(String companyName) throws DatatypeConfigurationException {
        List<Odpoved> responses = getResponseByCompanyName(companyName);
        return transformation.transformResponseToDto(responses);
    }

    //------------------------------------------------------------------------------------------
    private List<OdpovedRZP> getAresResponseRzp(String ico) throws DatatypeConfigurationException {
        return repository.getOdpovedRZPList(requestRzpFactory.createAresDotazyRZP(ico));
    }

    private List<Odpoved> getResponseByIco(String ico) throws DatatypeConfigurationException {
        //create polozky
        KlicovePolozky polozky = requestFactory.createAndSetPolozkyIco(ico);
        //create request and send to Ares SOAP WS
        return repository.getOdpovedList(requestFactory.createAresDotazy(polozky));
    }

    private List<Odpoved> getResponseByCompanyName(String companyName) throws DatatypeConfigurationException {
        KlicovePolozky polozky = requestFactory.createAndSetPolozkyCompanyName(companyName);
        return repository.getOdpovedList(requestFactory.createAresDotazy(polozky));
    }


}
