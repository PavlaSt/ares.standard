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
 * <p>Java class for seznam_navracenych complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="seznam_navracenych"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Adresa_ARES" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}adresa_ARES" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Priz_adr" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}priz_adresa_ARES" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "seznam_navracenych", propOrder = {
    "adresaARES",
    "prizAdr"
})
public class SeznamNavracenych2 {

    @XmlElement(name = "Adresa_ARES")
    protected List<AdresaARES2> adresaARES;
    @XmlElement(name = "Priz_adr")
    protected PrizAdresaARES prizAdr;

    /**
     * Gets the value of the adresaARES property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adresaARES property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdresaARES().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdresaARES2 }
     * 
     * 
     */
    public List<AdresaARES2> getAdresaARES() {
        if (adresaARES == null) {
            adresaARES = new ArrayList<AdresaARES2>();
        }
        return this.adresaARES;
    }

    /**
     * Gets the value of the prizAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PrizAdresaARES }
     *     
     */
    public PrizAdresaARES getPrizAdr() {
        return prizAdr;
    }

    /**
     * Sets the value of the prizAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrizAdresaARES }
     *     
     */
    public void setPrizAdr(PrizAdresaARES value) {
        this.prizAdr = value;
    }

}
