//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.24 at 03:40:11 PM CET 
//


package cz.stuchlikova.ares.standard.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * údaje o angažmá v SKO
 * 
 * <p>Java class for angaz_sko complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="angaz_sko"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Datum_vzniku" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Datum_zaniku" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Funkce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}funkce_sko" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Pravnicka_osoba" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}pravnicka_osoba_sko"/&gt;
 *           &lt;element name="Fyzicka_osoba" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}fyzicka_osoba_sko"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "angaz_sko", propOrder = {
    "datumVzniku",
    "datumZaniku",
    "funkce",
    "pravnickaOsoba",
    "fyzickaOsoba"
})
public class AngazSko {

    @XmlElement(name = "Datum_vzniku")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumVzniku;
    @XmlElement(name = "Datum_zaniku")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumZaniku;
    @XmlElement(name = "Funkce")
    protected FunkceSko funkce;
    @XmlElement(name = "Pravnicka_osoba")
    protected PravnickaOsobaSko pravnickaOsoba;
    @XmlElement(name = "Fyzicka_osoba")
    protected FyzickaOsobaSko fyzickaOsoba;

    /**
     * Gets the value of the datumVzniku property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumVzniku() {
        return datumVzniku;
    }

    /**
     * Sets the value of the datumVzniku property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumVzniku(XMLGregorianCalendar value) {
        this.datumVzniku = value;
    }

    /**
     * Gets the value of the datumZaniku property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumZaniku() {
        return datumZaniku;
    }

    /**
     * Sets the value of the datumZaniku property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumZaniku(XMLGregorianCalendar value) {
        this.datumZaniku = value;
    }

    /**
     * Gets the value of the funkce property.
     * 
     * @return
     *     possible object is
     *     {@link FunkceSko }
     *     
     */
    public FunkceSko getFunkce() {
        return funkce;
    }

    /**
     * Sets the value of the funkce property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunkceSko }
     *     
     */
    public void setFunkce(FunkceSko value) {
        this.funkce = value;
    }

    /**
     * Gets the value of the pravnickaOsoba property.
     * 
     * @return
     *     possible object is
     *     {@link PravnickaOsobaSko }
     *     
     */
    public PravnickaOsobaSko getPravnickaOsoba() {
        return pravnickaOsoba;
    }

    /**
     * Sets the value of the pravnickaOsoba property.
     * 
     * @param value
     *     allowed object is
     *     {@link PravnickaOsobaSko }
     *     
     */
    public void setPravnickaOsoba(PravnickaOsobaSko value) {
        this.pravnickaOsoba = value;
    }

    /**
     * Gets the value of the fyzickaOsoba property.
     * 
     * @return
     *     possible object is
     *     {@link FyzickaOsobaSko }
     *     
     */
    public FyzickaOsobaSko getFyzickaOsoba() {
        return fyzickaOsoba;
    }

    /**
     * Sets the value of the fyzickaOsoba property.
     * 
     * @param value
     *     allowed object is
     *     {@link FyzickaOsobaSko }
     *     
     */
    public void setFyzickaOsoba(FyzickaOsobaSko value) {
        this.fyzickaOsoba = value;
    }

}
