//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.19 at 09:56:22 AM CEST 
//


package cz.stuchlikova.ares.application.stub.rzp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for kod_nazev_ovm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kod_nazev_ovm"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KOVM" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/&gt;
 *         &lt;element name="NOVM" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kod_nazev_ovm", propOrder = {
    "kovm",
    "novm"
})
public class KodNazevOvm {

    @XmlElement(name = "KOVM")
    protected String kovm;
    @XmlElement(name = "NOVM")
    protected String novm;

    /**
     * Gets the value of the kovm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKOVM() {
        return kovm;
    }

    /**
     * Sets the value of the kovm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKOVM(String value) {
        this.kovm = value;
    }

    /**
     * Gets the value of the novm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOVM() {
        return novm;
    }

    /**
     * Sets the value of the novm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOVM(String value) {
        this.novm = value;
    }

}
