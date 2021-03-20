package cz.stuchlikova.ares.standard.controller;

import cz.stuchlikova.ares.standard.dto.AresResponseDto;
import cz.stuchlikova.ares.standard.service.AresOdpovediService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.datatype.DatatypeConfigurationException;
import java.util.List;

@RestController


public class AresController {

    @Autowired
    private AresOdpovediService service;

    @RequestMapping(value = "/ico", method = RequestMethod.GET)
    public List<AresResponseDto> getResponseByIco(@RequestParam String ico) throws DatatypeConfigurationException {
        return service.getDtoResponseByIco(ico);
    }

    @RequestMapping(value = "/firma", method = RequestMethod.GET)
    public List<AresResponseDto> getResponseByFirmName(@RequestParam String firma) throws DatatypeConfigurationException {
        return service.getDtoResponseByFirmName(firma);
    }

}
