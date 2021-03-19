package cz.stuchlikova.ares.standard.repository;

import cz.stuchlikova.ares.standard.SoapClient;
import cz.stuchlikova.ares.standard.stub.AresDotazy;
import cz.stuchlikova.ares.standard.stub.AresOdpovedi;
import cz.stuchlikova.ares.standard.stub.Odpoved;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AresResponseRepository {


    @Autowired
    private SoapClient soapClient;


    public List<Odpoved> getAresResponse(AresDotazy aresDotazy) {

        AresOdpovedi response = soapClient.getAresOdpovedi(
                "http://wwwinfo.mfcr.cz/cgi-bin/ares/xar.cgi", aresDotazy);
        return response.getOdpoved();
    }

}
