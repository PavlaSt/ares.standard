package cz.stuchlikova.ares.application.repository;

import cz.stuchlikova.ares.application.connector.AresClient;
import cz.stuchlikova.ares.application.stub.standard.AresDotazy;
import cz.stuchlikova.ares.application.stub.standard.AresOdpovedi;
import cz.stuchlikova.ares.application.stub.standard.Odpoved;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AresStandardRepo {


    @Autowired
    private AresClient aresClient;

    public List<Odpoved> getOdpovedList(AresDotazy aresDotazy) {
        AresOdpovedi response = aresClient.getAresResponse(aresDotazy);
        return response.getOdpoved();
    }

}
