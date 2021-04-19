//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.15 at 10:09:56 PM CEST 
//


package cz.stuchlikova.ares.application.stub;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Částka vkladu slouží k uložení finančních obnosů v Kč nebo volným textem
 * 
 * <p>Java class for vklad complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vklad"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Kc" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="Ostatni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vklad", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1", propOrder = {
    "kc",
    "ostatni"
})
public class Vklad {

    @XmlElement(name = "Kc")
    protected BigDecimal kc;
    @XmlElement(name = "Ostatni")
    protected String ostatni;

    /**
     * Gets the value of the kc property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getKc() {
        return kc;
    }

    /**
     * Sets the value of the kc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setKc(BigDecimal value) {
        this.kc = value;
    }

    /**
     * Gets the value of the ostatni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOstatni() {
        return ostatni;
    }

    /**
     * Sets the value of the ostatni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOstatni(String value) {
        this.ostatni = value;
    }

}