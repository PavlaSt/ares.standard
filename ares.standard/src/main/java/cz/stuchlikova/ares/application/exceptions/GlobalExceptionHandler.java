package cz.stuchlikova.ares.application.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.validation.ConstraintViolationException;
import java.io.FileNotFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<String> onValidationError(Exception ex) {
        return new ResponseEntity<>("Something happened: " + ex.getMessage(), HttpStatus.NOT_ACCEPTABLE);
    }

    @ExceptionHandler(MyAbstractException.class)
    public ResponseEntity<String> fileNotFoundError(MyAbstractException ex) {
        return new ResponseEntity<>("Something happened: " + ex.getMessage(),
                ex.getDescription().getStatus());
    }

}
