package cz.stuchlikova.ares.application.service;

import cz.stuchlikova.ares.application.domain.AresStandardResponseDto;
import cz.stuchlikova.ares.application.domain.AresRzpResponseDto;
import cz.stuchlikova.ares.application.exceptions.RecordNotFoundException;
import cz.stuchlikova.ares.application.repository.AresRzpRepo;
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

    private final AresStandardTransformation aresStandardTransformation;
    private final AresRzpTransformation aresRzpTransformation;
    private final AresStandardRequestFactory aresStandardRequestFactory;
    private final RequestRzpFactory requestRzpFactory;

    @Autowired
    private AresStandardRepo standardRepo;

    @Autowired
    private AresRzpRepo rzpRepo;

    public AresOdpovediService() {
        aresRzpTransformation = new AresRzpTransformation();
        requestRzpFactory = new RequestRzpFactory();
        aresStandardRequestFactory = new AresStandardRequestFactory();
        aresStandardTransformation = new AresStandardTransformation();
    }

    public List<AresRzpResponseDto> getAresResponseRzpDto(String ico) throws DatatypeConfigurationException {
        List<OdpovedRZP> responsesRZP = getAresResponseRzp(ico);
        return aresRzpTransformation.transformResponseRzpToDto(responsesRZP);
    }

    public List<AresStandardResponseDto> getDtoResponseByIco(String ico) throws DatatypeConfigurationException {
        List<Odpoved> responses = getResponseByIco(ico);
        if (responses.get(0).getPocetZaznamu() == 0) {
            throw new RecordNotFoundException("There are no records for this query");
        }
        return aresStandardTransformation.transformResponseToDto(responses);
    }

    public List<AresStandardResponseDto> getDtoResponseByCompanyName(String companyName) throws DatatypeConfigurationException {
        List<Odpoved> responses = getResponseByCompanyName(companyName);
        return aresStandardTransformation.transformResponseToDto(responses);
    }

    //------------------------------------------------------------------------------------------
    private List<OdpovedRZP> getAresResponseRzp(String ico) throws DatatypeConfigurationException {
        return rzpRepo.getOdpovedRZPList(requestRzpFactory.createAresDotazyRZP(ico));
        //return standardRepo.getOdpovedRZPList(requestRzpFactory.createAresDotazyRZP(ico));
    }

    private List<Odpoved> getResponseByIco(String ico) throws DatatypeConfigurationException {
        //create polozky
        KlicovePolozky polozky = aresStandardRequestFactory.createAndSetPolozkyIco(ico);
        //create request and send to Ares SOAP WS
        return standardRepo.getOdpovedList(aresStandardRequestFactory.createAresDotazy(polozky));
    }

    private List<Odpoved> getResponseByCompanyName(String companyName) throws DatatypeConfigurationException {
        KlicovePolozky polozky = aresStandardRequestFactory.createAndSetPolozkyCompanyName(companyName);
        return standardRepo.getOdpovedList(aresStandardRequestFactory.createAresDotazy(polozky));
    }


}
