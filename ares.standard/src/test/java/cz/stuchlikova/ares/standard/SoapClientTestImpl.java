package cz.stuchlikova.ares.standard;

import cz.stuchlikova.ares.standard.stub.AresDotazy;
import cz.stuchlikova.ares.standard.stub.AresOdpovedi;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class SoapClientTestImpl implements SoapClient {

    public AresOdpovedi getAresResponse(String url, AresDotazy request) throws JAXBException {

        File file = new File("src/test/resources/answer.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(AresOdpovedi.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        AresOdpovedi response = (AresOdpovedi) jaxbUnmarshaller.unmarshal(file);

        return response;
    }


}
