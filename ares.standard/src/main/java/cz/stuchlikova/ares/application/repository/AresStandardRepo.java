package cz.stuchlikova.ares.application.repository;

//import cz.stuchlikova.ares.application.connector.AresClient;
import cz.stuchlikova.ares.application.connector.AresClientGen;
import cz.stuchlikova.ares.application.connector.AresStandardClientImpl;
import cz.stuchlikova.ares.application.stub.standard.AresDotazy;
import cz.stuchlikova.ares.application.stub.standard.AresOdpovedi;
import cz.stuchlikova.ares.application.stub.standard.Odpoved;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AresStandardRepo {


   /* @Autowired
    private AresClient aresClient;*/

    @Autowired
    private AresStandardClientImpl standardClient;

    public List<Odpoved> getOdpovedListG(AresDotazy aresDotazy) { //Object
        AresOdpovedi response = standardClient.getAresResponse( aresDotazy); //(AresDotazy)
        return response.getOdpoved();
    }

    /*public List<Odpoved> getOdpovedList(AresDotazy aresDotazy) { //Object
        AresOdpovedi response = aresClient.getAresResponse( aresDotazy); //(AresDotazy)
               return response.getOdpoved();
    }*/

}
