package cz.stuchlikova.ares.application.connector;

import cz.stuchlikova.ares.application.stub.standard.AresDotazy;
import cz.stuchlikova.ares.application.stub.standard.AresOdpovedi;

public interface AresClient {
    AresOdpovedi getAresResponse(AresDotazy request);
    cz.stuchlikova.ares.application.stub.rzp.AresOdpovedi getAresResponse(cz.stuchlikova.ares.application.stub.rzp.AresDotazy request);
}


interface AresClientP<O,D>{
    O getAresResponse(D dotazy);
}

class AresClientImplP implements AresClientP<AresOdpovedi, AresDotazy>{
    public AresOdpovedi getAresResponse(AresDotazy dotazy){
        return new AresOdpovedi();
    }
}

class AresClientRZPImpl implements AresClientP<cz.stuchlikova.ares.application.stub.rzp.AresOdpovedi, cz.stuchlikova.ares.application.stub.rzp.AresDotazy>{
    public cz.stuchlikova.ares.application.stub.rzp.AresOdpovedi getAresResponse(cz.stuchlikova.ares.application.stub.rzp.AresDotazy dotazy){
        return new cz.stuchlikova.ares.application.stub.rzp.AresOdpovedi();
    }
}