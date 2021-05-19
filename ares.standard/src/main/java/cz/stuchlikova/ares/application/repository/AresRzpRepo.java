package cz.stuchlikova.ares.application.repository;

import cz.stuchlikova.ares.application.configuration.ConfigProperties;
import cz.stuchlikova.ares.application.connector.AresClient;
import cz.stuchlikova.ares.application.controller.Ico;
import cz.stuchlikova.ares.application.domain.AresRzpResponseDto;
import cz.stuchlikova.ares.application.service.CallCounter;
import cz.stuchlikova.ares.application.stub.rzp.AresDotazy;
import cz.stuchlikova.ares.application.stub.rzp.AresOdpovedi;
import cz.stuchlikova.ares.application.stub.rzp.OdpovedRZP;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.List;

@Validated
@Repository
public class AresRzpRepo extends BaseAresRepo {

    final CallCounter callCounter;
    final ConfigProperties properties;
    final AresRzpRequestFactory aresRzpRequestFactory;
    private final AresClient<AresOdpovedi, AresDotazy> client;
    private final AresRzpTransformation aresRzpTransformation;


    public AresRzpRepo(CallCounter callCounter, AresClient<AresOdpovedi, AresDotazy> client, ConfigProperties properties) {
        this.callCounter = callCounter;
        this.client = client;
        this.properties = properties;
        aresRzpRequestFactory = new AresRzpRequestFactory();
        aresRzpTransformation = new AresRzpTransformation();
    }

    @Cacheable("rzp")
    public List<AresRzpResponseDto> getRzpResponse(@Valid Ico ico) {
        callCounter.checkOrThrow();
        AresDotazy aresDotazyRZP = aresRzpRequestFactory
                .createAresDotazyRZP(ico, properties.getRzpProperties().getEmail());
        List<OdpovedRZP> responsesRZP = getOdpovedRZPList(aresDotazyRZP);
        return aresRzpTransformation.transformResponseRzpToDto(responsesRZP);
    }


    public List<OdpovedRZP> getOdpovedRZPList(AresDotazy aresDotazyRZP) {
        AresOdpovedi responseRZP = client.getAresResponse(aresDotazyRZP);
        return responseRZP.getOdpoved();
    }

}
