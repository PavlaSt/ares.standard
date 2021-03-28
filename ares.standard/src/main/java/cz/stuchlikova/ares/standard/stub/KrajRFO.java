//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.24 at 03:40:11 PM CET 
//


package cz.stuchlikova.ares.standard.stub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kraj_RFO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kraj_RFO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Kod_kraje" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}kod_kraje"/&gt;
 *         &lt;element name="Nazev" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Okres" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}okres_RFO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kraj_RFO", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1", propOrder = {
    "kodKraje",
    "nazev",
    "okres"
})
public class KrajRFO {

    @XmlElement(name = "Kod_kraje")
    protected short kodKraje;
    @XmlElement(name = "Nazev", required = true)
    protected String nazev;
    @XmlElement(name = "Okres")
    protected List<OkresRFO> okres;

    /**
     * Gets the value of the kodKraje property.
     * 
     */
    public short getKodKraje() {
        return kodKraje;
    }

    /**
     * Sets the value of the kodKraje property.
     * 
     */
    public void setKodKraje(short value) {
        this.kodKraje = value;
    }

    /**
     * Gets the value of the nazev property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazev() {
        return nazev;
    }

    /**
     * Sets the value of the nazev property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazev(String value) {
        this.nazev = value;
    }

    /**
     * Gets the value of the okres property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the okres property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOkres().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OkresRFO }
     * 
     * 
     */
    public List<OkresRFO> getOkres() {
        if (okres == null) {
            okres = new ArrayList<OkresRFO>();
        }
        return this.okres;
    }

}
