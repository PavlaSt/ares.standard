package cz.stuchlikova.ares.application.repository;

import cz.stuchlikova.ares.application.AresClient;
import cz.stuchlikova.ares.application.stub.rzp.OdpovedRZP;
import cz.stuchlikova.ares.application.stub.standard.AresDotazy;
import cz.stuchlikova.ares.application.stub.standard.AresOdpovedi;
import cz.stuchlikova.ares.application.stub.standard.Odpoved;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AresResponseRepository {


    @Autowired
    private AresClient aresClient;

    public List<Odpoved> getOdpovedList(AresDotazy aresDotazy) {
        AresOdpovedi response = aresClient.getAresResponse(aresDotazy);
        return response.getOdpoved();
    }

    public List<OdpovedRZP> getOdpovedRZPList(cz.stuchlikova.ares.application.stub.rzp.AresDotazy aresDotazyRZP) {
        cz.stuchlikova.ares.application.stub.rzp.AresOdpovedi responseRZP = aresClient.getAresResponse(aresDotazyRZP);
        return responseRZP.getOdpoved();
    }
}
