//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.19 at 09:56:20 AM CEST 
//


package cz.stuchlikova.ares.application.stub.standard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for zakladni_udaje_ros complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="zakladni_udaje_ros"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Klic_ARES" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IC" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}ico" minOccurs="0"/&gt;
 *         &lt;element name="Datum_zapisu" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Datum_zmeny" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PF_ROS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}pf_ros" minOccurs="0"/&gt;
 *         &lt;element name="Pravni_stav" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}ps_ros" minOccurs="0"/&gt;
 *         &lt;element name="Datove_schranky" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}datove_schranky" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "zakladni_udaje_ros", propOrder = {
    "klicARES",
    "ic",
    "datumZapisu",
    "datumZmeny",
    "pfros",
    "pravniStav",
    "datoveSchranky"
})
public class ZakladniUdajeRos {

    @XmlElement(name = "Klic_ARES")
    protected Integer klicARES;
    @XmlElement(name = "IC")
    protected String ic;
    @XmlElement(name = "Datum_zapisu")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumZapisu;
    @XmlElement(name = "Datum_zmeny")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar datumZmeny;
    @XmlElement(name = "PF_ROS")
    protected PfRos pfros;
    @XmlElement(name = "Pravni_stav")
    protected PsRos pravniStav;
    @XmlElement(name = "Datove_schranky")
    protected DatoveSchranky datoveSchranky;

    /**
     * Gets the value of the klicARES property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKlicARES() {
        return klicARES;
    }

    /**
     * Sets the value of the klicARES property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKlicARES(Integer value) {
        this.klicARES = value;
    }

    /**
     * Gets the value of the ic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIC() {
        return ic;
    }

    /**
     * Sets the value of the ic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIC(String value) {
        this.ic = value;
    }

    /**
     * Gets the value of the datumZapisu property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumZapisu() {
        return datumZapisu;
    }

    /**
     * Sets the value of the datumZapisu property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumZapisu(XMLGregorianCalendar value) {
        this.datumZapisu = value;
    }

    /**
     * Gets the value of the datumZmeny property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumZmeny() {
        return datumZmeny;
    }

    /**
     * Sets the value of the datumZmeny property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumZmeny(XMLGregorianCalendar value) {
        this.datumZmeny = value;
    }

    /**
     * Gets the value of the pfros property.
     * 
     * @return
     *     possible object is
     *     {@link PfRos }
     *     
     */
    public PfRos getPFROS() {
        return pfros;
    }

    /**
     * Sets the value of the pfros property.
     * 
     * @param value
     *     allowed object is
     *     {@link PfRos }
     *     
     */
    public void setPFROS(PfRos value) {
        this.pfros = value;
    }

    /**
     * Gets the value of the pravniStav property.
     * 
     * @return
     *     possible object is
     *     {@link PsRos }
     *     
     */
    public PsRos getPravniStav() {
        return pravniStav;
    }

    /**
     * Sets the value of the pravniStav property.
     * 
     * @param value
     *     allowed object is
     *     {@link PsRos }
     *     
     */
    public void setPravniStav(PsRos value) {
        this.pravniStav = value;
    }

    /**
     * Gets the value of the datoveSchranky property.
     * 
     * @return
     *     possible object is
     *     {@link DatoveSchranky }
     *     
     */
    public DatoveSchranky getDatoveSchranky() {
        return datoveSchranky;
    }

    /**
     * Sets the value of the datoveSchranky property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatoveSchranky }
     *     
     */
    public void setDatoveSchranky(DatoveSchranky value) {
        this.datoveSchranky = value;
    }

}
