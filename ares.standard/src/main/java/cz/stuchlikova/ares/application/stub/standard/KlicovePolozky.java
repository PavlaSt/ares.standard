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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * Skupina klíčových elementů. 
 * Jednotlivé elementy mohou být vynechány, musí být přítomen alespoň jeden. 
 * Nebude-li ani jeden, je to považováno za závažnou chybu.
 * Za závažnou chybu je považováno nenumerické ič či rč nebo ič delší než 8 znaků a rč kratší než 9 znaků nebo zadání názvu obchodní firmy, na které se vrátí více než Max_pocet odpovědí.
 * Při zjištění deseti závažných chyb dojde k zablokování IP adresy uživatele!
 * 
 * 
 * <p>Java class for klicove_polozky complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="klicove_polozky"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ICO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}ico" minOccurs="0"/&gt;
 *         &lt;element name="Rodne_cislo" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}rodne_cislo" minOccurs="0"/&gt;
 *         &lt;element name="Obchodni_firma" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}obchodni_firma" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "klicove_polozky", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_request/v_1.0.1", propOrder = {
    "ico",
    "rodneCislo",
    "obchodniFirma"
})
public class KlicovePolozky {

    @XmlElement(name = "ICO")
    protected String ico;
    @XmlElement(name = "Rodne_cislo")
    protected String rodneCislo;
    @XmlElement(name = "Obchodni_firma")
    protected String obchodniFirma;

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
     * Gets the value of the rodneCislo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRodneCislo() {
        return rodneCislo;
    }

    /**
     * Sets the value of the rodneCislo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRodneCislo(String value) {
        this.rodneCislo = value;
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

}