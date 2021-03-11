//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.10 at 07:21:26 PM CET 
//


package cz.stuchlikova.ares.standard.stub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Údaje o všech živnostech subjektu
 * 
 * <p>Java class for zivnosti_RZP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zivnosti_RZP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Pocet_zivnosti" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="Zivnost" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}zivnost" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zivnosti_RZP", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1", propOrder = {
    "pocetZivnosti",
    "zivnost"
})
public class ZivnostiRZP {

    @XmlElement(name = "Pocet_zivnosti")
    protected Short pocetZivnosti;
    @XmlElement(name = "Zivnost")
    protected List<Zivnost> zivnost;

    /**
     * Gets the value of the pocetZivnosti property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPocetZivnosti() {
        return pocetZivnosti;
    }

    /**
     * Sets the value of the pocetZivnosti property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPocetZivnosti(Short value) {
        this.pocetZivnosti = value;
    }

    /**
     * Gets the value of the zivnost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zivnost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZivnost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Zivnost }
     * 
     * 
     */
    public List<Zivnost> getZivnost() {
        if (zivnost == null) {
            zivnost = new ArrayList<Zivnost>();
        }
        return this.zivnost;
    }

}
