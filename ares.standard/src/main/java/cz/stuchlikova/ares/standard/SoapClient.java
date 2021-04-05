package cz.stuchlikova.ares.standard;

import cz.stuchlikova.ares.standard.stub.AresDotazy;
import cz.stuchlikova.ares.standard.stub.AresOdpovedi;

import javax.xml.bind.JAXBException;

public interface SoapClient {
    AresOdpovedi getAresResponse(String url, AresDotazy request) throws JAXBException;
}
