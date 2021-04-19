//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.19 at 09:56:22 AM CEST 
//


package cz.stuchlikova.ares.application.stub.rzp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Údaje o fyzické osobě statutárního orgánu subjektu v RPSH
 * 
 * <p>Java class for osoba_rpsh complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="osoba_rpsh"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Datum_narozeni" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Funkce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/&gt;
 *         &lt;element name="Cele_jmeno" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/&gt;
 *         &lt;element name="Kod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Adresa" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}adresa_rpsh" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="dod" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "osoba_rpsh", propOrder = {
    "datumNarozeni",
    "funkce",
    "celeJmeno",
    "kod",
    "adresa"
})
public class OsobaRpsh {

    @XmlElement(name = "Datum_narozeni")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumNarozeni;
    @XmlElement(name = "Funkce")
    protected String funkce;
    @XmlElement(name = "Cele_jmeno")
    protected String celeJmeno;
    @XmlElement(name = "Kod")
    protected Integer kod;
    @XmlElement(name = "Adresa")
    protected AdresaRpsh adresa;
    @XmlAttribute(name = "dod")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dod;

    /**
     * Gets the value of the datumNarozeni property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumNarozeni() {
        return datumNarozeni;
    }

    /**
     * Sets the value of the datumNarozeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumNarozeni(XMLGregorianCalendar value) {
        this.datumNarozeni = value;
    }

    /**
     * Gets the value of the funkce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunkce() {
        return funkce;
    }

    /**
     * Sets the value of the funkce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunkce(String value) {
        this.funkce = value;
    }

    /**
     * Gets the value of the celeJmeno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCeleJmeno() {
        return celeJmeno;
    }

    /**
     * Sets the value of the celeJmeno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCeleJmeno(String value) {
        this.celeJmeno = value;
    }

    /**
     * Gets the value of the kod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKod() {
        return kod;
    }

    /**
     * Sets the value of the kod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKod(Integer value) {
        this.kod = value;
    }

    /**
     * Gets the value of the adresa property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaRpsh }
     *     
     */
    public AdresaRpsh getAdresa() {
        return adresa;
    }

    /**
     * Sets the value of the adresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaRpsh }
     *     
     */
    public void setAdresa(AdresaRpsh value) {
        this.adresa = value;
    }

    /**
     * Gets the value of the dod property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDod() {
        return dod;
    }

    /**
     * Sets the value of the dod property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDod(XMLGregorianCalendar value) {
        this.dod = value;
    }

}
