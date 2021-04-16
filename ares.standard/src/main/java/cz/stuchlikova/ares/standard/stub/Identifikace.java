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
 * Definice elementu identifikace subjektu
 * 
 * <p>Java class for identifikace complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="identifikace"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Osoba" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}fyzicka_osoba" minOccurs="0"/&gt;
 *         &lt;element name="Adresa_ARES" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}adresa_ARES" minOccurs="0"/&gt;
 *         &lt;element name="Adr_puv" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}adresa_ARES" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identifikace", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_answer/v_1.0.1", propOrder = {
    "osoba",
    "adresaARES",
    "adrPuv"
})
public class Identifikace {

    @XmlElement(name = "Osoba")
    protected FyzickaOsoba2 osoba;
    @XmlElement(name = "Adresa_ARES")
    protected AdresaARES2 adresaARES;
    @XmlElement(name = "Adr_puv")
    protected AdresaARES2 adrPuv;

    /**
     * Gets the value of the osoba property.
     * 
     * @return
     *     possible object is
     *     {@link FyzickaOsoba2 }
     *     
     */
    public FyzickaOsoba2 getOsoba() {
        return osoba;
    }

    /**
     * Sets the value of the osoba property.
     * 
     * @param value
     *     allowed object is
     *     {@link FyzickaOsoba2 }
     *     
     */
    public void setOsoba(FyzickaOsoba2 value) {
        this.osoba = value;
    }

    /**
     * Gets the value of the adresaARES property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaARES2 }
     *     
     */
    public AdresaARES2 getAdresaARES() {
        return adresaARES;
    }

    /**
     * Sets the value of the adresaARES property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaARES2 }
     *     
     */
    public void setAdresaARES(AdresaARES2 value) {
        this.adresaARES = value;
    }

    /**
     * Gets the value of the adrPuv property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaARES2 }
     *     
     */
    public AdresaARES2 getAdrPuv() {
        return adrPuv;
    }

    /**
     * Sets the value of the adrPuv property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaARES2 }
     *     
     */
    public void setAdrPuv(AdresaARES2 value) {
        this.adrPuv = value;
    }

}
