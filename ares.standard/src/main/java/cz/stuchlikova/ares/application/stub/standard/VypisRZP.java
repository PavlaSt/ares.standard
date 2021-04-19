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
 *         &lt;element name="Uvod" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}uvod" minOccurs="0"/&gt;
 *         &lt;element name="Zakladni_udaje" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}zakladni_udaje_RZP"/&gt;
 *         &lt;element name="Registrace" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}registrace_RZP" minOccurs="0"/&gt;
 *         &lt;element name="Zivnosti" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}zivnosti_RZP" minOccurs="0"/&gt;
 *         &lt;element name="Pocet_provozoven" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Provozovny" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}provozovny_RZP" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vypis_RZP", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1", propOrder = {
    "uvod",
    "zakladniUdaje",
    "registrace",
    "zivnosti",
    "pocetProvozoven",
    "provozovny"
})
public class VypisRZP {

    @XmlElement(name = "Uvod")
    protected Uvod uvod;
    @XmlElement(name = "Zakladni_udaje", required = true)
    protected ZakladniUdajeRZP zakladniUdaje;
    @XmlElement(name = "Registrace")
    protected RegistraceRZP registrace;
    @XmlElement(name = "Zivnosti")
    protected ZivnostiRZP zivnosti;
    @XmlElement(name = "Pocet_provozoven")
    protected Integer pocetProvozoven;
    @XmlElement(name = "Provozovny")
    protected ProvozovnyRZP provozovny;

    /**
     * Gets the value of the uvod property.
     * 
     * @return
     *     possible object is
     *     {@link Uvod }
     *     
     */
    public Uvod getUvod() {
        return uvod;
    }

    /**
     * Sets the value of the uvod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uvod }
     *     
     */
    public void setUvod(Uvod value) {
        this.uvod = value;
    }

    /**
     * Gets the value of the zakladniUdaje property.
     * 
     * @return
     *     possible object is
     *     {@link ZakladniUdajeRZP }
     *     
     */
    public ZakladniUdajeRZP getZakladniUdaje() {
        return zakladniUdaje;
    }

    /**
     * Sets the value of the zakladniUdaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZakladniUdajeRZP }
     *     
     */
    public void setZakladniUdaje(ZakladniUdajeRZP value) {
        this.zakladniUdaje = value;
    }

    /**
     * Gets the value of the registrace property.
     * 
     * @return
     *     possible object is
     *     {@link RegistraceRZP }
     *     
     */
    public RegistraceRZP getRegistrace() {
        return registrace;
    }

    /**
     * Sets the value of the registrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistraceRZP }
     *     
     */
    public void setRegistrace(RegistraceRZP value) {
        this.registrace = value;
    }

    /**
     * Gets the value of the zivnosti property.
     * 
     * @return
     *     possible object is
     *     {@link ZivnostiRZP }
     *     
     */
    public ZivnostiRZP getZivnosti() {
        return zivnosti;
    }

    /**
     * Sets the value of the zivnosti property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZivnostiRZP }
     *     
     */
    public void setZivnosti(ZivnostiRZP value) {
        this.zivnosti = value;
    }

    /**
     * Gets the value of the pocetProvozoven property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPocetProvozoven() {
        return pocetProvozoven;
    }

    /**
     * Sets the value of the pocetProvozoven property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPocetProvozoven(Integer value) {
        this.pocetProvozoven = value;
    }

    /**
     * Gets the value of the provozovny property.
     * 
     * @return
     *     possible object is
     *     {@link ProvozovnyRZP }
     *     
     */
    public ProvozovnyRZP getProvozovny() {
        return provozovny;
    }

    /**
     * Sets the value of the provozovny property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvozovnyRZP }
     *     
     */
    public void setProvozovny(ProvozovnyRZP value) {
        this.provozovny = value;
    }

}
