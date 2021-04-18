package cz.stuchlikova.ares.standard.repository;

import cz.stuchlikova.ares.standard.AresClient;
import cz.stuchlikova.ares.standard.stub.AresDotazy;
import cz.stuchlikova.ares.standard.stub.AresOdpovedi;
import cz.stuchlikova.ares.standard.stub.Odpoved;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//@ConfigurationProperties(prefix = "ares")
public class AresResponseRepository {


    @Autowired
    private AresClient aresClient;
    /*private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }*/

    public List<Odpoved> getOdpovedList(AresDotazy aresDotazy) {
        AresOdpovedi response = aresClient.getAresResponse(aresDotazy);
        //AresOdpovedi response = aresClient.getAresResponse(url, aresDotazy);
        return response.getOdpoved();
    }

    /*private AresOdpovedi unmarshalStringToObject(String xmlResult) {
        return JAXB.unmarshal(new StringReader(xmlResult), AresOdpovedi.class);
    }
*/


}
