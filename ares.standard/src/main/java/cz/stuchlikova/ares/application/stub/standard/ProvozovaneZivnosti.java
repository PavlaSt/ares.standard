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
 * Údaje o všech živnostech subjektu
 * 
 * <p>Java class for provozovane_zivnosti complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="provozovane_zivnosti"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Pocet_zivnosti" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="Provozovana_zivnost" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}provozovana_zivnost" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "provozovane_zivnosti", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1", propOrder = {
    "pocetZivnosti",
    "provozovanaZivnost"
})
public class ProvozovaneZivnosti {

    @XmlElement(name = "Pocet_zivnosti")
    protected Short pocetZivnosti;
    @XmlElement(name = "Provozovana_zivnost")
    protected List<ProvozovanaZivnost> provozovanaZivnost;

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
     * Gets the value of the provozovanaZivnost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the provozovanaZivnost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProvozovanaZivnost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProvozovanaZivnost }
     * 
     * 
     */
    public List<ProvozovanaZivnost> getProvozovanaZivnost() {
        if (provozovanaZivnost == null) {
            provozovanaZivnost = new ArrayList<ProvozovanaZivnost>();
        }
        return this.provozovanaZivnost;
    }

}
