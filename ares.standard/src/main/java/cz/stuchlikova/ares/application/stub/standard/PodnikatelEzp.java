//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.19 at 09:56:20 AM CEST 
//


package cz.stuchlikova.ares.application.stub.standard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * údaje o podnikateli v EZP
 * 
 * <p>Java class for podnikatel_ezp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="podnikatel_ezp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Osoba_szr" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}osoba_szr" minOccurs="0"/&gt;
 *         &lt;element name="Angazma_szr" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}angazma_szr" minOccurs="0"/&gt;
 *         &lt;element name="Typ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="1"/&gt;
 *               &lt;enumeration value="2"/&gt;
 *               &lt;enumeration value="3"/&gt;
 *               &lt;enumeration value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rejstr_cislo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Ico" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}ico" minOccurs="0"/&gt;
 *         &lt;element name="Obchodni_jmeno" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}obchodni_firma" minOccurs="0"/&gt;
 *         &lt;element name="Je_adresa_stejna" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}ano_ne" minOccurs="0"/&gt;
 *         &lt;element name="Zahajeni_datum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Zahajeni_typ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;enumeration value="0"/&gt;
 *               &lt;enumeration value="1"/&gt;
 *               &lt;enumeration value="2"/&gt;
 *               &lt;enumeration value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Ukonceni_datum" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Poznamka" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}texty" minOccurs="0"/&gt;
 *         &lt;element name="Zamereni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}texty" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "podnikatel_ezp", propOrder = {
    "osobaSzr",
    "angazmaSzr",
    "typ",
    "rejstrCislo",
    "ico",
    "obchodniJmeno",
    "jeAdresaStejna",
    "zahajeniDatum",
    "zahajeniTyp",
    "ukonceniDatum",
    "poznamka",
    "zamereni"
})
public class PodnikatelEzp {

    @XmlElement(name = "Osoba_szr")
    protected OsobaSzr osobaSzr;
    @XmlElement(name = "Angazma_szr")
    protected AngazmaSzr angazmaSzr;
    @XmlElement(name = "Typ")
    protected String typ;
    @XmlElement(name = "Rejstr_cislo")
    protected Integer rejstrCislo;
    @XmlElement(name = "Ico")
    protected String ico;
    @XmlElement(name = "Obchodni_jmeno")
    protected String obchodniJmeno;
    @XmlElement(name = "Je_adresa_stejna")
    protected String jeAdresaStejna;
    @XmlElement(name = "Zahajeni_datum")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar zahajeniDatum;
    @XmlElement(name = "Zahajeni_typ")
    protected Integer zahajeniTyp;
    @XmlElement(name = "Ukonceni_datum")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ukonceniDatum;
    @XmlElement(name = "Poznamka")
    protected Texty poznamka;
    @XmlElement(name = "Zamereni")
    protected Texty zamereni;

    /**
     * Gets the value of the osobaSzr property.
     * 
     * @return
     *     possible object is
     *     {@link OsobaSzr }
     *     
     */
    public OsobaSzr getOsobaSzr() {
        return osobaSzr;
    }

    /**
     * Sets the value of the osobaSzr property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsobaSzr }
     *     
     */
    public void setOsobaSzr(OsobaSzr value) {
        this.osobaSzr = value;
    }

    /**
     * Gets the value of the angazmaSzr property.
     * 
     * @return
     *     possible object is
     *     {@link AngazmaSzr }
     *     
     */
    public AngazmaSzr getAngazmaSzr() {
        return angazmaSzr;
    }

    /**
     * Sets the value of the angazmaSzr property.
     * 
     * @param value
     *     allowed object is
     *     {@link AngazmaSzr }
     *     
     */
    public void setAngazmaSzr(AngazmaSzr value) {
        this.angazmaSzr = value;
    }

    /**
     * Gets the value of the typ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTyp(String value) {
        this.typ = value;
    }

    /**
     * Gets the value of the rejstrCislo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRejstrCislo() {
        return rejstrCislo;
    }

    /**
     * Sets the value of the rejstrCislo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRejstrCislo(Integer value) {
        this.rejstrCislo = value;
    }

    /**
     * Gets the value of the ico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIco() {
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
    public void setIco(String value) {
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
     * Gets the value of the jeAdresaStejna property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJeAdresaStejna() {
        return jeAdresaStejna;
    }

    /**
     * Sets the value of the jeAdresaStejna property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJeAdresaStejna(String value) {
        this.jeAdresaStejna = value;
    }

    /**
     * Gets the value of the zahajeniDatum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getZahajeniDatum() {
        return zahajeniDatum;
    }

    /**
     * Sets the value of the zahajeniDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setZahajeniDatum(XMLGregorianCalendar value) {
        this.zahajeniDatum = value;
    }

    /**
     * Gets the value of the zahajeniTyp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getZahajeniTyp() {
        return zahajeniTyp;
    }

    /**
     * Sets the value of the zahajeniTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setZahajeniTyp(Integer value) {
        this.zahajeniTyp = value;
    }

    /**
     * Gets the value of the ukonceniDatum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUkonceniDatum() {
        return ukonceniDatum;
    }

    /**
     * Sets the value of the ukonceniDatum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUkonceniDatum(XMLGregorianCalendar value) {
        this.ukonceniDatum = value;
    }

    /**
     * Gets the value of the poznamka property.
     * 
     * @return
     *     possible object is
     *     {@link Texty }
     *     
     */
    public Texty getPoznamka() {
        return poznamka;
    }

    /**
     * Sets the value of the poznamka property.
     * 
     * @param value
     *     allowed object is
     *     {@link Texty }
     *     
     */
    public void setPoznamka(Texty value) {
        this.poznamka = value;
    }

    /**
     * Gets the value of the zamereni property.
     * 
     * @return
     *     possible object is
     *     {@link Texty }
     *     
     */
    public Texty getZamereni() {
        return zamereni;
    }

    /**
     * Sets the value of the zamereni property.
     * 
     * @param value
     *     allowed object is
     *     {@link Texty }
     *     
     */
    public void setZamereni(Texty value) {
        this.zamereni = value;
    }

}
