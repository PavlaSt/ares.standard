package cz.stuchlikova.ares.application;

import cz.stuchlikova.ares.application.stub.AresDotazy;
import cz.stuchlikova.ares.application.stub.AresOdpovedi;

public interface AresClient {
    AresOdpovedi getAresResponse(AresDotazy request);
}
