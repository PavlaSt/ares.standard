package cz.stuchlikova.ares.application.controller;

import cz.stuchlikova.ares.application.domain.AresResponseDto;
import cz.stuchlikova.ares.application.service.AresOdpovediService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import javax.xml.datatype.DatatypeConfigurationException;
import java.util.List;

@RestController
@Validated

public class AresController {

    @Autowired
    private AresOdpovediService service;

    @RequestMapping(value = "/ico", method = RequestMethod.GET)
    public List<AresResponseDto> getResponseByIco(@Valid @Pattern(regexp = "[0-9]{8}", message = "ICO must be of 8 digit")
                                                      @RequestParam("ico") String ico)
            throws DatatypeConfigurationException{
        return service.getDtoResponseByIco(ico);
    }

    @RequestMapping(value = "/firma", method = RequestMethod.GET)
    public List<AresResponseDto> getResponseByFirmName(@RequestParam String firma) throws DatatypeConfigurationException {
        return service.getDtoResponseByCompanyName(firma);
    }

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<String> onValidationError(Exception ex) {
        //return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>("Something happened: " + ex.getMessage(), HttpStatus.BAD_REQUEST);
        //return new ResponseEntity<>(new ApiErrors(message, errors), HttpStatus.BAD_REQUEST);
    }

}
