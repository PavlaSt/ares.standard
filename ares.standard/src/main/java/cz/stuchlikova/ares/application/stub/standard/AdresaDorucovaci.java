//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.19 at 09:56:20 AM CEST 
//


package cz.stuchlikova.ares.application.stub.standard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for adresa_dorucovaci complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adresa_dorucovaci"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ulice_cislo" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}ulice_cislo"/&gt;
 *         &lt;element name="PSC_obec" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}psc_obec"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="zdroj" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}zdroj_type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adresa_dorucovaci", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1", propOrder = {
    "uliceCislo",
    "pscObec"
})
public class AdresaDorucovaci {

    @XmlElement(name = "Ulice_cislo", required = true)
    protected String uliceCislo;
    @XmlElement(name = "PSC_obec", required = true)
    protected String pscObec;
    @XmlAttribute(name = "zdroj")
    protected ZdrojType zdroj;

    /**
     * Gets the value of the uliceCislo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUliceCislo() {
        return uliceCislo;
    }

    /**
     * Sets the value of the uliceCislo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUliceCislo(String value) {
        this.uliceCislo = value;
    }

    /**
     * Gets the value of the pscObec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSCObec() {
        return pscObec;
    }

    /**
     * Sets the value of the pscObec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSCObec(String value) {
        this.pscObec = value;
    }

    /**
     * Gets the value of the zdroj property.
     * 
     * @return
     *     possible object is
     *     {@link ZdrojType }
     *     
     */
    public ZdrojType getZdroj() {
        return zdroj;
    }

    /**
     * Sets the value of the zdroj property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZdrojType }
     *     
     */
    public void setZdroj(ZdrojType value) {
        this.zdroj = value;
    }

}