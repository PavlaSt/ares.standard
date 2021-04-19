//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.15 at 10:09:56 PM CEST 
//


package cz.stuchlikova.ares.application.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Hlavní tabulka úpadců - slouží zejména pro rozlišení, o jakého úpadce se jedná
 * 
 * <p>Java class for k_upadce complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="k_upadce"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="S_upadce" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="PFC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}pfc"/&gt;
 *         &lt;element name="K_eksubj" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}k_eksubj" minOccurs="0"/&gt;
 *         &lt;element name="K_cosoba" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}k_cosoba" minOccurs="0"/&gt;
 *         &lt;element name="Stav_konkurzu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}stav_upadce_CEU"/&gt;
 *         &lt;element name="Stav_vyrovnani" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}stav_upadce_CEU"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "k_upadce", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1", propOrder = {
    "sUpadce",
    "pfc",
    "kEksubj",
    "kCosoba",
    "stavKonkurzu",
    "stavVyrovnani"
})
public class KUpadce {

    @XmlElement(name = "S_upadce")
    protected int sUpadce;
    @XmlElement(name = "PFC", required = true)
    @XmlSchemaType(name = "string")
    protected Pfc pfc;
    @XmlElement(name = "K_eksubj")
    protected KEksubj kEksubj;
    @XmlElement(name = "K_cosoba")
    protected KCosoba kCosoba;
    @XmlElement(name = "Stav_konkurzu", required = true)
    @XmlSchemaType(name = "string")
    protected StavUpadceCEU stavKonkurzu;
    @XmlElement(name = "Stav_vyrovnani", required = true)
    @XmlSchemaType(name = "string")
    protected StavUpadceCEU stavVyrovnani;

    /**
     * Gets the value of the sUpadce property.
     * 
     */
    public int getSUpadce() {
        return sUpadce;
    }

    /**
     * Sets the value of the sUpadce property.
     * 
     */
    public void setSUpadce(int value) {
        this.sUpadce = value;
    }

    /**
     * Gets the value of the pfc property.
     * 
     * @return
     *     possible object is
     *     {@link Pfc }
     *     
     */
    public Pfc getPFC() {
        return pfc;
    }

    /**
     * Sets the value of the pfc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pfc }
     *     
     */
    public void setPFC(Pfc value) {
        this.pfc = value;
    }

    /**
     * Gets the value of the kEksubj property.
     * 
     * @return
     *     possible object is
     *     {@link KEksubj }
     *     
     */
    public KEksubj getKEksubj() {
        return kEksubj;
    }

    /**
     * Sets the value of the kEksubj property.
     * 
     * @param value
     *     allowed object is
     *     {@link KEksubj }
     *     
     */
    public void setKEksubj(KEksubj value) {
        this.kEksubj = value;
    }

    /**
     * Gets the value of the kCosoba property.
     * 
     * @return
     *     possible object is
     *     {@link KCosoba }
     *     
     */
    public KCosoba getKCosoba() {
        return kCosoba;
    }

    /**
     * Sets the value of the kCosoba property.
     * 
     * @param value
     *     allowed object is
     *     {@link KCosoba }
     *     
     */
    public void setKCosoba(KCosoba value) {
        this.kCosoba = value;
    }

    /**
     * Gets the value of the stavKonkurzu property.
     * 
     * @return
     *     possible object is
     *     {@link StavUpadceCEU }
     *     
     */
    public StavUpadceCEU getStavKonkurzu() {
        return stavKonkurzu;
    }

    /**
     * Sets the value of the stavKonkurzu property.
     * 
     * @param value
     *     allowed object is
     *     {@link StavUpadceCEU }
     *     
     */
    public void setStavKonkurzu(StavUpadceCEU value) {
        this.stavKonkurzu = value;
    }

    /**
     * Gets the value of the stavVyrovnani property.
     * 
     * @return
     *     possible object is
     *     {@link StavUpadceCEU }
     *     
     */
    public StavUpadceCEU getStavVyrovnani() {
        return stavVyrovnani;
    }

    /**
     * Sets the value of the stavVyrovnani property.
     * 
     * @param value
     *     allowed object is
     *     {@link StavUpadceCEU }
     *     
     */
    public void setStavVyrovnani(StavUpadceCEU value) {
        this.stavVyrovnani = value;
    }

}