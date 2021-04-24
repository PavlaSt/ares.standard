package cz.stuchlikova.ares.application.connector;

import cz.stuchlikova.ares.application.stub.standard.AresDotazy;
import cz.stuchlikova.ares.application.stub.standard.AresOdpovedi;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXB;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Optional;

@Component
@Primary
@Qualifier("standard")

public class AresStandardClientTestImpl implements AresClient<AresOdpovedi, AresDotazy> {

    public AresOdpovedi getAresResponse(AresDotazy request) {

        Optional<String> optionalIco = Optional.ofNullable(request.getDotaz().get(0).getKlicovePolozky().getICO());
        String url;
        if (optionalIco.isPresent()) {
            String ico = optionalIco.get();
            url = "src/test/resources/getDtoResponseByIco/ico=" + ico + ".xml";
        } else {
            String companyName = request.getDotaz().get(0).getKlicovePolozky().getObchodniFirma();
            url = "src/test/resources/getDtoresponseByCompanyName/firma=" + companyName + ".xml";
        }
        System.out.println(url);
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
