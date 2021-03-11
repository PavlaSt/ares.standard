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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Údaje o jedné živnosti
 * 
 * <p>Java class for upadek complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="upadek"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Zapis" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Platnost" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Typ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}typ_upadku"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "upadek", propOrder = {
    "zapis",
    "platnost",
    "typ"
})
public class Upadek {

    @XmlElement(name = "Zapis", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar zapis;
    @XmlElement(name = "Platnost")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar platnost;
    @XmlElement(name = "Typ", required = true)
    @XmlSchemaType(name = "string")
    protected TypUpadku typ;

    /**
     * Gets the value of the zapis property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getZapis() {
        return zapis;
    }

    /**
     * Sets the value of the zapis property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setZapis(XMLGregorianCalendar value) {
        this.zapis = value;
    }

    /**
     * Gets the value of the platnost property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlatnost() {
        return platnost;
    }

    /**
     * Sets the value of the platnost property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlatnost(XMLGregorianCalendar value) {
        this.platnost = value;
    }

    /**
     * Gets the value of the typ property.
     * 
     * @return
     *     possible object is
     *     {@link TypUpadku }
     *     
     */
    public TypUpadku getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypUpadku }
     *     
     */
    public void setTyp(TypUpadku value) {
        this.typ = value;
    }

}
