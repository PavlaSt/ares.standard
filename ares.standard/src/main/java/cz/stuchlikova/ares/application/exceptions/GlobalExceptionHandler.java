package cz.stuchlikova.ares.application.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.validation.ConstraintViolationException;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<MyAbstractException.ErrorDescription> onValidationError(Exception ex) {
        return new ResponseEntity<>(new MyAbstractException.ErrorDescription(HttpStatus.NOT_ACCEPTABLE, ex.getMessage()), HttpStatus.NOT_ACCEPTABLE);
    }

    @ExceptionHandler(MyAbstractException.class)
    public ResponseEntity<MyAbstractException.ErrorDescription> fileNotFoundError(MyAbstractException ex) {
        return new ResponseEntity<>(ex.getErrorDescription(),
                ex.getErrorDescription().getStatus());
    }

}
