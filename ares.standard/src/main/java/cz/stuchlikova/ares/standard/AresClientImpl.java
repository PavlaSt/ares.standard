package cz.stuchlikova.ares.standard;

import cz.stuchlikova.ares.standard.stub.AresDotazy;
import cz.stuchlikova.ares.standard.stub.AresOdpovedi;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.xml.transform.StringResult;
import org.springframework.xml.transform.StringSource;

import javax.xml.bind.JAXB;
import java.io.StringReader;
import java.io.StringWriter;

//@Primary
@Component
@ConfigurationProperties(prefix = "ares")
public class AresClientImpl extends WebServiceGatewaySupport implements AresClient {

    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public AresOdpovedi getAresResponse(AresDotazy request) {
        String xmlRequest = marshalInputToXml(request);
        String xmlResult = sendSourceReceiveResult(url,xmlRequest);
        return unmarshalStringToObject(xmlResult);
    }

    private String marshalInputToXml(AresDotazy request) {
        StringWriter stringWriter = new StringWriter();
        JAXB.marshal(request, stringWriter);
        return stringWriter.toString();
    }

    private String sendSourceReceiveResult(String url, String xmlRequest) {
        StringSource source = new StringSource(xmlRequest);
        StringResult result = new StringResult();
        getWebServiceTemplate().sendSourceAndReceiveToResult(url, source, result);
        System.out.println(result);
        return result.toString();
    }

    private AresOdpovedi unmarshalStringToObject(String xmlResult) {
        return JAXB.unmarshal(new StringReader(xmlResult), AresOdpovedi.class);
    }

}
