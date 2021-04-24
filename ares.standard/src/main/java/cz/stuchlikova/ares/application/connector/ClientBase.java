package cz.stuchlikova.ares.application.connector;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.xml.transform.StringResult;
import org.springframework.xml.transform.StringSource;

import javax.xml.bind.JAXB;
import java.io.StringWriter;

abstract class ClientBase extends WebServiceGatewaySupport {

    String marshalInputToXml(Object request) {
        StringWriter stringWriter = new StringWriter();
        JAXB.marshal(request, stringWriter);
        return stringWriter.toString();
    }

    String sendSourceReceiveResult(String url, String xmlRequest) {
        StringSource source = new StringSource(xmlRequest);
        StringResult result = new StringResult();
        getWebServiceTemplate().sendSourceAndReceiveToResult(url, source, result);
        return result.toString();
    }
}
