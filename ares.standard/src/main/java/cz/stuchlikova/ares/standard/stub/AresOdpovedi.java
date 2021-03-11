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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Odpoved" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_answer/v_1.0.1}odpoved" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Fault" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}chybova_odpoved" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="odpoved_datum_cas" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="odpoved_pocet" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="odpoved_typ" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}ares_dotaz_typ" fixed="Standard" /&gt;
 *       &lt;attribute name="vystup_format" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}vystup_format" default="XML" /&gt;
 *       &lt;attribute name="xslt" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}xslt_ks" default="klient" /&gt;
 *       &lt;attribute name="validation_XSLT" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "odpoved",
    "fault"
})
@XmlRootElement(name = "Ares_odpovedi", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_answer/v_1.0.1")
public class AresOdpovedi {

    @XmlElement(name = "Odpoved", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_answer/v_1.0.1", required = true)
    protected List<Odpoved> odpoved;
    @XmlElement(name = "Fault", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_answer/v_1.0.1")
    protected ChybovaOdpoved fault;
    @XmlAttribute(name = "odpoved_datum_cas", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar odpovedDatumCas;
    @XmlAttribute(name = "odpoved_pocet", required = true)
    protected int odpovedPocet;
    @XmlAttribute(name = "odpoved_typ")
    protected AresDotazTyp2 odpovedTyp;
    @XmlAttribute(name = "vystup_format")
    protected VystupFormat2 vystupFormat;
    @XmlAttribute(name = "xslt")
    protected XsltKs2 xslt;
    @XmlAttribute(name = "validation_XSLT", required = true)
    protected String validationXSLT;
    @XmlAttribute(name = "Id", required = true)
    protected String id;

    /**
     * Gets the value of the odpoved property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the odpoved property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOdpoved().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Odpoved }
     * 
     * 
     */
    public List<Odpoved> getOdpoved() {
        if (odpoved == null) {
            odpoved = new ArrayList<Odpoved>();
        }
        return this.odpoved;
    }

    /**
     * Gets the value of the fault property.
     * 
     * @return
     *     possible object is
     *     {@link ChybovaOdpoved }
     *     
     */
    public ChybovaOdpoved getFault() {
        return fault;
    }

    /**
     * Sets the value of the fault property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChybovaOdpoved }
     *     
     */
    public void setFault(ChybovaOdpoved value) {
        this.fault = value;
    }

    /**
     * Gets the value of the odpovedDatumCas property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOdpovedDatumCas() {
        return odpovedDatumCas;
    }

    /**
     * Sets the value of the odpovedDatumCas property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOdpovedDatumCas(XMLGregorianCalendar value) {
        this.odpovedDatumCas = value;
    }

    /**
     * Gets the value of the odpovedPocet property.
     * 
     */
    public int getOdpovedPocet() {
        return odpovedPocet;
    }

    /**
     * Sets the value of the odpovedPocet property.
     * 
     */
    public void setOdpovedPocet(int value) {
        this.odpovedPocet = value;
    }

    /**
     * Gets the value of the odpovedTyp property.
     * 
     * @return
     *     possible object is
     *     {@link AresDotazTyp2 }
     *     
     */
    public AresDotazTyp2 getOdpovedTyp() {
        if (odpovedTyp == null) {
            return AresDotazTyp2 .STANDARD;
        } else {
            return odpovedTyp;
        }
    }

    /**
     * Sets the value of the odpovedTyp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AresDotazTyp2 }
     *     
     */
    public void setOdpovedTyp(AresDotazTyp2 value) {
        this.odpovedTyp = value;
    }

    /**
     * Gets the value of the vystupFormat property.
     * 
     * @return
     *     possible object is
     *     {@link VystupFormat2 }
     *     
     */
    public VystupFormat2 getVystupFormat() {
        if (vystupFormat == null) {
            return VystupFormat2 .XML;
        } else {
            return vystupFormat;
        }
    }

    /**
     * Sets the value of the vystupFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link VystupFormat2 }
     *     
     */
    public void setVystupFormat(VystupFormat2 value) {
        this.vystupFormat = value;
    }

    /**
     * Gets the value of the xslt property.
     * 
     * @return
     *     possible object is
     *     {@link XsltKs2 }
     *     
     */
    public XsltKs2 getXslt() {
        if (xslt == null) {
            return XsltKs2 .KLIENT;
        } else {
            return xslt;
        }
    }

    /**
     * Sets the value of the xslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XsltKs2 }
     *     
     */
    public void setXslt(XsltKs2 value) {
        this.xslt = value;
    }

    /**
     * Gets the value of the validationXSLT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationXSLT() {
        return validationXSLT;
    }

    /**
     * Sets the value of the validationXSLT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationXSLT(String value) {
        this.validationXSLT = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
