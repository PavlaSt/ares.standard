package cz.stuchlikova.ares.standard;

import cz.stuchlikova.ares.standard.stub.AresDotazy;
import cz.stuchlikova.ares.standard.stub.AresOdpovedi;

public interface AresClient {
    AresOdpovedi getAresResponse(String url, AresDotazy request);
}
