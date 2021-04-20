package cz.stuchlikova.ares.application;

import cz.stuchlikova.ares.application.stub.standard.AresDotazy;
import cz.stuchlikova.ares.application.stub.standard.AresOdpovedi;
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
    private String url = "";
    public AresOdpovedi getAresResponse(AresDotazy request) {
            if (request.getDotaz().size() > 0) {
            if (
                    (request.getDotaz().get(0).getKlicovePolozky().getICO() != null)
                            &&
                    (request.getDotaz().get(0).getKlicovePolozky().getICO().equals("27074358")
                    )) {
                url = "src/test/resources/getDtoResponseByIco/ico=27074358.xml";
            } else if (
                    (request.getDotaz().get(0).getKlicovePolozky().getICO() != null)
                            &&
                            (request.getDotaz().get(0).getKlicovePolozky().getICO().equals("12345678")
                            )) {
                url = "src/test/resources/getDtoResponseByIco/ico=12345678.xml";
            } else
                {
            //} else if (request.getDotaz().get(0).getKlicovePolozky().getObchodniFirma().equals("Etnetera")) {
                url = "src/test/resources/getDtoresponseByCompanyName/firma=Etnetera.xml";

            }
        }
        File answer = new File(url);
        try {
            InputStream xmlResult = new FileInputStream(answer);
            return unmarshalStringToObject(xmlResult);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public cz.stuchlikova.ares.application.stub.rzp.AresOdpovedi getAresResponse(cz.stuchlikova.ares.application.stub.rzp.AresDotazy request) {
        return null;
    }

    private AresOdpovedi unmarshalStringToObject(InputStream xmlResult) {
        return JAXB.unmarshal(xmlResult, AresOdpovedi.class);
    }
}
