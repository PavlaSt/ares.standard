package cz.stuchlikova.ares.application.connector;

import cz.stuchlikova.ares.application.configuration.ConfigProperties;
import cz.stuchlikova.ares.application.stub.standard.AresDotazy;
import cz.stuchlikova.ares.application.stub.standard.AresOdpovedi;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXB;
import java.io.StringReader;

@Component
public class AresStandardClientImpl extends ClientBase implements AresClient<AresOdpovedi, AresDotazy> {

    final ConfigProperties properties;

    public AresStandardClientImpl(ConfigProperties properties) {
        this.properties = properties;
    }

    @Override
    public AresOdpovedi getAresResponse(AresDotazy request) {
        String url = properties.getStandardProperties().getUrl();
        String xmlRequest = marshalInputToXml(request);
        String xmlResult = sendSourceReceiveResult(url, xmlRequest);
        return unmarshalStringToObject(xmlResult);
    }

    private AresOdpovedi unmarshalStringToObject(String xmlResult) {
        return JAXB.unmarshal(new StringReader(xmlResult), AresOdpovedi.class);
    }
}