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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifické údaje o konkurzu
 * 
 * <p>Java class for konkurz complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="konkurz"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Udaje_KVZ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}udaje_KVZ"/&gt;
 *         &lt;element name="Spravce_KP" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}spravce" minOccurs="0"/&gt;
 *         &lt;element name="Zastupce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}spravce" minOccurs="0"/&gt;
 *         &lt;element name="Zvlastni_spravce" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}spravce" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "konkurz", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1", propOrder = {
    "udajeKVZ",
    "spravceKP",
    "zastupce",
    "zvlastniSpravce"
})
public class Konkurz {

    @XmlElement(name = "Udaje_KVZ", required = true)
    protected UdajeKVZ udajeKVZ;
    @XmlElement(name = "Spravce_KP")
    protected Spravce spravceKP;
    @XmlElement(name = "Zastupce")
    protected Spravce zastupce;
    @XmlElement(name = "Zvlastni_spravce")
    protected List<Spravce> zvlastniSpravce;

    /**
     * Gets the value of the udajeKVZ property.
     * 
     * @return
     *     possible object is
     *     {@link UdajeKVZ }
     *     
     */
    public UdajeKVZ getUdajeKVZ() {
        return udajeKVZ;
    }

    /**
     * Sets the value of the udajeKVZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link UdajeKVZ }
     *     
     */
    public void setUdajeKVZ(UdajeKVZ value) {
        this.udajeKVZ = value;
    }

    /**
     * Gets the value of the spravceKP property.
     * 
     * @return
     *     possible object is
     *     {@link Spravce }
     *     
     */
    public Spravce getSpravceKP() {
        return spravceKP;
    }

    /**
     * Sets the value of the spravceKP property.
     * 
     * @param value
     *     allowed object is
     *     {@link Spravce }
     *     
     */
    public void setSpravceKP(Spravce value) {
        this.spravceKP = value;
    }

    /**
     * Gets the value of the zastupce property.
     * 
     * @return
     *     possible object is
     *     {@link Spravce }
     *     
     */
    public Spravce getZastupce() {
        return zastupce;
    }

    /**
     * Sets the value of the zastupce property.
     * 
     * @param value
     *     allowed object is
     *     {@link Spravce }
     *     
     */
    public void setZastupce(Spravce value) {
        this.zastupce = value;
    }

    /**
     * Gets the value of the zvlastniSpravce property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zvlastniSpravce property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZvlastniSpravce().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Spravce }
     * 
     * 
     */
    public List<Spravce> getZvlastniSpravce() {
        if (zvlastniSpravce == null) {
            zvlastniSpravce = new ArrayList<Spravce>();
        }
        return this.zvlastniSpravce;
    }

}
