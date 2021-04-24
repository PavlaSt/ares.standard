package cz.stuchlikova.ares.application.connector;

import cz.stuchlikova.ares.application.configuration.ConfigProperties;
import cz.stuchlikova.ares.application.stub.standard.AresDotazy;
import cz.stuchlikova.ares.application.stub.standard.AresOdpovedi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXB;
import java.io.StringReader;

@Component
@Qualifier("standard")
public class AresStandardClientImpl extends ClientBase implements AresClientGen<AresOdpovedi, AresDotazy> {

    @Autowired
    ConfigProperties properties;

    public AresOdpovedi getAresResponse(AresDotazy request) {
        String url = properties.getUrl();
        String xmlRequest = marshalInputToXml(request);
        String xmlResult = sendSourceReceiveResult(url, xmlRequest);
        return unmarshalStringToObject(xmlResult);
    }

    private AresOdpovedi unmarshalStringToObject(String xmlResult) {
        return JAXB.unmarshal(new StringReader(xmlResult), AresOdpovedi.class);
    }
}