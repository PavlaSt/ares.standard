package cz.stuchlikova.ares.application.connector;


import cz.stuchlikova.ares.application.stub.rzp.AresDotazy;
import cz.stuchlikova.ares.application.stub.rzp.AresOdpovedi;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXB;
import java.io.InputStream;

@Component
@Primary
public class AresRzpClientTestImpl extends ClientBaseTest<AresOdpovedi> implements AresClient<AresOdpovedi, AresDotazy> {

    @Override
    public AresOdpovedi getAresResponse(AresDotazy dotazy) {

        String ico = dotazy.getDotaz().get(0).getICO();
        String url = "src/test/resources/getDtoRzpResponseByIco/ico=" + ico + ".xml";

        return openXmlFileUnmarshalToObject(url);
    }

    @Override
    AresOdpovedi unmarshalStringToObject(InputStream xmlResult) {
        return JAXB.unmarshal(xmlResult, AresOdpovedi.class);
    }
}
