package cz.stuchlikova.ares.application;

import cz.stuchlikova.ares.application.stub.standard.AresDotazy;
import cz.stuchlikova.ares.application.stub.standard.AresOdpovedi;

public interface AresClient {
    AresOdpovedi getAresResponse(AresDotazy request);
}
