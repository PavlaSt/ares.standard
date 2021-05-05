package cz.stuchlikova.ares.application.service;

import cz.stuchlikova.ares.application.configuration.ConfigProperties;
import cz.stuchlikova.ares.application.controller.Ico;
import cz.stuchlikova.ares.application.domain.AresRzpResponseDto;
import cz.stuchlikova.ares.application.domain.AresStandardResponseDto;
import cz.stuchlikova.ares.application.repository.AresRzpRepo;
import cz.stuchlikova.ares.application.repository.AresStandardRepo;
import cz.stuchlikova.ares.application.stub.rzp.OdpovedRZP;
import cz.stuchlikova.ares.application.stub.standard.KlicovePolozky;
import cz.stuchlikova.ares.application.stub.standard.Odpoved;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.xml.datatype.DatatypeConfigurationException;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
@Validated
public class AresService {

    final ConfigProperties properties;
    final AresStandardRequestFactory aresStandardRequestFactory;
    final AresRzpRequestFactory aresRzpRequestFactory;
    final AresStandardRepo standardRepo;
    private final AresStandardTransformation aresStandardTransformation;
    private final AresRzpTransformation aresRzpTransformation;
    private final AresRzpRepo rzpRepo;

    private final AtomicLong counter;

    public AresService(ConfigProperties properties, AresRzpRepo rzpRepo, AresStandardRepo standardRepo) {
        aresRzpTransformation = new AresRzpTransformation();
        aresRzpRequestFactory = new AresRzpRequestFactory();
        aresStandardRequestFactory = new AresStandardRequestFactory();
        aresStandardTransformation = new AresStandardTransformation();
        this.properties = properties;
        this.rzpRepo = rzpRepo;
        this.standardRepo = standardRepo;
        counter = new AtomicLong();
    }

    @Cacheable("rzp")
    public List<AresRzpResponseDto> getDtoRzpResponseByIco(@Valid Ico ico) throws DatatypeConfigurationException {
        long count = counter.incrementAndGet();
        if (count > 2) {
            System.out.println("exceeded limit");
        }
        List<OdpovedRZP> responsesRZP = getAresResponseRzp(ico);
        return aresRzpTransformation.transformResponseRzpToDto(responsesRZP);
    }

    @Cacheable("responses-by-ico")
    public List<AresStandardResponseDto> getDtoResponseByIco(@Valid Ico ico) throws DatatypeConfigurationException {
        System.out.println("dto");
        List<Odpoved> responses = getResponseByIco(ico);
        return aresStandardTransformation.transformResponseToDto(responses);
    }

    @Cacheable("responses-by-company")
    public List<AresStandardResponseDto> getDtoResponseByCompanyName(String companyName) throws DatatypeConfigurationException {
        List<Odpoved> responses = getResponseByCompanyName(companyName);
        return aresStandardTransformation.transformResponseToDto(responses);
    }


    private List<OdpovedRZP> getAresResponseRzp(@Valid Ico ico) throws DatatypeConfigurationException {
        return rzpRepo.getOdpovedRZPList(aresRzpRequestFactory
                .createAresDotazyRZP(ico, properties.getRzpProperties().getEmail()));
    }

    List<Odpoved> getResponseByIco(Ico ico) throws DatatypeConfigurationException {
        KlicovePolozky polozky = aresStandardRequestFactory.createAndSetPolozkyIco(ico);
        System.out.println("response");
        return standardRepo.getOdpovedList(aresStandardRequestFactory
                .createAresDotazy(polozky,
                        properties.getStandardProperties().getEmail(),
                        properties.getStandardProperties().getMaxPocet()));
    }

    private List<Odpoved> getResponseByCompanyName(String companyName) throws DatatypeConfigurationException {
        KlicovePolozky polozky = aresStandardRequestFactory.createAndSetPolozkyCompanyName(companyName);
        return standardRepo.getOdpovedList(aresStandardRequestFactory
                .createAresDotazy(polozky,
                        properties.getStandardProperties().getEmail(),
                        properties.getStandardProperties().getMaxPocet()));
    }
}
