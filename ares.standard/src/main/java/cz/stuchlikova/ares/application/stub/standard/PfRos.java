//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.19 at 09:56:20 AM CEST 
//


package cz.stuchlikova.ares.application.stub.standard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pf_ros complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pf_ros"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Priznak" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}priznak_ros"/&gt;
 *         &lt;element name="Pravni_forma" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}pravni_forma" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pf_ros", propOrder = {
    "priznak",
    "pravniForma"
})
public class PfRos {

    @XmlElement(name = "Priznak")
    protected byte priznak;
    @XmlElement(name = "Pravni_forma")
    protected PravniForma2 pravniForma;

    /**
     * Gets the value of the priznak property.
     * 
     */
    public byte getPriznak() {
        return priznak;
    }

    /**
     * Sets the value of the priznak property.
     * 
     */
    public void setPriznak(byte value) {
        this.priznak = value;
    }

    /**
     * Gets the value of the pravniForma property.
     * 
     * @return
     *     possible object is
     *     {@link PravniForma2 }
     *     
     */
    public PravniForma2 getPravniForma() {
        return pravniForma;
    }

    /**
     * Sets the value of the pravniForma property.
     * 
     * @param value
     *     allowed object is
     *     {@link PravniForma2 }
     *     
     */
    public void setPravniForma(PravniForma2 value) {
        this.pravniForma = value;
    }

}