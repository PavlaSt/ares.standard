package cz.stuchlikova.ares.application.exceptions;

import org.springframework.http.HttpStatus;

public class MyAbstractException extends RuntimeException{
    private final ErrorDescription errorDescription;

    public static class ErrorDescription {
        private final HttpStatus status;
        private final String description;

        public ErrorDescription(HttpStatus status, String description) {
            this.status = status;
            this.description = description;
        }

        public HttpStatus getStatus() {
            return status;
        }

        public String getDescription() {
            return description;
        }
    }

    public MyAbstractException(HttpStatus status, String message) {
        super(message);
        this.errorDescription = new ErrorDescription(status, message);
    }

    public ErrorDescription getErrorDescription() {
        return errorDescription;
    }
}
