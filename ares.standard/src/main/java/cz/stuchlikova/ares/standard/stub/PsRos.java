//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.15 at 10:09:56 PM CEST 
//


package cz.stuchlikova.ares.standard.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ps_ros complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ps_ros"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Priznak" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}priznak_ros"/&gt;
 *         &lt;element name="KPS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}pravni_stav" minOccurs="0"/&gt;
 *         &lt;element name="NPS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ps_ros", propOrder = {
    "priznak",
    "kps",
    "nps"
})
public class PsRos {

    @XmlElement(name = "Priznak")
    protected byte priznak;
    @XmlElement(name = "KPS")
    protected Byte kps;
    @XmlElement(name = "NPS")
    protected String nps;

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
     * Gets the value of the kps property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getKPS() {
        return kps;
    }

    /**
     * Sets the value of the kps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setKPS(Byte value) {
        this.kps = value;
    }

    /**
     * Gets the value of the nps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPS() {
        return nps;
    }

    /**
     * Sets the value of the nps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNPS(String value) {
        this.nps = value;
    }

}
