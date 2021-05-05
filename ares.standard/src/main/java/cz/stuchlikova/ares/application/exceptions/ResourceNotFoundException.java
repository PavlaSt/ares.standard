package cz.stuchlikova.ares.application.exceptions;

import org.springframework.http.HttpStatus;

public class ResourceNotFoundException extends MyAbstractException {
    public ResourceNotFoundException(String message) {
        super(HttpStatus.NOT_EXTENDED, message);
    }
}
