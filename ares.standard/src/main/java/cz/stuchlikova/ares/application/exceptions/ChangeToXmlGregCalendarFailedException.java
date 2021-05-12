package cz.stuchlikova.ares.application.exceptions;

import org.springframework.http.HttpStatus;

public class ChangeToXmlGregCalendarFailedException extends MyAbstractException {

    public ChangeToXmlGregCalendarFailedException(String message) {
        super(HttpStatus.NOT_EXTENDED, message);
    }
}
