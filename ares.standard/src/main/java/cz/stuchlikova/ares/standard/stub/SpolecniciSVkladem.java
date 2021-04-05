//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.29 at 07:54:38 PM CEST 
//


package cz.stuchlikova.ares.standard.stub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for spolecnici_s_vkladem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="spolecnici_s_vkladem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Jednotlivy_podil" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}jednotlivy_podil" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Spolecny_podil" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}spolecny_podil" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Uvolneny_podil" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}uvolneny_podil" minOccurs="0"/&gt;
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
@XmlType(name = "spolecnici_s_vkladem", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1", propOrder = {
    "jednotlivyPodil",
    "spolecnyPodil",
    "uvolnenyPodil",
    "text"
})
public class SpolecniciSVkladem {

    @XmlElement(name = "Jednotlivy_podil")
    protected List<JednotlivyPodil> jednotlivyPodil;
    @XmlElement(name = "Spolecny_podil")
    protected List<SpolecnyPodil> spolecnyPodil;
    @XmlElement(name = "Uvolneny_podil")
    protected UvolnenyPodil uvolnenyPodil;
    @XmlElement(name = "Text")
    protected String text;

    /**
     * Gets the value of the jednotlivyPodil property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jednotlivyPodil property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJednotlivyPodil().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JednotlivyPodil }
     * 
     * 
     */
    public List<JednotlivyPodil> getJednotlivyPodil() {
        if (jednotlivyPodil == null) {
            jednotlivyPodil = new ArrayList<JednotlivyPodil>();
        }
        return this.jednotlivyPodil;
    }

    /**
     * Gets the value of the spolecnyPodil property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spolecnyPodil property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpolecnyPodil().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpolecnyPodil }
     * 
     * 
     */
    public List<SpolecnyPodil> getSpolecnyPodil() {
        if (spolecnyPodil == null) {
            spolecnyPodil = new ArrayList<SpolecnyPodil>();
        }
        return this.spolecnyPodil;
    }

    /**
     * Gets the value of the uvolnenyPodil property.
     * 
     * @return
     *     possible object is
     *     {@link UvolnenyPodil }
     *     
     */
    public UvolnenyPodil getUvolnenyPodil() {
        return uvolnenyPodil;
    }

    /**
     * Sets the value of the uvolnenyPodil property.
     * 
     * @param value
     *     allowed object is
     *     {@link UvolnenyPodil }
     *     
     */
    public void setUvolnenyPodil(UvolnenyPodil value) {
        this.uvolnenyPodil = value;
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
