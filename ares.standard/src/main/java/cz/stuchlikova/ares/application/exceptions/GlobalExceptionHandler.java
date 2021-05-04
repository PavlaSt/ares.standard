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

    @ExceptionHandler(RecordNotFoundException.class)
    public ResponseEntity<String> notFoundError(Exception ex) {
        return new ResponseEntity<>("Something happened: " + ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(FileNotFoundException.class)
    public ResponseEntity<String> fileNotFoundError(Exception ex) {
        return new ResponseEntity<>("Something happened: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
