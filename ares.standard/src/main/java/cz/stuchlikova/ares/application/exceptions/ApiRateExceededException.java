package cz.stuchlikova.ares.application.exceptions;

import org.springframework.http.HttpStatus;

public class ApiRateExceededException extends MyAbstractException{
    public ApiRateExceededException(String message) {
        super(HttpStatus.TOO_MANY_REQUESTS, message);
    }
}
