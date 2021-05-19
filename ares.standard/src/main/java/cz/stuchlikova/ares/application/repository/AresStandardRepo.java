package cz.stuchlikova.ares.application.repository;

import cz.stuchlikova.ares.application.configuration.ConfigProperties;
import cz.stuchlikova.ares.application.connector.AresClient;
import cz.stuchlikova.ares.application.controller.Firma;
import cz.stuchlikova.ares.application.controller.Ico;
import cz.stuchlikova.ares.application.domain.AresStandardResponseDto;
import cz.stuchlikova.ares.application.service.CallCounter;
import cz.stuchlikova.ares.application.stub.standard.AresDotazy;
import cz.stuchlikova.ares.application.stub.standard.AresOdpovedi;
import cz.stuchlikova.ares.application.stub.standard.KlicovePolozky;
import cz.stuchlikova.ares.application.stub.standard.Odpoved;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Validated
@Repository
public class AresStandardRepo {

    final CallCounter callCounter;
    final ConfigProperties properties;
    final AresStandardRequestFactory aresStandardRequestFactory;
    private final AresClient<AresOdpovedi, AresDotazy> client;
    private final AresStandardTransformation aresStandardTransformation;

    public AresStandardRepo(CallCounter callCounter, AresClient<AresOdpovedi, AresDotazy> client, ConfigProperties properties) {
        this.callCounter = callCounter;
        this.client = client;
        this.properties = properties;
        this.aresStandardRequestFactory = new AresStandardRequestFactory();
        this.aresStandardTransformation = new AresStandardTransformation();
    }

    @Cacheable("responses-by-ico")
    public List<AresStandardResponseDto> getResponseByIco(Ico ico) {
        callCounter.checkOrThrow();
        KlicovePolozky polozky = aresStandardRequestFactory.createAndSetPolozkyIco(ico);
        AresDotazy aresDotazy = createRequest(polozky);
        List<Odpoved> responses = getOdpovedList(aresDotazy);
        return aresStandardTransformation.transformResponseToDto(responses);
    }

    @Cacheable("responses-by-company")
    public List<AresStandardResponseDto> getResponseByCompanyName(Firma companyName) {
        callCounter.checkOrThrow();
        KlicovePolozky polozky = aresStandardRequestFactory.createAndSetPolozkyCompanyName(companyName);
        AresDotazy aresDotazy = createRequest(polozky);
        List<Odpoved> responses = getOdpovedList(aresDotazy);
        return aresStandardTransformation.transformResponseToDto(responses);
    }

    public AresDotazy createRequest(KlicovePolozky polozky) {
        return aresStandardRequestFactory
                .createAresDotazy(polozky,
                        properties.getStandardProperties().getEmail(),
                        properties.getStandardProperties().getMaxPocet());

    }

    public List<Odpoved> getOdpovedList(AresDotazy aresDotazy) {
        AresOdpovedi response = client.getAresResponse(aresDotazy);
        return response.getOdpoved();
    }

}
