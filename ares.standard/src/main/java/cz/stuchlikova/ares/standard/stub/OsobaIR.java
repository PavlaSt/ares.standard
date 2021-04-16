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
 * Osoba, jak úpadce, tak i správce
 * 
 * <p>Java class for osoba_IR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="osoba_IR"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Role" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="PF" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Typ" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Obchodni_firma" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}obchodni_firma" minOccurs="0"/&gt;
 *         &lt;element name="Nazev_osoby" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/&gt;
 *         &lt;element name="ICO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}ico" minOccurs="0"/&gt;
 *         &lt;element name="Adresy" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}adresy_IR" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "osoba_IR", propOrder = {
    "role",
    "pf",
    "typ",
    "obchodniFirma",
    "nazevOsoby",
    "ico",
    "adresy"
})
public class OsobaIR {

    @XmlElement(name = "Role")
    protected Integer role;
    @XmlElement(name = "PF")
    protected Integer pf;
    @XmlElement(name = "Typ")
    protected Integer typ;
    @XmlElement(name = "Obchodni_firma")
    protected String obchodniFirma;
    @XmlElement(name = "Nazev_osoby")
    protected String nazevOsoby;
    @XmlElement(name = "ICO")
    protected String ico;
    @XmlElement(name = "Adresy")
    protected AdresyIR adresy;

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRole(Integer value) {
        this.role = value;
    }

    /**
     * Gets the value of the pf property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPF() {
        return pf;
    }

    /**
     * Sets the value of the pf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPF(Integer value) {
        this.pf = value;
    }

    /**
     * Gets the value of the typ property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTyp(Integer value) {
        this.typ = value;
    }

    /**
     * Gets the value of the obchodniFirma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObchodniFirma() {
        return obchodniFirma;
    }

    /**
     * Sets the value of the obchodniFirma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObchodniFirma(String value) {
        this.obchodniFirma = value;
    }

    /**
     * Gets the value of the nazevOsoby property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevOsoby() {
        return nazevOsoby;
    }

    /**
     * Sets the value of the nazevOsoby property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevOsoby(String value) {
        this.nazevOsoby = value;
    }

    /**
     * Gets the value of the ico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICO() {
        return ico;
    }

    /**
     * Sets the value of the ico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICO(String value) {
        this.ico = value;
    }

    /**
     * Gets the value of the adresy property.
     * 
     * @return
     *     possible object is
     *     {@link AdresyIR }
     *     
     */
    public AdresyIR getAdresy() {
        return adresy;
    }

    /**
     * Sets the value of the adresy property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresyIR }
     *     
     */
    public void setAdresy(AdresyIR value) {
        this.adresy = value;
    }

}
