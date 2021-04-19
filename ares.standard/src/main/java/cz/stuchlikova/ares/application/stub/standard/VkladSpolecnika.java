//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.19 at 09:56:20 AM CEST 
//


package cz.stuchlikova.ares.application.stub.standard;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Vklad a jeho splacení
 * 
 * <p>Java class for vklad_spolecnika complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vklad_spolecnika"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Vklad" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}vklad" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Splaceno" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}splaceno" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Text_ke_spolecnemu_podilu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}texty" minOccurs="0"/&gt;
 *         &lt;element name="Zastavni_pravo" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}texty" minOccurs="0"/&gt;
 *         &lt;element name="Obchodni_podil" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}texty" minOccurs="0"/&gt;
 *         &lt;element name="Komentar" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}texty" minOccurs="0"/&gt;
 *         &lt;element name="Text_k_uvolnenemu_podilu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}texty" minOccurs="0"/&gt;
 *         &lt;element name="Text" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}texty" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="dod" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="ddo" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vklad_spolecnika", propOrder = {
    "vklad",
    "splaceno",
    "textKeSpolecnemuPodilu",
    "zastavniPravo",
    "obchodniPodil",
    "komentar",
    "textKUvolnenemuPodilu",
    "text"
})
public class VkladSpolecnika {

    @XmlElement(name = "Vklad")
    protected List<Vklad2> vklad;
    @XmlElement(name = "Splaceno")
    protected List<Splaceno2> splaceno;
    @XmlElement(name = "Text_ke_spolecnemu_podilu")
    protected Texty textKeSpolecnemuPodilu;
    @XmlElement(name = "Zastavni_pravo")
    protected Texty zastavniPravo;
    @XmlElement(name = "Obchodni_podil")
    protected Texty obchodniPodil;
    @XmlElement(name = "Komentar")
    protected Texty komentar;
    @XmlElement(name = "Text_k_uvolnenemu_podilu")
    protected Texty textKUvolnenemuPodilu;
    @XmlElement(name = "Text")
    protected Texty text;
    @XmlAttribute(name = "dod")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dod;
    @XmlAttribute(name = "ddo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ddo;

    /**
     * Gets the value of the vklad property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vklad property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVklad().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Vklad2 }
     * 
     * 
     */
    public List<Vklad2> getVklad() {
        if (vklad == null) {
            vklad = new ArrayList<Vklad2>();
        }
        return this.vklad;
    }

    /**
     * Gets the value of the splaceno property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splaceno property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplaceno().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Splaceno2 }
     * 
     * 
     */
    public List<Splaceno2> getSplaceno() {
        if (splaceno == null) {
            splaceno = new ArrayList<Splaceno2>();
        }
        return this.splaceno;
    }

    /**
     * Gets the value of the textKeSpolecnemuPodilu property.
     * 
     * @return
     *     possible object is
     *     {@link Texty }
     *     
     */
    public Texty getTextKeSpolecnemuPodilu() {
        return textKeSpolecnemuPodilu;
    }

    /**
     * Sets the value of the textKeSpolecnemuPodilu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Texty }
     *     
     */
    public void setTextKeSpolecnemuPodilu(Texty value) {
        this.textKeSpolecnemuPodilu = value;
    }

    /**
     * Gets the value of the zastavniPravo property.
     * 
     * @return
     *     possible object is
     *     {@link Texty }
     *     
     */
    public Texty getZastavniPravo() {
        return zastavniPravo;
    }

    /**
     * Sets the value of the zastavniPravo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Texty }
     *     
     */
    public void setZastavniPravo(Texty value) {
        this.zastavniPravo = value;
    }

    /**
     * Gets the value of the obchodniPodil property.
     * 
     * @return
     *     possible object is
     *     {@link Texty }
     *     
     */
    public Texty getObchodniPodil() {
        return obchodniPodil;
    }

    /**
     * Sets the value of the obchodniPodil property.
     * 
     * @param value
     *     allowed object is
     *     {@link Texty }
     *     
     */
    public void setObchodniPodil(Texty value) {
        this.obchodniPodil = value;
    }

    /**
     * Gets the value of the komentar property.
     * 
     * @return
     *     possible object is
     *     {@link Texty }
     *     
     */
    public Texty getKomentar() {
        return komentar;
    }

    /**
     * Sets the value of the komentar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Texty }
     *     
     */
    public void setKomentar(Texty value) {
        this.komentar = value;
    }

    /**
     * Gets the value of the textKUvolnenemuPodilu property.
     * 
     * @return
     *     possible object is
     *     {@link Texty }
     *     
     */
    public Texty getTextKUvolnenemuPodilu() {
        return textKUvolnenemuPodilu;
    }

    /**
     * Sets the value of the textKUvolnenemuPodilu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Texty }
     *     
     */
    public void setTextKUvolnenemuPodilu(Texty value) {
        this.textKUvolnenemuPodilu = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link Texty }
     *     
     */
    public Texty getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link Texty }
     *     
     */
    public void setText(Texty value) {
        this.text = value;
    }

    /**
     * Gets the value of the dod property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDod() {
        return dod;
    }

    /**
     * Sets the value of the dod property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDod(XMLGregorianCalendar value) {
        this.dod = value;
    }

    /**
     * Gets the value of the ddo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDdo() {
        return ddo;
    }

    /**
     * Sets the value of the ddo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDdo(XMLGregorianCalendar value) {
        this.ddo = value;
    }

}
