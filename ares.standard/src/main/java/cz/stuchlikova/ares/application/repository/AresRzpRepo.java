package cz.stuchlikova.ares.application.repository;

//import cz.stuchlikova.ares.application.connector.AresClient;

import cz.stuchlikova.ares.application.connector.AresClient;
import cz.stuchlikova.ares.application.stub.rzp.AresDotazy;
import cz.stuchlikova.ares.application.stub.rzp.AresOdpovedi;
import cz.stuchlikova.ares.application.stub.rzp.OdpovedRZP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AresRzpRepo {


    @Autowired
    @Qualifier("rzp")
    private AresClient client;

    public List<OdpovedRZP> getOdpovedRZPList(AresDotazy aresDotazyRZP) {
        AresOdpovedi responseRZP = (AresOdpovedi) client.getAresResponse(aresDotazyRZP);
        return responseRZP.getOdpoved();
    }
}
