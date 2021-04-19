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
 * <p>Java class for dotaz complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dotaz"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Pomocne_ID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Typ_vyhledani" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}ares_vyber_typ"/&gt;
 *         &lt;element name="Klicove_polozky" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_request/v_1.0.1}klicove_polozky"/&gt;
 *         &lt;element name="Nazev_obce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}nazev_obce" minOccurs="0"/&gt;
 *         &lt;element name="Pravni_forma" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}kod_pravni_formy" minOccurs="0"/&gt;
 *         &lt;element name="Datum_platnosti" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Typ_registru" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}typ_registru" minOccurs="0"/&gt;
 *         &lt;element name="Max_pocet" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Diakritika" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Aktivni" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Adr_puv" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dotaz", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_request/v_1.0.1", propOrder = {
    "pomocneID",
    "typVyhledani",
    "klicovePolozky",
    "nazevObce",
    "pravniForma",
    "datumPlatnosti",
    "typRegistru",
    "maxPocet",
    "diakritika",
    "aktivni",
    "adrPuv"
})
public class Dotaz {

    @XmlElement(name = "Pomocne_ID")
    protected int pomocneID;
    @XmlElement(name = "Typ_vyhledani", required = true)
    @XmlSchemaType(name = "string")
    protected AresVyberTyp typVyhledani;
    @XmlElement(name = "Klicove_polozky", required = true)
    protected KlicovePolozky klicovePolozky;
    @XmlElement(name = "Nazev_obce")
    protected String nazevObce;
    @XmlElement(name = "Pravni_forma")
    protected Short pravniForma;
    @XmlElement(name = "Datum_platnosti")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumPlatnosti;
    @XmlElement(name = "Typ_registru")
    protected TypRegistru typRegistru;
    @XmlElement(name = "Max_pocet", defaultValue = "10")
    protected Integer maxPocet;
    @XmlElement(name = "Diakritika", defaultValue = "true")
    protected Boolean diakritika;
    @XmlElement(name = "Aktivni", defaultValue = "true")
    protected Boolean aktivni;
    @XmlElement(name = "Adr_puv", defaultValue = "false")
    protected Boolean adrPuv;

    /**
     * Gets the value of the pomocneID property.
     * 
     */
    public int getPomocneID() {
        return pomocneID;
    }

    /**
     * Sets the value of the pomocneID property.
     * 
     */
    public void setPomocneID(int value) {
        this.pomocneID = value;
    }

    /**
     * Gets the value of the typVyhledani property.
     * 
     * @return
     *     possible object is
     *     {@link AresVyberTyp }
     *     
     */
    public AresVyberTyp getTypVyhledani() {
        return typVyhledani;
    }

    /**
     * Sets the value of the typVyhledani property.
     * 
     * @param value
     *     allowed object is
     *     {@link AresVyberTyp }
     *     
     */
    public void setTypVyhledani(AresVyberTyp value) {
        this.typVyhledani = value;
    }

    /**
     * Gets the value of the klicovePolozky property.
     * 
     * @return
     *     possible object is
     *     {@link KlicovePolozky }
     *     
     */
    public KlicovePolozky getKlicovePolozky() {
        return klicovePolozky;
    }

    /**
     * Sets the value of the klicovePolozky property.
     * 
     * @param value
     *     allowed object is
     *     {@link KlicovePolozky }
     *     
     */
    public void setKlicovePolozky(KlicovePolozky value) {
        this.klicovePolozky = value;
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
     * Gets the value of the pravniForma property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPravniForma() {
        return pravniForma;
    }

    /**
     * Sets the value of the pravniForma property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPravniForma(Short value) {
        this.pravniForma = value;
    }

    /**
     * Gets the value of the datumPlatnosti property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumPlatnosti() {
        return datumPlatnosti;
    }

    /**
     * Sets the value of the datumPlatnosti property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumPlatnosti(XMLGregorianCalendar value) {
        this.datumPlatnosti = value;
    }

    /**
     * Gets the value of the typRegistru property.
     * 
     * @return
     *     possible object is
     *     {@link TypRegistru }
     *     
     */
    public TypRegistru getTypRegistru() {
        return typRegistru;
    }

    /**
     * Sets the value of the typRegistru property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypRegistru }
     *     
     */
    public void setTypRegistru(TypRegistru value) {
        this.typRegistru = value;
    }

    /**
     * Gets the value of the maxPocet property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxPocet() {
        return maxPocet;
    }

    /**
     * Sets the value of the maxPocet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxPocet(Integer value) {
        this.maxPocet = value;
    }

    /**
     * Gets the value of the diakritika property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDiakritika() {
        return diakritika;
    }

    /**
     * Sets the value of the diakritika property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDiakritika(Boolean value) {
        this.diakritika = value;
    }

    /**
     * Gets the value of the aktivni property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAktivni() {
        return aktivni;
    }

    /**
     * Sets the value of the aktivni property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAktivni(Boolean value) {
        this.aktivni = value;
    }

    /**
     * Gets the value of the adrPuv property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdrPuv() {
        return adrPuv;
    }

    /**
     * Sets the value of the adrPuv property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdrPuv(Boolean value) {
        this.adrPuv = value;
    }

}
