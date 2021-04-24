package cz.stuchlikova.ares.application.repository;

//import cz.stuchlikova.ares.application.connector.AresClient;

import cz.stuchlikova.ares.application.connector.AresClient;
import cz.stuchlikova.ares.application.stub.standard.AresDotazy;
import cz.stuchlikova.ares.application.stub.standard.AresOdpovedi;
import cz.stuchlikova.ares.application.stub.standard.Odpoved;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AresStandardRepo {


   /* @Autowired
    private AresClient aresClient;*/

    @Autowired
    @Qualifier("standard")
    private AresClient clientGen;//AresStandardClientImpl standardClient;

    public List<Odpoved> getOdpovedList(AresDotazy aresDotazy) { //Object
        //AresOdpovedi response = standardClient.getAresResponse( aresDotazy); //(AresDotazy)
        AresOdpovedi response = (AresOdpovedi) clientGen.getAresResponse(aresDotazy); //(AresDotazy)
        return response.getOdpoved();
    }

    /*public List<Odpoved> getOdpovedList(AresDotazy aresDotazy) { //Object
        AresOdpovedi response = aresClient.getAresResponse( aresDotazy); //(AresDotazy)
               return response.getOdpoved();
    }*/

}
