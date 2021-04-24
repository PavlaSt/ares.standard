package cz.stuchlikova.ares.application.connector;

import cz.stuchlikova.ares.application.configuration.ConfigProperties;
import cz.stuchlikova.ares.application.stub.rzp.AresDotazy;
import cz.stuchlikova.ares.application.stub.rzp.AresOdpovedi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.xml.transform.StringResult;
import org.springframework.xml.transform.StringSource;

import javax.xml.bind.JAXB;
import java.io.StringReader;
import java.io.StringWriter;


@Component
@Qualifier("rzp")
public class AresRzpClientImpl extends ClientBase implements AresClientGen<AresOdpovedi, AresDotazy> {

    @Autowired
    ConfigProperties properties;

    public AresOdpovedi getAresResponse(AresDotazy request) {
        String url = properties.getUrl();
        String xmlRequest = marshalInputToXml(request);
        String xmlResult = sendSourceReceiveResult(url, xmlRequest);
        return unmarshalStringToObjectRZP(xmlResult);
    }

    private AresOdpovedi unmarshalStringToObjectRZP(String xmlResult) {
        return JAXB.unmarshal(new StringReader(xmlResult), AresOdpovedi.class);
    }

}