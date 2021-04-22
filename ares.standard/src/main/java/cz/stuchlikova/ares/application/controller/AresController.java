package cz.stuchlikova.ares.application.controller;

import cz.stuchlikova.ares.application.Ico;
import cz.stuchlikova.ares.application.domain.AresStandardResponseDto;
import cz.stuchlikova.ares.application.domain.AresRzpResponseDto;
import cz.stuchlikova.ares.application.service.AresOdpovediService;
import cz.stuchlikova.ares.application.exceptions.RecordNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import javax.xml.datatype.DatatypeConfigurationException;
import java.util.List;

@RestController
@Validated

public class AresController {

    @Autowired
    private AresOdpovediService service;

    @RequestMapping(value = "/predmet", method = RequestMethod.GET)
    public List<AresRzpResponseDto> getScopeOfBussiness(@Valid @RequestParam("ico") Ico ico)
            throws DatatypeConfigurationException{
        return service.getAresResponseRzpDto(ico.getValue());
    }

    @RequestMapping(value = "/ico", method = RequestMethod.GET)
    public List<AresStandardResponseDto> getResponseByIco(@Valid @RequestParam("ico") Ico ico)
            throws DatatypeConfigurationException {
        return service.getDtoResponseByIco(ico.getValue());
    }

    @RequestMapping(value = "/firma", method = RequestMethod.GET)
    public List<AresStandardResponseDto> getResponseByFirmName(@RequestParam String firma) throws DatatypeConfigurationException {
        return service.getDtoResponseByCompanyName(firma);
    }
    }
