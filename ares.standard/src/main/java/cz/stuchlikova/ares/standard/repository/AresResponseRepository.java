package cz.stuchlikova.ares.standard.repository;

import cz.stuchlikova.ares.standard.AresClient;
import cz.stuchlikova.ares.standard.stub.AresDotazy;
import cz.stuchlikova.ares.standard.stub.AresOdpovedi;
import cz.stuchlikova.ares.standard.stub.Odpoved;
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
