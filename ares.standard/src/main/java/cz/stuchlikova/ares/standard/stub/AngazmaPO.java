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
import javax.xml.bind.annotation.XmlType;


/**
 * Angažmá právnické osoby
 * 
 * <p>Java class for angazma_PO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="angazma_PO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Funkce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/&gt;
 *         &lt;element name="Pravnicka_osoba" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}pravnicka_osoba"/&gt;
 *         &lt;element name="Text" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "angazma_PO", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1", propOrder = {
    "funkce",
    "pravnickaOsoba",
    "text"
})
public class AngazmaPO {

    @XmlElement(name = "Funkce")
    protected String funkce;
    @XmlElement(name = "Pravnicka_osoba", required = true)
    protected PravnickaOsoba pravnickaOsoba;
    @XmlElement(name = "Text")
    protected String text;

    /**
     * Gets the value of the funkce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunkce() {
        return funkce;
    }

    /**
     * Sets the value of the funkce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunkce(String value) {
        this.funkce = value;
    }

    /**
     * Gets the value of the pravnickaOsoba property.
     * 
     * @return
     *     possible object is
     *     {@link PravnickaOsoba }
     *     
     */
    public PravnickaOsoba getPravnickaOsoba() {
        return pravnickaOsoba;
    }

    /**
     * Sets the value of the pravnickaOsoba property.
     * 
     * @param value
     *     allowed object is
     *     {@link PravnickaOsoba }
     *     
     */
    public void setPravnickaOsoba(PravnickaOsoba value) {
        this.pravnickaOsoba = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

}
