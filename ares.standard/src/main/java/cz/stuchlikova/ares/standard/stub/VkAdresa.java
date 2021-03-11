//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.10 at 07:21:26 PM CET 
//


package cz.stuchlikova.ares.standard.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Adresy z Ministerstva spravedlnosti ve vazbě na tabulku vk_podnet
 * 
 * <p>Java class for vk_adresa complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vk_adresa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Upadce_spravce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}upadce_spravce_CEU"/&gt;
 *         &lt;element name="Kod_typu_adresy" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="Nazev_okresu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}nazev_okresu" minOccurs="0"/&gt;
 *         &lt;element name="Nazev_obce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}nazev_obce" minOccurs="0"/&gt;
 *         &lt;element name="Nazev_ulice" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}nazev_ulice" minOccurs="0"/&gt;
 *         &lt;element name="Cislo_do_adresy" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}cislo_do_adresy" minOccurs="0"/&gt;
 *         &lt;element name="PSC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}psc" minOccurs="0"/&gt;
 *         &lt;element name="Adresa_ARES" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}adresa_ARES" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vk_adresa", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1", propOrder = {
    "upadceSpravce",
    "kodTypuAdresy",
    "nazevOkresu",
    "nazevObce",
    "nazevUlice",
    "cisloDoAdresy",
    "psc",
    "adresaARES"
})
public class VkAdresa {

    @XmlElement(name = "Upadce_spravce", required = true)
    @XmlSchemaType(name = "string")
    protected UpadceSpravceCEU upadceSpravce;
    @XmlElement(name = "Kod_typu_adresy")
    protected short kodTypuAdresy;
    @XmlElement(name = "Nazev_okresu")
    protected String nazevOkresu;
    @XmlElement(name = "Nazev_obce")
    protected String nazevObce;
    @XmlElement(name = "Nazev_ulice")
    protected String nazevUlice;
    @XmlElement(name = "Cislo_do_adresy")
    protected String cisloDoAdresy;
    @XmlElement(name = "PSC")
    protected String psc;
    @XmlElement(name = "Adresa_ARES")
    protected AdresaARES adresaARES;

    /**
     * Gets the value of the upadceSpravce property.
     * 
     * @return
     *     possible object is
     *     {@link UpadceSpravceCEU }
     *     
     */
    public UpadceSpravceCEU getUpadceSpravce() {
        return upadceSpravce;
    }

    /**
     * Sets the value of the upadceSpravce property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpadceSpravceCEU }
     *     
     */
    public void setUpadceSpravce(UpadceSpravceCEU value) {
        this.upadceSpravce = value;
    }

    /**
     * Gets the value of the kodTypuAdresy property.
     * 
     */
    public short getKodTypuAdresy() {
        return kodTypuAdresy;
    }

    /**
     * Sets the value of the kodTypuAdresy property.
     * 
     */
    public void setKodTypuAdresy(short value) {
        this.kodTypuAdresy = value;
    }

    /**
     * Gets the value of the nazevOkresu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevOkresu() {
        return nazevOkresu;
    }

    /**
     * Sets the value of the nazevOkresu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevOkresu(String value) {
        this.nazevOkresu = value;
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
     * Gets the value of the cisloDoAdresy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCisloDoAdresy() {
        return cisloDoAdresy;
    }

    /**
     * Sets the value of the cisloDoAdresy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCisloDoAdresy(String value) {
        this.cisloDoAdresy = value;
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
     * Gets the value of the adresaARES property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaARES }
     *     
     */
    public AdresaARES getAdresaARES() {
        return adresaARES;
    }

    /**
     * Sets the value of the adresaARES property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaARES }
     *     
     */
    public void setAdresaARES(AdresaARES value) {
        this.adresaARES = value;
    }

}
