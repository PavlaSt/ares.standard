package cz.stuchlikova.ares.application.connector;

import cz.stuchlikova.ares.application.configuration.ConfigProperties;
import cz.stuchlikova.ares.application.stub.rzp.AresDotazy;
import cz.stuchlikova.ares.application.stub.rzp.AresOdpovedi;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXB;
import java.io.StringReader;


@Component
public class AresRzpClientImpl extends ClientBase implements AresClient<AresOdpovedi, AresDotazy> {

    final ConfigProperties properties;

    public AresRzpClientImpl(ConfigProperties properties) {
        this.properties = properties;
    }

    @Override
    public AresOdpovedi getAresResponse(AresDotazy request) {
        String url = properties.getRzpProperties().getUrl();
        String xmlRequest = marshalInputToXml(request);
        String xmlResult = sendSourceReceiveResult(url, xmlRequest);
        return unmarshalStringToObjectRZP(xmlResult);
    }

    private AresOdpovedi unmarshalStringToObjectRZP(String xmlResult) {
        return JAXB.unmarshal(new StringReader(xmlResult), AresOdpovedi.class);
    }

}