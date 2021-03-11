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
 * Výpis detailu jednoho subjektu v CEU po odkazu ze str. Přehledu
 * 
 * <p>Java class for jednotlive_ukony complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jednotlive_ukony"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ukon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="D" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="spzn" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}detailni_spisova_znacka" minOccurs="0"/&gt;
 *         &lt;element name="Soud" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}soud" minOccurs="0"/&gt;
 *         &lt;element name="url_det" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "jednotlive_ukony", propOrder = {
    "ukon",
    "d",
    "spzn",
    "soud",
    "urlDet"
})
public class JednotliveUkony {

    protected String ukon;
    @XmlElement(name = "D")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar d;
    protected DetailniSpisovaZnacka spzn;
    @XmlElement(name = "Soud")
    protected Soud2 soud;
    @XmlElement(name = "url_det")
    protected String urlDet;

    /**
     * Gets the value of the ukon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUkon() {
        return ukon;
    }

    /**
     * Sets the value of the ukon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUkon(String value) {
        this.ukon = value;
    }

    /**
     * Gets the value of the d property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getD() {
        return d;
    }

    /**
     * Sets the value of the d property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setD(XMLGregorianCalendar value) {
        this.d = value;
    }

    /**
     * Gets the value of the spzn property.
     * 
     * @return
     *     possible object is
     *     {@link DetailniSpisovaZnacka }
     *     
     */
    public DetailniSpisovaZnacka getSpzn() {
        return spzn;
    }

    /**
     * Sets the value of the spzn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetailniSpisovaZnacka }
     *     
     */
    public void setSpzn(DetailniSpisovaZnacka value) {
        this.spzn = value;
    }

    /**
     * Gets the value of the soud property.
     * 
     * @return
     *     possible object is
     *     {@link Soud2 }
     *     
     */
    public Soud2 getSoud() {
        return soud;
    }

    /**
     * Sets the value of the soud property.
     * 
     * @param value
     *     allowed object is
     *     {@link Soud2 }
     *     
     */
    public void setSoud(Soud2 value) {
        this.soud = value;
    }

    /**
     * Gets the value of the urlDet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlDet() {
        return urlDet;
    }

    /**
     * Sets the value of the urlDet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlDet(String value) {
        this.urlDet = value;
    }

}
