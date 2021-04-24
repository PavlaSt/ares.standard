package cz.stuchlikova.ares.application.connector;


import cz.stuchlikova.ares.application.stub.rzp.AresOdpovedi;
import cz.stuchlikova.ares.application.stub.rzp.AresDotazy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXB;
import java.io.StringReader;

@Component
@Primary
@Qualifier("rzp")
public class AresRzpClientTestImpl implements AresClient<AresOdpovedi, AresDotazy> {


    @Override
    public AresOdpovedi getAresResponse(AresDotazy dotazy) {
        return null;
    }

    private AresOdpovedi unmarshalStringToObjectRZP(String xmlResult) {
        return JAXB.unmarshal(new StringReader(xmlResult), AresOdpovedi.class);
    }
}
