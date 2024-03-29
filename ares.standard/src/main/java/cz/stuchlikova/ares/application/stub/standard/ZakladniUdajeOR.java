//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.19 at 09:56:20 AM CEST 
//


package cz.stuchlikova.ares.application.stub.standard;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Základní identifikační a alokační údaje ekonomického subjektu
 * 
 * <p>Java class for zakladni_udaje_OR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zakladni_udaje_OR"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID_vety" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Stav" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}stav"/&gt;
 *         &lt;element name="ICO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}ico" minOccurs="0"/&gt;
 *         &lt;element name="Obchodni_firma" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}obchodni_firma" minOccurs="0"/&gt;
 *         &lt;element name="OF_platnost" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Pravni_forma_OR" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}pravni_forma" minOccurs="0"/&gt;
 *         &lt;element name="PF_zakladatele" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}pravni_forma" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="Sidlo" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}adresa_ARES" minOccurs="0"/&gt;
 *             &lt;element name="Adresa_v_CR" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}adresa_ARES" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="Misto_podnikani" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}adresa_ARES" minOccurs="0"/&gt;
 *             &lt;element name="Fyzicka_osoba" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}fyzicka_osoba" minOccurs="0"/&gt;
 *             &lt;element name="Pobyt_v_CR" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}adresa_ARES" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="Datum_vzniku" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Datum_zaniku" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Platnost_od" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Platnost_do" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Historie"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Veta" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ID_vety" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                             &lt;element name="Platnost_od" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                             &lt;element name="Platnost_do" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                             &lt;element name="Typ_zmeny" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}typ_zmeny" minOccurs="0"/&gt;
 *                             &lt;element name="Specifikace_zmeny" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/&gt;
 *                             &lt;element name="Usneseni" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
@XmlType(name = "zakladni_udaje_OR", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1", propOrder = {
    "idVety",
    "stav",
    "ico",
    "obchodniFirma",
    "ofPlatnost",
    "pravniFormaOR",
    "pfZakladatele",
    "sidlo",
    "adresaVCR",
    "mistoPodnikani",
    "fyzickaOsoba",
    "pobytVCR",
    "datumVzniku",
    "datumZaniku",
    "platnostOd",
    "platnostDo",
    "historie"
})
public class ZakladniUdajeOR {

