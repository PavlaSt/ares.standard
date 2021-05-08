package cz.stuchlikova.ares.application.repository;

import cz.stuchlikova.ares.application.connector.AresClient;
import cz.stuchlikova.ares.application.stub.standard.AresDotazy;
import cz.stuchlikova.ares.application.stub.standard.AresOdpovedi;
import cz.stuchlikova.ares.application.stub.standard.Odpoved;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AresStandardRepo {

    private final AresClient<AresOdpovedi, AresDotazy> client;

    public AresStandardRepo(AresClient<AresOdpovedi, AresDotazy> client) {
        this.client = client;
    }



    public List<Odpoved> getOdpovedList(AresDotazy aresDotazy) {
        AresOdpovedi response = client.getAresResponse(aresDotazy);
        return response.getOdpoved();
    }

}
