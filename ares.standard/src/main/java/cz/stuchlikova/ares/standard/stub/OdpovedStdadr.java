//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.10 at 07:21:26 PM CET 
//


package cz.stuchlikova.ares.standard.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for odpoved_stdadr complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="odpoved_stdadr"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Pomocne_ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Stdadr_dotaz" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}stdadr_dotaz" minOccurs="0"/&gt;
 *         &lt;element name="Stdadr_odpoved" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}stdadr_odpoved" minOccurs="0"/&gt;
 *         &lt;element name="Error" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}error_ARES" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "odpoved_stdadr", propOrder = {
    "pomocneID",
    "stdadrDotaz",
    "stdadrOdpoved",
    "error"
})
public class OdpovedStdadr {

    @XmlElement(name = "Pomocne_ID")
    protected Integer pomocneID;
    @XmlElement(name = "Stdadr_dotaz")
    protected StdadrDotaz stdadrDotaz;
    @XmlElement(name = "Stdadr_odpoved")
    protected StdadrOdpoved stdadrOdpoved;
    @XmlElement(name = "Error")
    protected ErrorARES2 error;

    /**
     * Gets the value of the pomocneID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPomocneID() {
        return pomocneID;
    }

    /**
     * Sets the value of the pomocneID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPomocneID(Integer value) {
        this.pomocneID = value;
    }

    /**
     * Gets the value of the stdadrDotaz property.
     * 
     * @return
     *     possible object is
     *     {@link StdadrDotaz }
     *     
     */
    public StdadrDotaz getStdadrDotaz() {
        return stdadrDotaz;
    }

    /**
     * Sets the value of the stdadrDotaz property.
     * 
     * @param value
     *     allowed object is
     *     {@link StdadrDotaz }
     *     
     */
    public void setStdadrDotaz(StdadrDotaz value) {
        this.stdadrDotaz = value;
    }

    /**
     * Gets the value of the stdadrOdpoved property.
     * 
     * @return
     *     possible object is
     *     {@link StdadrOdpoved }
     *     
     */
    public StdadrOdpoved getStdadrOdpoved() {
        return stdadrOdpoved;
    }

    /**
     * Sets the value of the stdadrOdpoved property.
     * 
     * @param value
     *     allowed object is
     *     {@link StdadrOdpoved }
     *     
     */
    public void setStdadrOdpoved(StdadrOdpoved value) {
        this.stdadrOdpoved = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorARES2 }
     *     
     */
    public ErrorARES2 getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorARES2 }
     *     
     */
    public void setError(ErrorARES2 value) {
        this.error = value;
    }

}