    @XmlElement(name = "ID_vety")
    protected Integer idVety;
    @XmlElement(name = "Stav", required = true)
    protected Stav stav;
    @XmlElement(name = "ICO")
    protected String ico;
    @XmlElement(name = "Obchodni_firma")
    protected String obchodniFirma;
    @XmlElement(name = "OF_platnost")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ofPlatnost;
    @XmlElement(name = "Pravni_forma_OR")
    protected PravniForma pravniFormaOR;
    @XmlElement(name = "PF_zakladatele")
    protected PravniForma pfZakladatele;
    @XmlElement(name = "Sidlo")
    protected AdresaARES sidlo;
    @XmlElement(name = "Adresa_v_CR")
    protected AdresaARES adresaVCR;
    @XmlElement(name = "Misto_podnikani")
    protected AdresaARES mistoPodnikani;
    @XmlElement(name = "Fyzicka_osoba")
    protected FyzickaOsoba fyzickaOsoba;
    @XmlElement(name = "Pobyt_v_CR")
    protected AdresaARES pobytVCR;
    @XmlElement(name = "Datum_vzniku", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumVzniku;
    @XmlElement(name = "Datum_zaniku")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumZaniku;
    @XmlElement(name = "Platnost_od", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar platnostOd;
    @XmlElement(name = "Platnost_do")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar platnostDo;
    @XmlElement(name = "Historie", required = true)
    protected ZakladniUdajeOR.Historie historie;

    /**
     * Gets the value of the idVety property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIDVety() {
        return idVety;
    }

    /**
     * Sets the value of the idVety property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIDVety(Integer value) {
        this.idVety = value;
    }

    /**
     * Gets the value of the stav property.
     * 
     * @return
     *     possible object is
     *     {@link Stav }
     *     
     */
    public Stav getStav() {
        return stav;
    }

    /**
     * Sets the value of the stav property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stav }
     *     
     */
    public void setStav(Stav value) {
        this.stav = value;
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
     * Gets the value of the ofPlatnost property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOFPlatnost() {
        return ofPlatnost;
    }

    /**
     * Sets the value of the ofPlatnost property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOFPlatnost(XMLGregorianCalendar value) {
        this.ofPlatnost = value;
    }

    /**
     * Gets the value of the pravniFormaOR property.
     * 
     * @return
     *     possible object is
     *     {@link PravniForma }
     *     
     */
    public PravniForma getPravniFormaOR() {
        return pravniFormaOR;
    }

    /**
     * Sets the value of the pravniFormaOR property.
     * 
     * @param value
     *     allowed object is
     *     {@link PravniForma }
     *     
     */
    public void setPravniFormaOR(PravniForma value) {
        this.pravniFormaOR = value;
    }

    /**
     * Gets the value of the pfZakladatele property.
     * 
     * @return
     *     possible object is
     *     {@link PravniForma }
     *     
     */
    public PravniForma getPFZakladatele() {
        return pfZakladatele;
    }

    /**
     * Sets the value of the pfZakladatele property.
     * 
     * @param value
     *     allowed object is
     *     {@link PravniForma }
     *     
     */
    public void setPFZakladatele(PravniForma value) {
        this.pfZakladatele = value;
    }

    /**
     * Gets the value of the sidlo property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaARES }
     *     
     */
    public AdresaARES getSidlo() {
        return sidlo;
    }

    /**
     * Sets the value of the sidlo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaARES }
     *     
     */
    public void setSidlo(AdresaARES value) {
        this.sidlo = value;
    }

    /**
     * Gets the value of the adresaVCR property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaARES }
     *     
     */
    public AdresaARES getAdresaVCR() {
        return adresaVCR;
    }

    /**
     * Sets the value of the adresaVCR property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaARES }
     *     
     */
    public void setAdresaVCR(AdresaARES value) {
        this.adresaVCR = value;
    }

    /**
     * Gets the value of the mistoPodnikani property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaARES }
     *     
     */
    public AdresaARES getMistoPodnikani() {
        return mistoPodnikani;
    }

    /**
     * Sets the value of the mistoPodnikani property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaARES }
     *     
     */
    public void setMistoPodnikani(AdresaARES value) {
        this.mistoPodnikani = value;
    }

    /**
     * Gets the value of the fyzickaOsoba property.
     * 
     * @return
     *     possible object is
     *     {@link FyzickaOsoba }
     *     
     */
    public FyzickaOsoba getFyzickaOsoba() {
        return fyzickaOsoba;
    }

    /**
     * Sets the value of the fyzickaOsoba property.
     * 
     * @param value
     *     allowed object is
     *     {@link FyzickaOsoba }
     *     
     */
    public void setFyzickaOsoba(FyzickaOsoba value) {
        this.fyzickaOsoba = value;
    }

    /**
     * Gets the value of the pobytVCR property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaARES }
     *     
     */
    public AdresaARES getPobytVCR() {
        return pobytVCR;
    }

    /**
     * Sets the value of the pobytVCR property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaARES }
     *     
     */
    public void setPobytVCR(AdresaARES value) {
        this.pobytVCR = value;
    }

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
     * Gets the value of the platnostOd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlatnostOd() {
        return platnostOd;
    }

    /**
     * Sets the value of the platnostOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlatnostOd(XMLGregorianCalendar value) {
        this.platnostOd = value;
    }

    /**
     * Gets the value of the platnostDo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlatnostDo() {
        return platnostDo;
    }

    /**
     * Sets the value of the platnostDo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlatnostDo(XMLGregorianCalendar value) {
        this.platnostDo = value;
    }

    /**
     * Gets the value of the historie property.
     * 
     * @return
     *     possible object is
     *     {@link ZakladniUdajeOR.Historie }
     *     
     */
    public ZakladniUdajeOR.Historie getHistorie() {
        return historie;
    }

    /**
     * Sets the value of the historie property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZakladniUdajeOR.Historie }
     *     
     */
    public void setHistorie(ZakladniUdajeOR.Historie value) {
        this.historie = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Veta" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ID_vety" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                   &lt;element name="Platnost_od" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *                   &lt;element name="Platnost_do" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                   &lt;element name="Typ_zmeny" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}typ_zmeny" minOccurs="0"/&gt;
     *                   &lt;element name="Specifikace_zmeny" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/&gt;
     *                   &lt;element name="Usneseni" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
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
    @XmlType(name = "", propOrder = {
        "veta"
    })
    public static class Historie {

        @XmlElement(name = "Veta", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1", required = true)
        protected List<ZakladniUdajeOR.Historie.Veta> veta;

        /**
         * Gets the value of the veta property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the veta property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVeta().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ZakladniUdajeOR.Historie.Veta }
         * 
         * 
         */
        public List<ZakladniUdajeOR.Historie.Veta> getVeta() {
            if (veta == null) {
                veta = new ArrayList<ZakladniUdajeOR.Historie.Veta>();
            }
            return this.veta;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="ID_vety" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *         &lt;element name="Platnost_od" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
         *         &lt;element name="Platnost_do" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *         &lt;element name="Typ_zmeny" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}typ_zmeny" minOccurs="0"/&gt;
         *         &lt;element name="Specifikace_zmeny" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/&gt;
         *         &lt;element name="Usneseni" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "idVety",
            "platnostOd",
            "platnostDo",
            "typZmeny",
            "specifikaceZmeny",
            "usneseni"
        })
        public static class Veta {

            @XmlElement(name = "ID_vety", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1")
            protected int idVety;
            @XmlElement(name = "Platnost_od", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar platnostOd;
            @XmlElement(name = "Platnost_do", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar platnostDo;
            @XmlElement(name = "Typ_zmeny", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1")
            protected TypZmeny typZmeny;
            @XmlElement(name = "Specifikace_zmeny", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1")
            protected String specifikaceZmeny;
            @XmlElement(name = "Usneseni", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1")
            protected boolean usneseni;

            /**
             * Gets the value of the idVety property.
             * 
             */
            public int getIDVety() {
                return idVety;
            }

            /**
             * Sets the value of the idVety property.
             * 
             */
            public void setIDVety(int value) {
                this.idVety = value;
            }

            /**
             * Gets the value of the platnostOd property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getPlatnostOd() {
                return platnostOd;
            }

            /**
             * Sets the value of the platnostOd property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setPlatnostOd(XMLGregorianCalendar value) {
                this.platnostOd = value;
            }

            /**
             * Gets the value of the platnostDo property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getPlatnostDo() {
                return platnostDo;
            }

            /**
             * Sets the value of the platnostDo property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setPlatnostDo(XMLGregorianCalendar value) {
                this.platnostDo = value;
            }

            /**
             * Gets the value of the typZmeny property.
             * 
             * @return
             *     possible object is
             *     {@link TypZmeny }
             *     
             */
            public TypZmeny getTypZmeny() {
                return typZmeny;
            }

            /**
             * Sets the value of the typZmeny property.
             * 
             * @param value
             *     allowed object is
             *     {@link TypZmeny }
             *     
             */
            public void setTypZmeny(TypZmeny value) {
                this.typZmeny = value;
            }

            /**
             * Gets the value of the specifikaceZmeny property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSpecifikaceZmeny() {
                return specifikaceZmeny;
            }

            /**
             * Sets the value of the specifikaceZmeny property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSpecifikaceZmeny(String value) {
                this.specifikaceZmeny = value;
            }

            /**
             * Gets the value of the usneseni property.
             * 
             */
            public boolean isUsneseni() {
                return usneseni;
            }

            /**
             * Sets the value of the usneseni property.
             * 
             */
            public void setUsneseni(boolean value) {
                this.usneseni = value;
            }

        }

    }

}
