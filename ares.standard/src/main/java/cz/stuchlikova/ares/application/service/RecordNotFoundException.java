package cz.stuchlikova.ares.application.service;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class RecordNotFoundException extends RuntimeException  {
    public RecordNotFoundException(String message) {
        super(message);
    }

}
