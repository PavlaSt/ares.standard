//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.29 at 07:54:38 PM CEST 
//


package cz.stuchlikova.ares.standard.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * údaje o adrese osoby, podnikatele v EZP
 * 
 * <p>Java class for adresa_ezp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="adresa_ezp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID_adresy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Nazev_obce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}nazev_obce" minOccurs="0"/&gt;
 *         &lt;element name="Nazev_casti_obce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}nazev_casti_obce" minOccurs="0"/&gt;
 *         &lt;element name="Nazev_ulice" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}nazev_ulice" minOccurs="0"/&gt;
 *         &lt;element name="Cislo_domovni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}cis_dom" minOccurs="0"/&gt;
 *         &lt;element name="Typ_cislo_domovni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}typ_cis_dom" minOccurs="0"/&gt;
 *         &lt;element name="Cislo_orientacni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}cis_or_sp" minOccurs="0"/&gt;
 *         &lt;element name="PSC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}psc" minOccurs="0"/&gt;
 *         &lt;element name="Nazev_posty" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="48"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "adresa_ezp", propOrder = {
    "idAdresy",
    "nazevObce",
    "nazevCastiObce",
    "nazevUlice",
    "cisloDomovni",
    "typCisloDomovni",
    "cisloOrientacni",
    "psc",
    "nazevPosty"
})
public class AdresaEzp {

    @XmlElement(name = "ID_adresy")
    protected String idAdresy;
    @XmlElement(name = "Nazev_obce")
    protected String nazevObce;
    @XmlElement(name = "Nazev_casti_obce")
    protected String nazevCastiObce;
    @XmlElement(name = "Nazev_ulice")
    protected String nazevUlice;
    @XmlElement(name = "Cislo_domovni")
    protected Integer cisloDomovni;
    @XmlElement(name = "Typ_cislo_domovni")
    protected Byte typCisloDomovni;
    @XmlElement(name = "Cislo_orientacni")
    protected String cisloOrientacni;
    @XmlElement(name = "PSC")
    protected String psc;
    @XmlElement(name = "Nazev_posty")
    protected String nazevPosty;

    /**
     * Gets the value of the idAdresy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDAdresy() {
        return idAdresy;
    }

    /**
     * Sets the value of the idAdresy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDAdresy(String value) {
        this.idAdresy = value;
    }

    /**
     * Gets the value of the nazevObce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevObce() {
        return nazevObce;
    }

    /**
     * Sets the value of the nazevObce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevObce(String value) {
        this.nazevObce = value;
    }

    /**
     * Gets the value of the nazevCastiObce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevCastiObce() {
        return nazevCastiObce;
    }

    /**
     * Sets the value of the nazevCastiObce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevCastiObce(String value) {
        this.nazevCastiObce = value;
    }

    /**
     * Gets the value of the nazevUlice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevUlice() {
        return nazevUlice;
    }

    /**
     * Sets the value of the nazevUlice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevUlice(String value) {
        this.nazevUlice = value;
    }

    /**
     * Gets the value of the cisloDomovni property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCisloDomovni() {
        return cisloDomovni;
    }

    /**
     * Sets the value of the cisloDomovni property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCisloDomovni(Integer value) {
        this.cisloDomovni = value;
    }

    /**
     * Gets the value of the typCisloDomovni property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getTypCisloDomovni() {
        return typCisloDomovni;
    }

    /**
     * Sets the value of the typCisloDomovni property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setTypCisloDomovni(Byte value) {
        this.typCisloDomovni = value;
    }

    /**
     * Gets the value of the cisloOrientacni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCisloOrientacni() {
        return cisloOrientacni;
    }

    /**
     * Sets the value of the cisloOrientacni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCisloOrientacni(String value) {
        this.cisloOrientacni = value;
    }

    /**
     * Gets the value of the psc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSC() {
        return psc;
    }

    /**
     * Sets the value of the psc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSC(String value) {
        this.psc = value;
    }

    /**
     * Gets the value of the nazevPosty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevPosty() {
        return nazevPosty;
    }

    /**
     * Sets the value of the nazevPosty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevPosty(String value) {
        this.nazevPosty = value;
    }

}
