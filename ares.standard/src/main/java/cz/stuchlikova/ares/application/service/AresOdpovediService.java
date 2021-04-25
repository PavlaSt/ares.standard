package cz.stuchlikova.ares.application.service;

import cz.stuchlikova.ares.application.Ico;
import cz.stuchlikova.ares.application.configuration.ConfigProperties;
import cz.stuchlikova.ares.application.domain.AresRzpResponseDto;
import cz.stuchlikova.ares.application.domain.AresStandardResponseDto;
import cz.stuchlikova.ares.application.repository.AresRzpRepo;
import cz.stuchlikova.ares.application.repository.AresStandardRepo;
import cz.stuchlikova.ares.application.stub.rzp.OdpovedRZP;
import cz.stuchlikova.ares.application.stub.standard.KlicovePolozky;
import cz.stuchlikova.ares.application.stub.standard.Odpoved;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.xml.datatype.DatatypeConfigurationException;
import java.util.List;

@Service
@Validated
public class AresOdpovediService {

    private final AresStandardTransformation aresStandardTransformation;
    private final AresRzpTransformation aresRzpTransformation;
    private final AresStandardRequestFactory aresStandardRequestFactory;
    private final AresRzpRequestFactory aresRzpRequestFactory;

    @Autowired
    private AresStandardRepo standardRepo;

    @Autowired
    private AresRzpRepo rzpRepo;

    @Autowired
    ConfigProperties properties;

    public AresOdpovediService() {
        aresRzpTransformation = new AresRzpTransformation();
        aresRzpRequestFactory = new AresRzpRequestFactory();
        aresStandardRequestFactory = new AresStandardRequestFactory();
        aresStandardTransformation = new AresStandardTransformation();
    }

    public List<AresRzpResponseDto> getDtoRzpResponseByIco(@Valid Ico ico) throws DatatypeConfigurationException {
        List<OdpovedRZP> responsesRZP = getAresResponseRzp(ico);
        return aresRzpTransformation.transformResponseRzpToDto(responsesRZP);
    }

    public List<AresStandardResponseDto> getDtoResponseByIco(@Valid Ico ico) throws DatatypeConfigurationException {
        List<Odpoved> responses = getResponseByIco(ico);
        return aresStandardTransformation.transformResponseToDto(responses);
    }

    public List<AresStandardResponseDto> getDtoResponseByCompanyName(String companyName) throws DatatypeConfigurationException {
        List<Odpoved> responses = getResponseByCompanyName(companyName);
        return aresStandardTransformation.transformResponseToDto(responses);
    }

    //------------------------------------------------------------------------------------------
    private List<OdpovedRZP> getAresResponseRzp(@Valid Ico ico) throws DatatypeConfigurationException {
        return rzpRepo.getOdpovedRZPList(aresRzpRequestFactory.createAresDotazyRZP(ico));
    }

    private List<Odpoved> getResponseByIco(Ico ico) throws DatatypeConfigurationException {
        KlicovePolozky polozky = aresStandardRequestFactory.createAndSetPolozkyIco(ico);
        return standardRepo.getOdpovedList(aresStandardRequestFactory
                .createAresDotazy(polozky,
                        properties.getEmail(),
                        properties.getMaxPocet()));
    }

    private List<Odpoved> getResponseByCompanyName(String companyName) throws DatatypeConfigurationException {
        KlicovePolozky polozky = aresStandardRequestFactory.createAndSetPolozkyCompanyName(companyName);
        return standardRepo.getOdpovedList(aresStandardRequestFactory
                .createAresDotazy(polozky,
                        properties.getEmail(),
                        properties.getMaxPocet()));
    }
}
