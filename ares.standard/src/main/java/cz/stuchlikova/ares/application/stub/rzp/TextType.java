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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for textType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="textType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1&gt;text"&gt;
 *       &lt;attribute name="dod" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="ddo" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="zdroj" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}zdroj_type" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "textType", propOrder = {
    "value"
})
public class TextType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "dod")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dod;
    @XmlAttribute(name = "ddo")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar ddo;
    @XmlAttribute(name = "zdroj")
    protected ZdrojType zdroj;

    /**
     * Obecný popis formou textu: jedná se o obecný text, který bývá formátován do řádků, kdy je třeba toto formátování do řádků zachovat a doporučuje se prezentovat text s využitím neproporcionálního písma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the dod property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDod() {
        return dod;
    }

    /**
     * Sets the value of the dod property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDod(XMLGregorianCalendar value) {
        this.dod = value;
    }

    /**
     * Gets the value of the ddo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDdo() {
        return ddo;
    }

    /**
     * Sets the value of the ddo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDdo(XMLGregorianCalendar value) {
        this.ddo = value;
    }

    /**
     * Gets the value of the zdroj property.
     * 
     * @return
     *     possible object is
     *     {@link ZdrojType }
     *     
     */
    public ZdrojType getZdroj() {
        return zdroj;
    }

    /**
     * Sets the value of the zdroj property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZdrojType }
     *     
     */
    public void setZdroj(ZdrojType value) {
        this.zdroj = value;
    }

}
