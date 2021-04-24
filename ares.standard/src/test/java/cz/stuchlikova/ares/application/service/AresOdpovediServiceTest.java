package cz.stuchlikova.ares.application.service;

import cz.stuchlikova.ares.application.Ico;
import cz.stuchlikova.ares.application.domain.AresStandardResponseDto;
import cz.stuchlikova.ares.application.exceptions.RecordNotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.ConstraintViolationException;
import javax.xml.datatype.DatatypeConfigurationException;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@SpringBootTest
class AresOdpovediServiceTest {

    @Autowired
    AresOdpovediService service;

    @Test
    void getDtoResponseByIco_happy_path() throws DatatypeConfigurationException {
        List<AresStandardResponseDto> dtos = service.getDtoResponseByIco(new Ico("27074358"));

        assertThat(dtos.size(), equalTo(1));
        assertThat(dtos.get(0).getObchodniFirma(), equalTo("Asseco Central Europe, a.s."));
        assertThat(dtos.get(0).getIco(), equalTo("27074358"));
    }

    @Test
    void getDtoResponseByIco_non_existing() {

        Assertions.assertThrows(RecordNotFoundException.class, () -> {
            List<AresStandardResponseDto> dtos = service.getDtoResponseByIco(new Ico("12345678"));
        });

    }

    //TODO
    @Test
    void getDtoResponseByIco_bad_input() {

        Assertions.assertThrows(ConstraintViolationException.class, () -> {
            List<AresStandardResponseDto> dtos = service.getDtoResponseByIco(new Ico("bad_input"));
        });
    }

    @Test
    void getDtoResponseByCompanyName() throws DatatypeConfigurationException {
        List<AresStandardResponseDto> dtos = service.getDtoResponseByCompanyName("Etnetera");

        assertThat(dtos.size(), equalTo(4));
        assertThat(dtos.get(0).getObchodniFirma(), containsStringIgnoringCase("Etnetera"));
        assertThat(dtos.get(0).getIco(), equalTo("24133272"));
    }

}