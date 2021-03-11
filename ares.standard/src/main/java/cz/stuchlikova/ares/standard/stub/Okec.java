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
 * OKEČ - odvětvová klasifikace ekonomických činností (slouží pro dvě různá volání - 1. seznam okečů bez názvu, 2. jeden okeč s názvem
 * 
 * <p>Java class for okec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="okec"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OKEC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}kod_okec" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Nazev_OKEC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}nazev_okec" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "okec", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1", propOrder = {
    "okec",
    "nazevOKEC"
})
public class Okec {

    @XmlElement(name = "OKEC", required = true)
    protected List<KodOkec> okec;
    @XmlElement(name = "Nazev_OKEC")
    protected String nazevOKEC;

    /**
     * Gets the value of the okec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the okec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOKEC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KodOkec }
     * 
     * 
     */
    public List<KodOkec> getOKEC() {
        if (okec == null) {
            okec = new ArrayList<KodOkec>();
        }
        return this.okec;
    }

    /**
     * Gets the value of the nazevOKEC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevOKEC() {
        return nazevOKEC;
    }

    /**
     * Sets the value of the nazevOKEC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevOKEC(String value) {
        this.nazevOKEC = value;
    }

}
