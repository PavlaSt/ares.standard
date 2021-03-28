//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.24 at 03:40:11 PM CET 
//


package cz.stuchlikova.ares.standard.stub;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for udalost complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="udalost"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Platnost_od" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Typ_datumu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}text" minOccurs="0"/&gt;
 *         &lt;element name="Typ_zmeny" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}typ_zmeny" minOccurs="0"/&gt;
 *         &lt;element name="Usneseni" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ID_usneseni" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="Stav" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}stav" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "udalost", propOrder = {
    "platnostOd",
    "typDatumu",
    "typZmeny",
    "usneseni",
    "idUsneseni",
    "stav"
})
public class Udalost {

    @XmlElement(name = "Platnost_od")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar platnostOd;
    @XmlElement(name = "Typ_datumu")
    protected String typDatumu;
    @XmlElement(name = "Typ_zmeny")
    protected TypZmeny2 typZmeny;
    @XmlElement(name = "Usneseni")
    protected Boolean usneseni;
    @XmlElement(name = "ID_usneseni")
    protected BigInteger idUsneseni;
    @XmlElement(name = "Stav")
    protected Stav2 stav;

    /**
     * Gets the value of the platnostOd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlatnostOd() {
        return platnostOd;
    }

    /**
     * Sets the value of the platnostOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlatnostOd(XMLGregorianCalendar value) {
        this.platnostOd = value;
    }

    /**
     * Gets the value of the typDatumu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypDatumu() {
        return typDatumu;
    }

    /**
     * Sets the value of the typDatumu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypDatumu(String value) {
        this.typDatumu = value;
    }

    /**
     * Gets the value of the typZmeny property.
     * 
     * @return
     *     possible object is
     *     {@link TypZmeny2 }
     *     
     */
    public TypZmeny2 getTypZmeny() {
        return typZmeny;
    }

    /**
     * Sets the value of the typZmeny property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypZmeny2 }
     *     
     */
    public void setTypZmeny(TypZmeny2 value) {
        this.typZmeny = value;
    }

    /**
     * Gets the value of the usneseni property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsneseni() {
        return usneseni;
    }

    /**
     * Sets the value of the usneseni property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsneseni(Boolean value) {
        this.usneseni = value;
    }

    /**
     * Gets the value of the idUsneseni property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIDUsneseni() {
        return idUsneseni;
    }

    /**
     * Sets the value of the idUsneseni property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIDUsneseni(BigInteger value) {
        this.idUsneseni = value;
    }

    /**
     * Gets the value of the stav property.
     * 
     * @return
     *     possible object is
     *     {@link Stav2 }
     *     
     */
    public Stav2 getStav() {
        return stav;
    }

    /**
     * Sets the value of the stav property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stav2 }
     *     
     */
    public void setStav(Stav2 value) {
        this.stav = value;
    }

}
