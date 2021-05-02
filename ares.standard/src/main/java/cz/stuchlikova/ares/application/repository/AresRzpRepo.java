package cz.stuchlikova.ares.application.repository;

import cz.stuchlikova.ares.application.connector.AresClient;
import cz.stuchlikova.ares.application.stub.rzp.AresDotazy;
import cz.stuchlikova.ares.application.stub.rzp.AresOdpovedi;
import cz.stuchlikova.ares.application.stub.rzp.OdpovedRZP;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AresRzpRepo {


    private final AresClient<AresOdpovedi, AresDotazy> client;

    public AresRzpRepo(AresClient<AresOdpovedi, AresDotazy> client) {
        this.client = client;
    }

    public List<OdpovedRZP> getOdpovedRZPList(AresDotazy aresDotazyRZP) {
        AresOdpovedi responseRZP = client.getAresResponse(aresDotazyRZP);
        return responseRZP.getOdpoved();
    }
}
