package cz.stuchlikova.ares.application.exceptions;

import org.springframework.http.HttpStatus;

public class RecordNotFoundException extends MyAbstractException  {
    public RecordNotFoundException(String message) {
        super(HttpStatus.NOT_FOUND, message);

    }

}
