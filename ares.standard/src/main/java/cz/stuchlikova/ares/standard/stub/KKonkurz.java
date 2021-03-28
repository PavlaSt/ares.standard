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


/**
 * Základní údaje o konkurzu z Centrální evidence úpadců  (tab. k_konkurz a dále)
 * 
 * <p>Java class for k_konkurz complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="k_konkurz"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="K_klic" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}k_klic"/&gt;
 *         &lt;element name="K_upadce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}k_upadce"/&gt;
 *         &lt;element name="Poradi" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="Stav_konkurzu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}stav_konkurzu_CEU"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "k_konkurz", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1", propOrder = {
    "kKlic",
    "kUpadce",
    "poradi",
    "stavKonkurzu"
})
public class KKonkurz {

    @XmlElement(name = "K_klic", required = true)
    protected KKlic kKlic;
    @XmlElement(name = "K_upadce", required = true)
    protected KUpadce kUpadce;
    @XmlElement(name = "Poradi")
    protected short poradi;
    @XmlElement(name = "Stav_konkurzu", required = true)
    @XmlSchemaType(name = "string")
    protected StavKonkurzuCEU stavKonkurzu;

    /**
     * Gets the value of the kKlic property.
     * 
     * @return
     *     possible object is
     *     {@link KKlic }
     *     
     */
    public KKlic getKKlic() {
        return kKlic;
    }

    /**
     * Sets the value of the kKlic property.
     * 
     * @param value
     *     allowed object is
     *     {@link KKlic }
     *     
     */
    public void setKKlic(KKlic value) {
        this.kKlic = value;
    }

    /**
     * Gets the value of the kUpadce property.
     * 
     * @return
     *     possible object is
     *     {@link KUpadce }
     *     
     */
    public KUpadce getKUpadce() {
        return kUpadce;
    }

    /**
     * Sets the value of the kUpadce property.
     * 
     * @param value
     *     allowed object is
     *     {@link KUpadce }
     *     
     */
    public void setKUpadce(KUpadce value) {
        this.kUpadce = value;
    }

    /**
     * Gets the value of the poradi property.
     * 
     */
    public short getPoradi() {
        return poradi;
    }

    /**
     * Sets the value of the poradi property.
     * 
     */
    public void setPoradi(short value) {
        this.poradi = value;
    }

    /**
     * Gets the value of the stavKonkurzu property.
     * 
     * @return
     *     possible object is
     *     {@link StavKonkurzuCEU }
     *     
     */
    public StavKonkurzuCEU getStavKonkurzu() {
        return stavKonkurzu;
    }

    /**
     * Sets the value of the stavKonkurzu property.
     * 
     * @param value
     *     allowed object is
     *     {@link StavKonkurzuCEU }
     *     
     */
    public void setStavKonkurzu(StavKonkurzuCEU value) {
        this.stavKonkurzu = value;
    }

}
