//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.29 at 07:54:38 PM CEST 
//


package cz.stuchlikova.ares.standard.stub;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Údaje o provozovnách subjektu
 * 
 * <p>Java class for provozovna complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="provozovna"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Zahajeni" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Ukonceni" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Typ_provozovny" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}typ_provozovny" minOccurs="0"/&gt;
 *         &lt;element name="Nazev_provozovny" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}nazev_provozovny" minOccurs="0"/&gt;
 *         &lt;element name="Adresa_provozovny" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}adresa_ARES"/&gt;
 *         &lt;element name="ICP" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}icp" minOccurs="0"/&gt;
 *         &lt;element name="Obory_cinnosti" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}obory_cinnosti" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "provozovna", propOrder = {
    "zahajeni",
    "ukonceni",
    "typProvozovny",
    "nazevProvozovny",
    "adresaProvozovny",
    "icp",
    "oboryCinnosti"
})
public class Provozovna2 {

    @XmlElement(name = "Zahajeni")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar zahajeni;
    @XmlElement(name = "Ukonceni")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ukonceni;
    @XmlElement(name = "Typ_provozovny")
    protected String typProvozovny;
    @XmlElement(name = "Nazev_provozovny")
    protected String nazevProvozovny;
    @XmlElement(name = "Adresa_provozovny", required = true)
    protected AdresaARES2 adresaProvozovny;
    @XmlElement(name = "ICP")
    protected BigDecimal icp;
    @XmlElement(name = "Obory_cinnosti")
    protected OboryCinnosti oboryCinnosti;

    /**
     * Gets the value of the zahajeni property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getZahajeni() {
        return zahajeni;
    }

    /**
     * Sets the value of the zahajeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setZahajeni(XMLGregorianCalendar value) {
        this.zahajeni = value;
    }

    /**
     * Gets the value of the ukonceni property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUkonceni() {
        return ukonceni;
    }

    /**
     * Sets the value of the ukonceni property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUkonceni(XMLGregorianCalendar value) {
        this.ukonceni = value;
    }

    /**
     * Gets the value of the typProvozovny property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypProvozovny() {
        return typProvozovny;
    }

    /**
     * Sets the value of the typProvozovny property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypProvozovny(String value) {
        this.typProvozovny = value;
    }

    /**
     * Gets the value of the nazevProvozovny property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevProvozovny() {
        return nazevProvozovny;
    }

    /**
     * Sets the value of the nazevProvozovny property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevProvozovny(String value) {
        this.nazevProvozovny = value;
    }

    /**
     * Gets the value of the adresaProvozovny property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaARES2 }
     *     
     */
    public AdresaARES2 getAdresaProvozovny() {
        return adresaProvozovny;
    }

    /**
     * Sets the value of the adresaProvozovny property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaARES2 }
     *     
     */
    public void setAdresaProvozovny(AdresaARES2 value) {
        this.adresaProvozovny = value;
    }

    /**
     * Gets the value of the icp property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getICP() {
        return icp;
    }

    /**
     * Sets the value of the icp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setICP(BigDecimal value) {
        this.icp = value;
    }

    /**
     * Gets the value of the oboryCinnosti property.
     * 
     * @return
     *     possible object is
     *     {@link OboryCinnosti }
     *     
     */
    public OboryCinnosti getOboryCinnosti() {
        return oboryCinnosti;
    }

    /**
     * Sets the value of the oboryCinnosti property.
     * 
     * @param value
     *     allowed object is
     *     {@link OboryCinnosti }
     *     
     */
    public void setOboryCinnosti(OboryCinnosti value) {
        this.oboryCinnosti = value;
    }

}
