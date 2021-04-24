package cz.stuchlikova.ares.application.connector;

public interface AresClient<O,D>{
    O getAresResponse(D dotazy);
}
