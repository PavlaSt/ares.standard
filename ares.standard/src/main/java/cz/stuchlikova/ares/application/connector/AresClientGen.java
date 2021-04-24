package cz.stuchlikova.ares.application.connector;

public interface AresClientGen<O,D>{
    O getAresResponse(D dotazy);
}
