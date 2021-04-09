package cz.stuchlikova.ares.standard.repository;

import cz.stuchlikova.ares.standard.AresClient;
import cz.stuchlikova.ares.standard.stub.AresDotazy;
import cz.stuchlikova.ares.standard.stub.AresOdpovedi;
import cz.stuchlikova.ares.standard.stub.Odpoved;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBException;
import java.io.StringReader;
import java.util.List;

@Repository
public class AresResponseRepository {


    @Autowired
    private AresClient aresClient;




    public List<Odpoved> getAresResponse(AresDotazy aresDotazy) {

        AresOdpovedi response = aresClient.getAresResponse(
                "http://wwwinfo.mfcr.cz/cgi-bin/ares/xar.cgi", aresDotazy);
        return response.getOdpoved();
    }
    private AresOdpovedi unmarshalStringToObject(String xmlResult) {
        return JAXB.unmarshal(new StringReader(xmlResult), AresOdpovedi.class);
    }



}
