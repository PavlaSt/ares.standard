package cz.stuchlikova.ares.application.repository;

import cz.stuchlikova.ares.application.configuration.ConfigProperties;
import cz.stuchlikova.ares.application.connector.AresClient;
import cz.stuchlikova.ares.application.controller.Ico;
import cz.stuchlikova.ares.application.domain.AresRzpResponseDto;
import cz.stuchlikova.ares.application.service.AresRzpRequestFactory;
import cz.stuchlikova.ares.application.service.AresRzpTransformation;
import cz.stuchlikova.ares.application.stub.rzp.AresDotazy;
import cz.stuchlikova.ares.application.stub.rzp.AresOdpovedi;
import cz.stuchlikova.ares.application.stub.rzp.OdpovedRZP;
import org.springframework.stereotype.Repository;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.xml.datatype.DatatypeConfigurationException;
import java.util.List;

@Validated
@Repository
public class AresRzpRepo {


    final ConfigProperties properties;
    final AresRzpRequestFactory aresRzpRequestFactory;
    private final AresClient<AresOdpovedi, AresDotazy> client;
    private final AresRzpTransformation aresRzpTransformation;


    public AresRzpRepo(AresClient<AresOdpovedi, AresDotazy> client, ConfigProperties properties) {
        this.client = client;
        this.properties = properties;
        aresRzpRequestFactory = new AresRzpRequestFactory();
        aresRzpTransformation = new AresRzpTransformation();
    }

    public List<OdpovedRZP> getRzpResponse(@Valid Ico ico) throws DatatypeConfigurationException {
        return getOdpovedRZPList(aresRzpRequestFactory
                .createAresDotazyRZP(ico, properties.getRzpProperties().getEmail()));
    }

    public List<OdpovedRZP> getOdpovedRZPList(AresDotazy aresDotazyRZP) {
        AresOdpovedi responseRZP = client.getAresResponse(aresDotazyRZP);
        return responseRZP.getOdpoved();
    }

    public List<AresRzpResponseDto> transformResponseRzpToDto(List<OdpovedRZP> responsesRZP) {
        return aresRzpTransformation.transformResponseRzpToDto(responsesRZP);
    }
}
