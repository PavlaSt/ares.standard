package cz.stuchlikova.ares.standard;

import cz.stuchlikova.ares.standard.stub.AresDotazy;
import cz.stuchlikova.ares.standard.stub.AresOdpovedi;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.xml.transform.StringResult;
import org.springframework.xml.transform.StringSource;

import javax.xml.bind.JAXB;
import java.io.StringReader;
import java.io.StringWriter;

@Component
public class SoapClientImpl extends WebServiceGatewaySupport implements SoapClient {
    public AresOdpovedi getAresResponse(String url, AresDotazy request) {
       /* //marshaling POJO request to xml
        StringWriter sw = new StringWriter();
        JAXB.marshal(request, sw);
        String xmlRequest = sw.toString();

        //setting source and result
        StringSource source = new StringSource(xmlRequest);
        StringResult result = new StringResult();

        //sending source and receiving result
        getWebServiceTemplate().sendSourceAndReceiveToResult(url, source, result);

        String xmlResult = result.toString();

        //AresOdpovedi aresOdpovedi = JAXB.unmarshal(xmlResult, AresOdpovedi.class);
        AresOdpovedi aresOdpovedi = JAXB.unmarshal(new StringReader(xmlResult), AresOdpovedi.class);
        //InputStream xmlResult = new FileInputStream(new File(xml_file_path));

        return aresOdpovedi;
        //return (AresOdpovedi) getWebServiceTemplate().marshalSendAndReceive(url, request);*/

        String xmlRequest = marshalInputToXml(request);
        String xmlResult = sendSourceReceiveResult(url,xmlRequest);

        return unmarshalStringToObject(xmlResult);
    }
    private String marshalInputToXml(AresDotazy request) {
        StringWriter sw = new StringWriter();
        JAXB.marshal(request, sw);
        String xmlRequest = sw.toString();
        return xmlRequest;
    }

    private String sendSourceReceiveResult(String url, String xmlRequest) {

        StringSource source = new StringSource(xmlRequest);
        StringResult result = new StringResult();

        getWebServiceTemplate().sendSourceAndReceiveToResult(url, source, result);
        String xmlResult = result.toString();
        return xmlResult;
    }

    private AresOdpovedi unmarshalStringToObject(String xmlResult) {

        //return JAXB.unmarshal(xmlResult, AresOdpovedi.class);
        return JAXB.unmarshal(new StringReader(xmlResult), AresOdpovedi.class);
    }
    //InputStream xmlResult = new FileInputStream(new File(xml_file_path));


}
