package cz.stuchlikova.ares.standard;

import cz.stuchlikova.ares.standard.stub.AresDotazy;
import cz.stuchlikova.ares.standard.stub.AresOdpovedi;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXB;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@Component
@Primary
public class AresClientTestImpl implements AresClient {

    public AresOdpovedi getAresResponse(String url, AresDotazy request) {

        File answer = new File(url);
        try {
            InputStream xmlResult = new FileInputStream(answer);
            return unmarshalStringToObject(xmlResult);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    private AresOdpovedi unmarshalStringToObject(InputStream xmlResult) {
        return JAXB.unmarshal(xmlResult, AresOdpovedi.class);
    }


}
