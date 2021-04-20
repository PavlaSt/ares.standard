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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ukon_ezp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ukon_ezp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Stav"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;enumeration value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Typ"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="125"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Cj" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Podani" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Vydani" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Zapis" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Predani" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Vyrazeni" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Vyrazeni_duvod"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="125"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Pravni_predpis" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}texty"/&gt;
 *         &lt;element name="Popis" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}texty"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ukon_ezp", propOrder = {
    "stav",
    "typ",
    "cj",
    "podani",
    "vydani",
    "zapis",
    "predani",
    "vyrazeni",
    "vyrazeniDuvod",
    "pravniPredpis",
    "popis"
})
public class UkonEzp {

    @XmlElement(name = "Stav")
    protected int stav;
    @XmlElement(name = "Typ", required = true)
    protected String typ;
    @XmlElement(name = "Cj")
    protected String cj;
    @XmlElement(name = "Podani", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar podani;
    @XmlElement(name = "Vydani", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vydani;
    @XmlElement(name = "Zapis", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar zapis;
    @XmlElement(name = "Predani", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar predani;
    @XmlElement(name = "Vyrazeni", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vyrazeni;
    @XmlElement(name = "Vyrazeni_duvod", required = true)
    protected String vyrazeniDuvod;
    @XmlElement(name = "Pravni_predpis", required = true)
    protected Texty pravniPredpis;
    @XmlElement(name = "Popis", required = true)
    protected Texty popis;

    /**
     * Gets the value of the stav property.
     * 
     */
    public int getStav() {
        return stav;
    }

    /**
     * Sets the value of the stav property.
     * 
     */
    public void setStav(int value) {
        this.stav = value;
    }

    /**
     * Gets the value of the typ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTyp() {
        return typ;
    }

    /**
     * Sets the value of the typ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTyp(String value) {
        this.typ = value;
    }

    /**
     * Gets the value of the cj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCj() {
        return cj;
    }

    /**
     * Sets the value of the cj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCj(String value) {
        this.cj = value;
    }

    /**
     * Gets the value of the podani property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPodani() {
        return podani;
    }

    /**
     * Sets the value of the podani property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPodani(XMLGregorianCalendar value) {
        this.podani = value;
    }

    /**
     * Gets the value of the vydani property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVydani() {
        return vydani;
    }

    /**
     * Sets the value of the vydani property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVydani(XMLGregorianCalendar value) {
        this.vydani = value;
    }

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
     * Gets the value of the predani property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPredani() {
        return predani;
    }

    /**
     * Sets the value of the predani property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPredani(XMLGregorianCalendar value) {
        this.predani = value;
    }

    /**
     * Gets the value of the vyrazeni property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVyrazeni() {
        return vyrazeni;
    }

    /**
     * Sets the value of the vyrazeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVyrazeni(XMLGregorianCalendar value) {
        this.vyrazeni = value;
    }

    /**
     * Gets the value of the vyrazeniDuvod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVyrazeniDuvod() {
        return vyrazeniDuvod;
    }

    /**
     * Sets the value of the vyrazeniDuvod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVyrazeniDuvod(String value) {
        this.vyrazeniDuvod = value;
    }

    /**
     * Gets the value of the pravniPredpis property.
     * 
     * @return
     *     possible object is
     *     {@link Texty }
     *     
     */
    public Texty getPravniPredpis() {
        return pravniPredpis;
    }

    /**
     * Sets the value of the pravniPredpis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Texty }
     *     
     */
    public void setPravniPredpis(Texty value) {
        this.pravniPredpis = value;
    }

    /**
     * Gets the value of the popis property.
     * 
     * @return
     *     possible object is
     *     {@link Texty }
     *     
     */
    public Texty getPopis() {
        return popis;
    }

    /**
     * Sets the value of the popis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Texty }
     *     
     */
    public void setPopis(Texty value) {
        this.popis = value;
    }

}
