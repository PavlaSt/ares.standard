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
 * Finanční úřad (vz_podnik.k_fu)
 * 
 * <p>Java class for financni_urad complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="financni_urad"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Kod_FU" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="Nazev_FU" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}nazev_FU"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "financni_urad", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1", propOrder = {
    "kodFU",
    "nazevFU"
})
public class FinancniUrad {

    @XmlElement(name = "Kod_FU")
    protected short kodFU;
    @XmlElement(name = "Nazev_FU", required = true)
    protected String nazevFU;

    /**
     * Gets the value of the kodFU property.
     * 
     */
    public short getKodFU() {
        return kodFU;
    }

    /**
     * Sets the value of the kodFU property.
     * 
     */
    public void setKodFU(short value) {
        this.kodFU = value;
    }

    /**
     * Gets the value of the nazevFU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevFU() {
        return nazevFU;
    }

    /**
     * Sets the value of the nazevFU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevFU(String value) {
        this.nazevFU = value;
    }

}
