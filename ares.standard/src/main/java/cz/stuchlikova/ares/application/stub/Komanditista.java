//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.15 at 10:09:56 PM CEST 
//


package cz.stuchlikova.ares.application.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for komanditista complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="komanditista"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Spolecnik_komanditista" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}angazma_PO_n_FO" minOccurs="0"/&gt;
 *         &lt;element name="Vklad" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}vklad" minOccurs="0"/&gt;
 *         &lt;element name="Splaceno" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}splaceno" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "komanditista", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1", propOrder = {
    "spolecnikKomanditista",
    "vklad",
    "splaceno"
})
public class Komanditista {

    @XmlElement(name = "Spolecnik_komanditista")
    protected AngazmaPONFO spolecnikKomanditista;
    @XmlElement(name = "Vklad")
    protected Vklad vklad;
    @XmlElement(name = "Splaceno")
    protected Splaceno splaceno;

    /**
     * Gets the value of the spolecnikKomanditista property.
     * 
     * @return
     *     possible object is
     *     {@link AngazmaPONFO }
     *     
     */
    public AngazmaPONFO getSpolecnikKomanditista() {
        return spolecnikKomanditista;
    }

    /**
     * Sets the value of the spolecnikKomanditista property.
     * 
     * @param value
     *     allowed object is
     *     {@link AngazmaPONFO }
     *     
     */
    public void setSpolecnikKomanditista(AngazmaPONFO value) {
        this.spolecnikKomanditista = value;
    }

    /**
     * Gets the value of the vklad property.
     * 
     * @return
     *     possible object is
     *     {@link Vklad }
     *     
     */
    public Vklad getVklad() {
        return vklad;
    }

    /**
     * Sets the value of the vklad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vklad }
     *     
     */
    public void setVklad(Vklad value) {
        this.vklad = value;
    }

    /**
     * Gets the value of the splaceno property.
     * 
     * @return
     *     possible object is
     *     {@link Splaceno }
     *     
     */
    public Splaceno getSplaceno() {
        return splaceno;
    }

    /**
     * Sets the value of the splaceno property.
     * 
     * @param value
     *     allowed object is
     *     {@link Splaceno }
     *     
     */
    public void setSplaceno(Splaceno value) {
        this.splaceno = value;
    }

}