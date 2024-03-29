package cz.stuchlikova.ares.application.connector;

import cz.stuchlikova.ares.application.stub.standard.AresDotazy;
import cz.stuchlikova.ares.application.stub.standard.AresOdpovedi;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXB;
import java.io.InputStream;
import java.util.Optional;

@Component
@Primary


public class AresStandardClientTestImpl extends ClientBaseTest<AresOdpovedi> implements AresClient<AresOdpovedi, AresDotazy> {

    @Override
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
        return openXmlFileUnmarshalToObject(url);
    }

    @Override
    AresOdpovedi unmarshalStringToObject(InputStream xmlResult) {
        return JAXB.unmarshal(xmlResult, AresOdpovedi.class);
    }
}
