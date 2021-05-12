package cz.stuchlikova.ares.application.repository;

import cz.stuchlikova.ares.application.configuration.ConfigProperties;
import cz.stuchlikova.ares.application.connector.AresClient;
import cz.stuchlikova.ares.application.controller.Firma;
import cz.stuchlikova.ares.application.controller.Ico;
import cz.stuchlikova.ares.application.domain.AresStandardResponseDto;
import cz.stuchlikova.ares.application.service.AresStandardRequestFactory;
import cz.stuchlikova.ares.application.service.AresStandardTransformation;
import cz.stuchlikova.ares.application.stub.standard.AresDotazy;
import cz.stuchlikova.ares.application.stub.standard.AresOdpovedi;
import cz.stuchlikova.ares.application.stub.standard.KlicovePolozky;
import cz.stuchlikova.ares.application.stub.standard.Odpoved;
import org.springframework.stereotype.Repository;
import org.springframework.validation.annotation.Validated;

import javax.xml.datatype.DatatypeConfigurationException;
import java.util.List;

@Validated
@Repository
public class AresStandardRepo {

    final ConfigProperties properties;
    final AresStandardRequestFactory aresStandardRequestFactory;
    private final AresClient<AresOdpovedi, AresDotazy> client;
    private final AresStandardTransformation aresStandardTransformation;

    public AresStandardRepo(AresClient<AresOdpovedi, AresDotazy> client, ConfigProperties properties) {
        this.client = client;
        this.properties = properties;
        this.aresStandardRequestFactory = new AresStandardRequestFactory();
        this.aresStandardTransformation = new AresStandardTransformation();
    }


    public List<Odpoved> getResponseByIco(Ico ico) throws DatatypeConfigurationException {
        KlicovePolozky polozky = aresStandardRequestFactory.createAndSetPolozkyIco(ico);
        return getOdpovedList(aresStandardRequestFactory
                .createAresDotazy(polozky,
                        properties.getStandardProperties().getEmail(),
                        properties.getStandardProperties().getMaxPocet()));
    }


    public List<Odpoved> getResponseByCompanyName(Firma companyName) throws DatatypeConfigurationException {
        KlicovePolozky polozky = aresStandardRequestFactory.createAndSetPolozkyCompanyName(companyName);
        return getOdpovedList(aresStandardRequestFactory
                .createAresDotazy(polozky,
                        properties.getStandardProperties().getEmail(),
                        properties.getStandardProperties().getMaxPocet()));
    }

    public List<Odpoved> getOdpovedList(AresDotazy aresDotazy) {
        AresOdpovedi response = client.getAresResponse(aresDotazy);
        return response.getOdpoved();
    }

    public List<AresStandardResponseDto> transformResponseToDto(List<Odpoved> responses) {
        return aresStandardTransformation.transformResponseToDto(responses);
    }
}
