package cz.stuchlikova.ares.application.repository;

import cz.stuchlikova.ares.application.AresClient;
import cz.stuchlikova.ares.application.stub.rzp.AresDotazy;
import cz.stuchlikova.ares.application.stub.rzp.AresOdpovedi;
import cz.stuchlikova.ares.application.stub.rzp.OdpovedRZP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AresRzpRepo {

    @Autowired
    private AresClient aresClient;

    public List<OdpovedRZP> getOdpovedRZPList(AresDotazy aresDotazyRZP) {
        AresOdpovedi responseRZP = aresClient.getAresResponse(aresDotazyRZP);
        return responseRZP.getOdpoved();
    }
}
