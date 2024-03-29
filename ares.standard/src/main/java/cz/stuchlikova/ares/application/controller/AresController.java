package cz.stuchlikova.ares.application.controller;

import cz.stuchlikova.ares.application.domain.AresRzpResponseDto;
import cz.stuchlikova.ares.application.domain.AresStandardResponseDto;
import cz.stuchlikova.ares.application.service.AresService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@Validated

public class AresController {

    private final AresService service;

    public AresController(AresService service) {
        this.service = service;
    }

    @RequestMapping(value = "/predmet", method = RequestMethod.GET)
    public List<AresRzpResponseDto> getRzpResponseByIco(@Valid @RequestParam("ico") Ico ico) {
        ico.checkControlAlghorithm();
        return service.getDtoRzpResponseByIco(ico);
    }

    @RequestMapping(value = "/ico", method = RequestMethod.GET)
    public List<AresStandardResponseDto> getResponseByIco(@Valid @RequestParam("ico") Ico ico) {
        ico.checkControlAlghorithm();
        return service.getDtoResponseByIco(ico);
    }

    @RequestMapping(value = "/firma", method = RequestMethod.GET)
    public List<AresStandardResponseDto> getResponseByFirmName(@Valid @RequestParam Firma firma) {
        return service.getDtoResponseByCompanyName(firma);
    }
}
