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
 * Specifické údaje o správci konkurzu + zproštění správce konkurzu
 * 
 * <p>Java class for spravce complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="spravce"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Spravce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}angazma_PO_n_FO"/&gt;
 *         &lt;element name="Zprosteni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "spravce", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1", propOrder = {
    "spravce",
    "zprosteni"
})
public class Spravce {

    @XmlElement(name = "Spravce", required = true)
    protected AngazmaPONFO spravce;
    @XmlElement(name = "Zprosteni")
    protected String zprosteni;

    /**
     * Gets the value of the spravce property.
     * 
     * @return
     *     possible object is
     *     {@link AngazmaPONFO }
     *     
     */
    public AngazmaPONFO getSpravce() {
        return spravce;
    }

    /**
     * Sets the value of the spravce property.
     * 
     * @param value
     *     allowed object is
     *     {@link AngazmaPONFO }
     *     
     */
    public void setSpravce(AngazmaPONFO value) {
        this.spravce = value;
    }

    /**
     * Gets the value of the zprosteni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZprosteni() {
        return zprosteni;
    }

    /**
     * Sets the value of the zprosteni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZprosteni(String value) {
        this.zprosteni = value;
    }

}
