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
 * <p>Java class for odpoved_sko complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="odpoved_sko"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Pomocne_ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Vysledek_hledani" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}vysledek_hledani" minOccurs="0"/&gt;
 *         &lt;element name="Error" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}error_ARES" minOccurs="0"/&gt;
 *         &lt;element name="Uvod" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}uvod" minOccurs="0"/&gt;
 *         &lt;element name="Vypis_SKO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}subjekt_sko" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "odpoved_sko", propOrder = {
    "pomocneID",
    "vysledekHledani",
    "error",
    "uvod",
    "vypisSKO"
})
public class OdpovedSko {

    @XmlElement(name = "Pomocne_ID")
    protected Integer pomocneID;
    @XmlElement(name = "Vysledek_hledani")
    protected VysledekHledani2 vysledekHledani;
    @XmlElement(name = "Error")
    protected ErrorARES2 error;
    @XmlElement(name = "Uvod")
    protected Uvod2 uvod;
    @XmlElement(name = "Vypis_SKO")
    protected List<SubjektSko> vypisSKO;

    /**
     * Gets the value of the pomocneID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPomocneID() {
        return pomocneID;
    }

    /**
     * Sets the value of the pomocneID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPomocneID(Integer value) {
        this.pomocneID = value;
    }

    /**
     * Gets the value of the vysledekHledani property.
     * 
     * @return
     *     possible object is
     *     {@link VysledekHledani2 }
     *     
     */
    public VysledekHledani2 getVysledekHledani() {
        return vysledekHledani;
    }

    /**
     * Sets the value of the vysledekHledani property.
     * 
     * @param value
     *     allowed object is
     *     {@link VysledekHledani2 }
     *     
     */
    public void setVysledekHledani(VysledekHledani2 value) {
        this.vysledekHledani = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorARES2 }
     *     
     */
    public ErrorARES2 getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorARES2 }
     *     
     */
    public void setError(ErrorARES2 value) {
        this.error = value;
    }

    /**
     * Gets the value of the uvod property.
     * 
     * @return
     *     possible object is
     *     {@link Uvod2 }
     *     
     */
    public Uvod2 getUvod() {
        return uvod;
    }

    /**
     * Sets the value of the uvod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uvod2 }
     *     
     */
    public void setUvod(Uvod2 value) {
        this.uvod = value;
    }

    /**
     * Gets the value of the vypisSKO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vypisSKO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVypisSKO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubjektSko }
     * 
     * 
     */
    public List<SubjektSko> getVypisSKO() {
        if (vypisSKO == null) {
            vypisSKO = new ArrayList<SubjektSko>();
        }
        return this.vypisSKO;
    }

}
