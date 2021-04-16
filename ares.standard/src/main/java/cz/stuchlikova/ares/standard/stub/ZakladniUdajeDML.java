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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Základní identifikační a alokační údaje ekonomického subjektu v Seznamu devizových míst a licencí
 * 
 * <p>Java class for zakladni_udaje_DML complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zakladni_udaje_DML"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ICO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}ico" minOccurs="0"/&gt;
 *         &lt;element name="Obchodni_jmeno" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}obchodni_firma" minOccurs="0"/&gt;
 *         &lt;element name="Adresa" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}adresa_ARES" minOccurs="0"/&gt;
 *         &lt;element name="Typ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}typ_licence" minOccurs="0"/&gt;
 *         &lt;element name="Datum_udeleni" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Evid_cislo" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/&gt;
 *         &lt;element name="Ucinnost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Rozsah" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zakladni_udaje_DML", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1", propOrder = {
    "ico",
    "obchodniJmeno",
    "adresa",
    "typ",
    "datumUdeleni",
    "evidCislo",
    "ucinnost",
    "rozsah"
})
public class ZakladniUdajeDML {

    @XmlElement(name = "ICO")
    protected String ico;
    @XmlElement(name = "Obchodni_jmeno")
    protected String obchodniJmeno;
    @XmlElement(name = "Adresa")
    protected AdresaARES adresa;
    @XmlElement(name = "Typ")
    @XmlSchemaType(name = "string")
    protected TypLicence typ;
    @XmlElement(name = "Datum_udeleni")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumUdeleni;
    @XmlElement(name = "Evid_cislo")
    protected String evidCislo;
    @XmlElement(name = "Ucinnost")
    protected String ucinnost;
    @XmlElement(name = "Rozsah")
    protected String rozsah;

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
     * Gets the value of the obchodniJmeno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObchodniJmeno() {
        return obchodniJmeno;
    }

    /**
     * Sets the value of the obchodniJmeno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObchodniJmeno(String value) {
        this.obchodniJmeno = value;
    }

    /**
     * Gets the value of the adresa property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaARES }
     *     
     */
    public AdresaARES getAdresa() {
        return adresa;
    }

    /**
     * Sets the value of the adresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaARES }
     *     
     */
    public void setAdresa(AdresaARES value) {
        this.adresa = value;
    }

    /**
     * Gets the value of the typ property.
     * 
     * @return
     *     possible object is
     *     {@link TypLicence }
     *     
     */
    public TypLicence getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypLicence }
     *     
     */
    public void setTyp(TypLicence value) {
        this.typ = value;
    }

    /**
     * Gets the value of the datumUdeleni property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumUdeleni() {
        return datumUdeleni;
    }

    /**
     * Sets the value of the datumUdeleni property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumUdeleni(XMLGregorianCalendar value) {
        this.datumUdeleni = value;
    }

    /**
     * Gets the value of the evidCislo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvidCislo() {
        return evidCislo;
    }

    /**
     * Sets the value of the evidCislo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvidCislo(String value) {
        this.evidCislo = value;
    }

    /**
     * Gets the value of the ucinnost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUcinnost() {
        return ucinnost;
    }

    /**
     * Sets the value of the ucinnost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUcinnost(String value) {
        this.ucinnost = value;
    }

    /**
     * Gets the value of the rozsah property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRozsah() {
        return rozsah;
    }

    /**
     * Sets the value of the rozsah property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRozsah(String value) {
        this.rozsah = value;
    }

}
