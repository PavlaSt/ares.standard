package cz.stuchlikova.ares.application.service;

import cz.stuchlikova.ares.application.controller.Ico;
import cz.stuchlikova.ares.application.domain.AresRzpResponseDto;
import cz.stuchlikova.ares.application.domain.AresStandardResponseDto;
import cz.stuchlikova.ares.application.exceptions.RecordNotFoundException;
import cz.stuchlikova.ares.application.exceptions.ResourceNotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.validation.ConstraintViolationException;
import javax.xml.datatype.DatatypeConfigurationException;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsStringIgnoringCase;
import static org.hamcrest.Matchers.equalTo;

@SpringBootTest
class AresServiceTest {

    @Autowired
    AresService service;

    /*getDtoResponseByIco*/
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

    @Test
    void getDtoResponseByIco_non_existing_file() {
        Assertions.assertThrows(ResourceNotFoundException.class, () -> {
            List<AresStandardResponseDto> dtos = service.getDtoResponseByIco(new Ico("87654321"));
        });
    }

    @Test
    void getDtoResponseByIco_bad_input() {
        Assertions.assertThrows(ConstraintViolationException.class, () -> {
            List<AresStandardResponseDto> dtos = service.getDtoResponseByIco(new Ico("bad_input"));
        });
    }

    /*getDtoResponseByCompanyName*/
    @Test
    void getDtoResponseByCompanyName_happy_path() throws DatatypeConfigurationException {
        List<AresStandardResponseDto> dtos = service.getDtoResponseByCompanyName("Etnetera");

        assertThat(dtos.size(), equalTo(4));
        assertThat(dtos.get(0).getObchodniFirma(), containsStringIgnoringCase("Etnetera"));
        assertThat(dtos.get(0).getIco(), equalTo("24133272"));
    }

    @Test
    void getDtoResponseByCompanyName_non_existing() {
        Assertions.assertThrows(RecordNotFoundException.class, () -> {
            List<AresStandardResponseDto> dtos = service.getDtoResponseByCompanyName("QQQQQ");
        });
    }

    /*getDtoRzpResponseByIco*/
    @Test
    void getDtoRzpResponseByIco_happy_path() throws DatatypeConfigurationException {
        List<AresRzpResponseDto> dtos = service.getDtoRzpResponseByIco(new Ico("27074358"));

        assertThat(dtos.get(0).getZivnosti().size(), equalTo(26));
        assertThat(dtos.get(0).getZivnosti().get(0).getPredmetPodnikani(), containsStringIgnoringCase("Výroba, obchod a služby neuvedené v přílohách 1 až 3 živnostenského zákona"));
        assertThat(dtos.get(0).getObchodniFirma(), equalTo("Asseco Central Europe, a.s."));
        assertThat(dtos.get(0).getIco(), equalTo("27074358"));
    }

    @Test
    void getDtoRzpResponseByIco_non_existing() {
        Assertions.assertThrows(RecordNotFoundException.class, () -> {
            List<AresRzpResponseDto> dtos = service.getDtoRzpResponseByIco(new Ico ("12345678"));
        });
    }

    @Test
    void getDtoRzpResponseByIco_bad_input() {
        Assertions.assertThrows(ConstraintViolationException.class, () -> {
            List<AresRzpResponseDto> dtos = service.getDtoRzpResponseByIco(new Ico ("bad_input"));
        });
    }

}