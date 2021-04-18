package cz.stuchlikova.ares.standard.service;

import cz.stuchlikova.ares.standard.domain.AresResponseDto;
import cz.stuchlikova.ares.standard.repository.AresResponseRepository;
import cz.stuchlikova.ares.standard.stub.KlicovePolozky;
import cz.stuchlikova.ares.standard.stub.Odpoved;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.datatype.DatatypeConfigurationException;
import java.util.List;

@Service
public class AresOdpovediService {

    private final Transformation transformation;
    private final RequestFactory requestFactory;

    @Autowired
    private AresResponseRepository repository;

    public AresOdpovediService() {
        requestFactory = new RequestFactory();
        transformation = new Transformation();
    }

    public List<AresResponseDto> getDtoResponseByIco(String ico) throws DatatypeConfigurationException {
        List<Odpoved> responses = getResponseByIco(ico);
        return transformation.transformResponseToDto(responses);
    }

    public List<AresResponseDto> getDtoResponseByCompanyName(String firmName) throws DatatypeConfigurationException {
        List<Odpoved> responses = getResponseByCompanyName(firmName);
        return transformation.transformResponseToDto(responses);
    }

    //------------------------------------------------------------------------------------------


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
