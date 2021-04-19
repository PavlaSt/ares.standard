//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.19 at 09:56:22 AM CEST 
//


package cz.stuchlikova.ares.application.stub.rzp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * příznak změny u subjektu 
 *       (atribut celého popisu příznaku bude jen v Zadani a zde:
 *       N = prvozápis nového subjektu
 *       U = update, změna
 *       Z = zánik subjektu
 *       F = fyzický výmaz subjektu)
 *        
 * 
 * <p>Java class for priznak_zmeny complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="priznak_zmeny"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4&gt;pSimpleType"&gt;
 *       &lt;attribute name="popis" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "priznak_zmeny", propOrder = {
    "value"
})
public class PriznakZmeny {

    @XmlValue
    protected PSimpleType value;
    @XmlAttribute(name = "popis")
    protected String popis;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link PSimpleType }
     *     
     */
    public PSimpleType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link PSimpleType }
     *     
     */
    public void setValue(PSimpleType value) {
        this.value = value;
    }

    /**
     * Gets the value of the popis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPopis() {
        return popis;
    }

    /**
     * Sets the value of the popis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPopis(String value) {
        this.popis = value;
    }

}
