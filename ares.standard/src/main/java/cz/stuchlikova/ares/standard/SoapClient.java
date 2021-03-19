package cz.stuchlikova.ares.standard;

import cz.stuchlikova.ares.standard.stub.AresOdpovedi;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class SoapClient extends WebServiceGatewaySupport {
    public AresOdpovedi getAresResponse(String url, Object request) {
        return (AresOdpovedi) getWebServiceTemplate().marshalSendAndReceive(url, request);
    }
}
