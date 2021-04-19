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
 * Výpis z rejstříku živnostenského podnikání v ARES
 * 
 * <p>Java class for vypis_RZP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vypis_RZP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Zakladni_udaje" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}zakladni_udaje_RZP"/&gt;
 *         &lt;element name="Adresy" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}adresy_RZP" minOccurs="0"/&gt;
 *         &lt;element name="Osoby" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}osoby_RZP" minOccurs="0"/&gt;
 *         &lt;element name="Zivnosti" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}zivnosti_RZP" minOccurs="0"/&gt;
 *         &lt;element name="Upadky" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}upadky_RZP" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vypis_RZP", propOrder = {
    "zakladniUdaje",
    "adresy",
    "osoby",
    "zivnosti",
    "upadky"
})
public class VypisRZP2 {

    @XmlElement(name = "Zakladni_udaje", required = true)
    protected ZakladniUdajeRZP2 zakladniUdaje;
    @XmlElement(name = "Adresy")
    protected AdresyRZP adresy;
    @XmlElement(name = "Osoby")
    protected OsobyRZP osoby;
    @XmlElement(name = "Zivnosti")
    protected ZivnostiRZP2 zivnosti;
    @XmlElement(name = "Upadky")
    protected UpadkyRZP upadky;

    /**
     * Gets the value of the zakladniUdaje property.
     * 
     * @return
     *     possible object is
     *     {@link ZakladniUdajeRZP2 }
     *     
     */
    public ZakladniUdajeRZP2 getZakladniUdaje() {
        return zakladniUdaje;
    }

    /**
     * Sets the value of the zakladniUdaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZakladniUdajeRZP2 }
     *     
     */
    public void setZakladniUdaje(ZakladniUdajeRZP2 value) {
        this.zakladniUdaje = value;
    }

    /**
     * Gets the value of the adresy property.
     * 
     * @return
     *     possible object is
     *     {@link AdresyRZP }
     *     
     */
    public AdresyRZP getAdresy() {
        return adresy;
    }

    /**
     * Sets the value of the adresy property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresyRZP }
     *     
     */
    public void setAdresy(AdresyRZP value) {
        this.adresy = value;
    }

    /**
     * Gets the value of the osoby property.
     * 
     * @return
     *     possible object is
     *     {@link OsobyRZP }
     *     
     */
    public OsobyRZP getOsoby() {
        return osoby;
    }

    /**
     * Sets the value of the osoby property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsobyRZP }
     *     
     */
    public void setOsoby(OsobyRZP value) {
        this.osoby = value;
    }

    /**
     * Gets the value of the zivnosti property.
     * 
     * @return
     *     possible object is
     *     {@link ZivnostiRZP2 }
     *     
     */
    public ZivnostiRZP2 getZivnosti() {
        return zivnosti;
    }

    /**
     * Sets the value of the zivnosti property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZivnostiRZP2 }
     *     
     */
    public void setZivnosti(ZivnostiRZP2 value) {
        this.zivnosti = value;
    }

    /**
     * Gets the value of the upadky property.
     * 
     * @return
     *     possible object is
     *     {@link UpadkyRZP }
     *     
     */
    public UpadkyRZP getUpadky() {
        return upadky;
    }

    /**
     * Sets the value of the upadky property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpadkyRZP }
     *     
     */
    public void setUpadky(UpadkyRZP value) {
        this.upadky = value;
    }

}
