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
import javax.xml.bind.annotation.XmlType;


/**
 * údaje o angažmá v SZR
 * 
 * <p>Java class for angazma_szr complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="angazma_szr"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Eu" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Adresa_typ" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;enumeration value="0"/&gt;
 *               &lt;enumeration value="1"/&gt;
 *               &lt;enumeration value="2"/&gt;
 *               &lt;enumeration value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Oid_adresa_mimoCR_stat" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Adresa_mimoCR_txt" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}texty" minOccurs="0"/&gt;
 *         &lt;element name="Odborna_zpusobilost" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;enumeration value="0"/&gt;
 *               &lt;enumeration value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Zakaz" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;enumeration value="0"/&gt;
 *               &lt;enumeration value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Prekazka" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;enumeration value="0"/&gt;
 *               &lt;enumeration value="1"/&gt;
 *               &lt;enumeration value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Poznamka" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}texty" minOccurs="0"/&gt;
 *         &lt;element name="Je_fyzicka_osoba" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}ano_ne" minOccurs="0"/&gt;
 *         &lt;element name="Je_odp_zastupce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}ano_ne" minOccurs="0"/&gt;
 *         &lt;element name="Je_statut_organ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}ano_ne" minOccurs="0"/&gt;
 *         &lt;element name="Je_vedouci_org_slozky" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}ano_ne" minOccurs="0"/&gt;
 *         &lt;element name="Je_pravni_nastupce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}ano_ne" minOccurs="0"/&gt;
 *         &lt;element name="Je_podnikatel" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}ano_ne" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "angazma_szr", propOrder = {
    "eu",
    "adresaTyp",
    "oidAdresaMimoCRStat",
    "adresaMimoCRTxt",
    "odbornaZpusobilost",
    "zakaz",
    "prekazka",
    "poznamka",
    "jeFyzickaOsoba",
    "jeOdpZastupce",
    "jeStatutOrgan",
    "jeVedouciOrgSlozky",
    "jePravniNastupce",
    "jePodnikatel"
})
public class AngazmaSzr {

    @XmlElement(name = "Eu")
    protected Integer eu;
    @XmlElement(name = "Adresa_typ")
    protected Integer adresaTyp;
    @XmlElement(name = "Oid_adresa_mimoCR_stat")
    protected Long oidAdresaMimoCRStat;
    @XmlElement(name = "Adresa_mimoCR_txt")
    protected Texty adresaMimoCRTxt;
    @XmlElement(name = "Odborna_zpusobilost")
    protected Integer odbornaZpusobilost;
    @XmlElement(name = "Zakaz")
    protected Integer zakaz;
    @XmlElement(name = "Prekazka")
    protected Integer prekazka;
    @XmlElement(name = "Poznamka")
    protected Texty poznamka;
    @XmlElement(name = "Je_fyzicka_osoba")
    protected String jeFyzickaOsoba;
    @XmlElement(name = "Je_odp_zastupce")
    protected String jeOdpZastupce;
    @XmlElement(name = "Je_statut_organ")
    protected String jeStatutOrgan;
    @XmlElement(name = "Je_vedouci_org_slozky")
    protected String jeVedouciOrgSlozky;
    @XmlElement(name = "Je_pravni_nastupce")
    protected String jePravniNastupce;
    @XmlElement(name = "Je_podnikatel")
    protected String jePodnikatel;

    /**
     * Gets the value of the eu property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEu() {
        return eu;
    }

    /**
     * Sets the value of the eu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEu(Integer value) {
        this.eu = value;
    }

    /**
     * Gets the value of the adresaTyp property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAdresaTyp() {
        return adresaTyp;
    }

    /**
     * Sets the value of the adresaTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAdresaTyp(Integer value) {
        this.adresaTyp = value;
    }

    /**
     * Gets the value of the oidAdresaMimoCRStat property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOidAdresaMimoCRStat() {
        return oidAdresaMimoCRStat;
    }

    /**
     * Sets the value of the oidAdresaMimoCRStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOidAdresaMimoCRStat(Long value) {
        this.oidAdresaMimoCRStat = value;
    }

    /**
     * Gets the value of the adresaMimoCRTxt property.
     * 
     * @return
     *     possible object is
     *     {@link Texty }
     *     
     */
    public Texty getAdresaMimoCRTxt() {
        return adresaMimoCRTxt;
    }

    /**
     * Sets the value of the adresaMimoCRTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Texty }
     *     
     */
    public void setAdresaMimoCRTxt(Texty value) {
        this.adresaMimoCRTxt = value;
    }

    /**
     * Gets the value of the odbornaZpusobilost property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOdbornaZpusobilost() {
        return odbornaZpusobilost;
    }

    /**
     * Sets the value of the odbornaZpusobilost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOdbornaZpusobilost(Integer value) {
        this.odbornaZpusobilost = value;
    }

    /**
     * Gets the value of the zakaz property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getZakaz() {
        return zakaz;
    }

    /**
     * Sets the value of the zakaz property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setZakaz(Integer value) {
        this.zakaz = value;
    }

    /**
     * Gets the value of the prekazka property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPrekazka() {
        return prekazka;
    }

    /**
     * Sets the value of the prekazka property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrekazka(Integer value) {
        this.prekazka = value;
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
     * Gets the value of the jeFyzickaOsoba property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJeFyzickaOsoba() {
        return jeFyzickaOsoba;
    }

    /**
     * Sets the value of the jeFyzickaOsoba property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJeFyzickaOsoba(String value) {
        this.jeFyzickaOsoba = value;
    }

    /**
     * Gets the value of the jeOdpZastupce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJeOdpZastupce() {
        return jeOdpZastupce;
    }

    /**
     * Sets the value of the jeOdpZastupce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJeOdpZastupce(String value) {
        this.jeOdpZastupce = value;
    }

    /**
     * Gets the value of the jeStatutOrgan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJeStatutOrgan() {
        return jeStatutOrgan;
    }

    /**
     * Sets the value of the jeStatutOrgan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJeStatutOrgan(String value) {
        this.jeStatutOrgan = value;
    }

    /**
     * Gets the value of the jeVedouciOrgSlozky property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJeVedouciOrgSlozky() {
        return jeVedouciOrgSlozky;
    }

    /**
     * Sets the value of the jeVedouciOrgSlozky property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJeVedouciOrgSlozky(String value) {
        this.jeVedouciOrgSlozky = value;
    }

    /**
     * Gets the value of the jePravniNastupce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJePravniNastupce() {
        return jePravniNastupce;
    }

    /**
     * Sets the value of the jePravniNastupce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJePravniNastupce(String value) {
        this.jePravniNastupce = value;
    }

    /**
     * Gets the value of the jePodnikatel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJePodnikatel() {
        return jePodnikatel;
    }

    /**
     * Sets the value of the jePodnikatel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJePodnikatel(String value) {
        this.jePodnikatel = value;
    }

}
