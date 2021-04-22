package cz.stuchlikova.ares.application.connector;

import cz.stuchlikova.ares.application.stub.standard.AresDotazy;
import cz.stuchlikova.ares.application.stub.standard.AresOdpovedi;

public interface AresClient {
    AresOdpovedi getAresResponse(AresDotazy request);
    cz.stuchlikova.ares.application.stub.rzp.AresOdpovedi getAresResponse(cz.stuchlikova.ares.application.stub.rzp.AresDotazy request);
}
