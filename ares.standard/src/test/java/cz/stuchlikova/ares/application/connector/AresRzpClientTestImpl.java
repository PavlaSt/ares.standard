package cz.stuchlikova.ares.application.connector;


import cz.stuchlikova.ares.application.stub.rzp.AresDotazy;
import cz.stuchlikova.ares.application.stub.rzp.AresOdpovedi;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXB;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@Component
@Primary
@Qualifier("rzp")
public class AresRzpClientTestImpl implements AresClient<AresOdpovedi, AresDotazy> {


    @Override
    public AresOdpovedi getAresResponse(AresDotazy dotazy) {

        String ico = dotazy.getDotaz().get(0).getICO();
        String url = "src/test/resources/getDtoRzpResponseByIco/ico=" + ico + ".xml";

        File answer = new File(url);
        try {
            InputStream xmlResult = new FileInputStream(answer);

            return unmarshalStringToObjectRZP(xmlResult);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    private AresOdpovedi unmarshalStringToObjectRZP(InputStream xmlResult) {
        return JAXB.unmarshal(xmlResult, AresOdpovedi.class);
    }
}
