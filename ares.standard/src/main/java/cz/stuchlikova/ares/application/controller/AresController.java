package cz.stuchlikova.ares.application.controller;

import cz.stuchlikova.ares.application.domain.AresStandardResponseDto;
import cz.stuchlikova.ares.application.domain.AresRzpResponseDto;
import cz.stuchlikova.ares.application.service.AresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.xml.datatype.DatatypeConfigurationException;
import java.util.List;

@RestController
@Validated

public class AresController {

    @Autowired
    private AresService service;

    @RequestMapping(value = "/predmet", method = RequestMethod.GET)
    public List<AresRzpResponseDto> getScopeOfBussiness(@Valid @RequestParam("ico") Ico ico)
            throws DatatypeConfigurationException{
        return service.getDtoRzpResponseByIco(ico);
    }

    @RequestMapping(value = "/ico", method = RequestMethod.GET)
    public List<AresStandardResponseDto> getResponseByIco(@Valid @RequestParam("ico") Ico ico)
            throws DatatypeConfigurationException {
        return service.getDtoResponseByIco(ico);
    }

    @RequestMapping(value = "/firma", method = RequestMethod.GET)
    public List<AresStandardResponseDto> getResponseByFirmName(@RequestParam String firma) throws DatatypeConfigurationException {
        return service.getDtoResponseByCompanyName(firma);
    }
    }
