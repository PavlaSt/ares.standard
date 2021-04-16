//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.15 at 10:09:56 PM CEST 
//


package cz.stuchlikova.ares.standard.stub;

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
 * Jmeni z Kapitálu, nové v 1.0.2 (dtt:Text znovu od 26.1.2010)
 * 
 * <p>Java class for jmeni complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="jmeni"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Podilnik" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}angazma" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Vklad" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}vklad" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Splaceno" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}splaceno" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Text_ke_spolecnemu_podilu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}texty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Zastavni_pravo" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}texty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Obchodni_podil" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}texty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Komentar" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}texty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Text_k_uvolnenemu_podilu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}texty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Text" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}text" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "jmeni", propOrder = {
    "podilnik",
    "vklad",
    "splaceno",
    "textKeSpolecnemuPodilu",
    "zastavniPravo",
    "obchodniPodil",
    "komentar",
    "textKUvolnenemuPodilu",
    "text"
})
public class Jmeni {

    @XmlElement(name = "Podilnik")
    protected List<Angazma> podilnik;
    @XmlElement(name = "Vklad")
    protected List<Vklad2> vklad;
    @XmlElement(name = "Splaceno")
    protected List<Splaceno2> splaceno;
    @XmlElement(name = "Text_ke_spolecnemu_podilu")
    protected List<Texty> textKeSpolecnemuPodilu;
    @XmlElement(name = "Zastavni_pravo")
    protected List<Texty> zastavniPravo;
    @XmlElement(name = "Obchodni_podil")
    protected List<Texty> obchodniPodil;
    @XmlElement(name = "Komentar")
    protected List<Texty> komentar;
    @XmlElement(name = "Text_k_uvolnenemu_podilu")
    protected List<Texty> textKUvolnenemuPodilu;
    @XmlElement(name = "Text")
    protected List<String> text;
    @XmlAttribute(name = "dod")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dod;
    @XmlAttribute(name = "ddo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ddo;

    /**
     * Gets the value of the podilnik property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the podilnik property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPodilnik().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Angazma }
     * 
     * 
     */
    public List<Angazma> getPodilnik() {
        if (podilnik == null) {
            podilnik = new ArrayList<Angazma>();
        }
        return this.podilnik;
    }

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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textKeSpolecnemuPodilu property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextKeSpolecnemuPodilu().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Texty }
     * 
     * 
     */
    public List<Texty> getTextKeSpolecnemuPodilu() {
        if (textKeSpolecnemuPodilu == null) {
            textKeSpolecnemuPodilu = new ArrayList<Texty>();
        }
        return this.textKeSpolecnemuPodilu;
    }

    /**
     * Gets the value of the zastavniPravo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zastavniPravo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZastavniPravo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Texty }
     * 
     * 
     */
    public List<Texty> getZastavniPravo() {
        if (zastavniPravo == null) {
            zastavniPravo = new ArrayList<Texty>();
        }
        return this.zastavniPravo;
    }

    /**
     * Gets the value of the obchodniPodil property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the obchodniPodil property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObchodniPodil().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Texty }
     * 
     * 
     */
    public List<Texty> getObchodniPodil() {
        if (obchodniPodil == null) {
            obchodniPodil = new ArrayList<Texty>();
        }
        return this.obchodniPodil;
    }

    /**
     * Gets the value of the komentar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the komentar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKomentar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Texty }
     * 
     * 
     */
    public List<Texty> getKomentar() {
        if (komentar == null) {
            komentar = new ArrayList<Texty>();
        }
        return this.komentar;
    }

    /**
     * Gets the value of the textKUvolnenemuPodilu property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textKUvolnenemuPodilu property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextKUvolnenemuPodilu().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Texty }
     * 
     * 
     */
    public List<Texty> getTextKUvolnenemuPodilu() {
        if (textKUvolnenemuPodilu == null) {
            textKUvolnenemuPodilu = new ArrayList<Texty>();
        }
        return this.textKUvolnenemuPodilu;
    }

    /**
     * Gets the value of the text property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the text property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getText() {
        if (text == null) {
            text = new ArrayList<String>();
        }
        return this.text;
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
