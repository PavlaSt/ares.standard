package cz.stuchlikova.ares.application.service;

public class RecordNotFoundException extends RuntimeException  {
    public RecordNotFoundException(String message) {
        super(message);
    }

}
