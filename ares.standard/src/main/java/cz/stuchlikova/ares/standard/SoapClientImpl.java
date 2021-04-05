package cz.stuchlikova.ares.standard;

import cz.stuchlikova.ares.standard.stub.AresDotazy;
import cz.stuchlikova.ares.standard.stub.AresOdpovedi;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class SoapClientImpl extends WebServiceGatewaySupport implements SoapClient {
    public AresOdpovedi getAresResponse(String url, AresDotazy request) {
        return (AresOdpovedi) getWebServiceTemplate().marshalSendAndReceive(url, request);
    }
}
