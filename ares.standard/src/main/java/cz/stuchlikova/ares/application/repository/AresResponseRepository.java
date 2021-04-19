package cz.stuchlikova.ares.application.repository;

import cz.stuchlikova.ares.application.AresClient;
import cz.stuchlikova.ares.application.stub.AresDotazy;
import cz.stuchlikova.ares.application.stub.AresOdpovedi;
import cz.stuchlikova.ares.application.stub.Odpoved;
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
}
