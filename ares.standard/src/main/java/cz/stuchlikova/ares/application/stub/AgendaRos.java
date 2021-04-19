//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.15 at 10:09:56 PM CEST 
//


package cz.stuchlikova.ares.application.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for agenda_ros complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="agenda_ros"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Agenda" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}agenda_kod_nazev" minOccurs="0"/&gt;
 *         &lt;element name="OVM" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}kod_nazev_ovm" minOccurs="0"/&gt;
 *         &lt;element name="OF_ROS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}of_ros" minOccurs="0"/&gt;
 *         &lt;element name="Sidlo_ROS" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}sidlo_ros" minOccurs="0"/&gt;
 *         &lt;element name="Platnost_od" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}datum_ros" minOccurs="0"/&gt;
 *         &lt;element name="Platnost_do" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}datum_ros" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "agenda_ros", propOrder = {
    "agenda",
    "ovm",
    "ofros",
    "sidloROS",
    "platnostOd",
    "platnostDo"
})
public class AgendaRos {

    @XmlElement(name = "Agenda")
    protected AgendaKodNazev agenda;
    @XmlElement(name = "OVM")
    protected KodNazevOvm ovm;
    @XmlElement(name = "OF_ROS")
    protected OfRos ofros;
    @XmlElement(name = "Sidlo_ROS")
    protected SidloRos sidloROS;
    @XmlElement(name = "Platnost_od")
    protected DatumRos platnostOd;
    @XmlElement(name = "Platnost_do")
    protected DatumRos platnostDo;

    /**
     * Gets the value of the agenda property.
     * 
     * @return
     *     possible object is
     *     {@link AgendaKodNazev }
     *     
     */
    public AgendaKodNazev getAgenda() {
        return agenda;
    }

    /**
     * Sets the value of the agenda property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgendaKodNazev }
     *     
     */
    public void setAgenda(AgendaKodNazev value) {
        this.agenda = value;
    }

    /**
     * Gets the value of the ovm property.
     * 
     * @return
     *     possible object is
     *     {@link KodNazevOvm }
     *     
     */
    public KodNazevOvm getOVM() {
        return ovm;
    }

    /**
     * Sets the value of the ovm property.
     * 
     * @param value
     *     allowed object is
     *     {@link KodNazevOvm }
     *     
     */
    public void setOVM(KodNazevOvm value) {
        this.ovm = value;
    }

    /**
     * Gets the value of the ofros property.
     * 
     * @return
     *     possible object is
     *     {@link OfRos }
     *     
     */
    public OfRos getOFROS() {
        return ofros;
    }

    /**
     * Sets the value of the ofros property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfRos }
     *     
     */
    public void setOFROS(OfRos value) {
        this.ofros = value;
    }

    /**
     * Gets the value of the sidloROS property.
     * 
     * @return
     *     possible object is
     *     {@link SidloRos }
     *     
     */
    public SidloRos getSidloROS() {
        return sidloROS;
    }

    /**
     * Sets the value of the sidloROS property.
     * 
     * @param value
     *     allowed object is
     *     {@link SidloRos }
     *     
     */
    public void setSidloROS(SidloRos value) {
        this.sidloROS = value;
    }

    /**
     * Gets the value of the platnostOd property.
     * 
     * @return
     *     possible object is
     *     {@link DatumRos }
     *     
     */
    public DatumRos getPlatnostOd() {
        return platnostOd;
    }

    /**
     * Sets the value of the platnostOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatumRos }
     *     
     */
    public void setPlatnostOd(DatumRos value) {
        this.platnostOd = value;
    }

    /**
     * Gets the value of the platnostDo property.
     * 
     * @return
     *     possible object is
     *     {@link DatumRos }
     *     
     */
    public DatumRos getPlatnostDo() {
        return platnostDo;
    }

    /**
     * Sets the value of the platnostDo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatumRos }
     *     
     */
    public void setPlatnostDo(DatumRos value) {
        this.platnostDo = value;
    }

}