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
 * Příznak úspěšnosti provedení standardizace adresy.
 * 
 * <p>Java class for priz_adresa_ARES complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="priz_adresa_ARES"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Priznaky" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}priznaky_adresa_ARES"/&gt;
 *         &lt;element name="Vstup" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}vstup_adresa_ARES"/&gt;
 *         &lt;element name="Vystup" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}vystup_adresa_ARES"/&gt;
 *         &lt;element name="Prirazeni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}prirazeni_adresa_ARES"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "priz_adresa_ARES", propOrder = {
    "priznaky",
    "vstup",
    "vystup",
    "prirazeni"
})
public class PrizAdresaARES {

    @XmlElement(name = "Priznaky", required = true)
    protected String priznaky;
    @XmlElement(name = "Vstup", required = true)
    protected String vstup;
    @XmlElement(name = "Vystup", required = true)
    protected String vystup;
    @XmlElement(name = "Prirazeni", required = true)
    protected String prirazeni;

    /**
     * Gets the value of the priznaky property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriznaky() {
        return priznaky;
    }

    /**
     * Sets the value of the priznaky property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriznaky(String value) {
        this.priznaky = value;
    }

    /**
     * Gets the value of the vstup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVstup() {
        return vstup;
    }

    /**
     * Sets the value of the vstup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVstup(String value) {
        this.vstup = value;
    }

    /**
     * Gets the value of the vystup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVystup() {
        return vystup;
    }

    /**
     * Sets the value of the vystup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVystup(String value) {
        this.vystup = value;
    }

    /**
     * Gets the value of the prirazeni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrirazeni() {
        return prirazeni;
    }

    /**
     * Sets the value of the prirazeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrirazeni(String value) {
        this.prirazeni = value;
    }

}
