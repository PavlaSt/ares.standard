package cz.stuchlikova.ares.application.exceptions;

import org.springframework.http.HttpStatus;

public class MaxNumberExceeded extends MyAbstractException{
    public MaxNumberExceeded(String message) {
        super(HttpStatus.TOO_MANY_REQUESTS, message);
    }
}
