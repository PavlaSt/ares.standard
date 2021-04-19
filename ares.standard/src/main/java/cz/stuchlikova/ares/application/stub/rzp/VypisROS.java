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
 * <p>Java class for vypis_ROS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vypis_ROS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Zakladni_udaje" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}zakladni_udaje_ros"/&gt;
 *         &lt;element name="Podnikatel" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}podnikatel_ros" minOccurs="0"/&gt;
 *         &lt;element name="Agendy" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}agendy_ros" minOccurs="0"/&gt;
 *         &lt;element name="Statutari" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}statutari_ros" minOccurs="0"/&gt;
 *         &lt;element name="Provozovny" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}provozovny_ros" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vypis_ROS", propOrder = {
    "zakladniUdaje",
    "podnikatel",
    "agendy",
    "statutari",
    "provozovny"
})
public class VypisROS {

    @XmlElement(name = "Zakladni_udaje", required = true)
    protected ZakladniUdajeRos zakladniUdaje;
    @XmlElement(name = "Podnikatel")
    protected PodnikatelRos podnikatel;
    @XmlElement(name = "Agendy")
    protected AgendyRos agendy;
    @XmlElement(name = "Statutari")
    protected StatutariRos statutari;
    @XmlElement(name = "Provozovny")
    protected ProvozovnyRos provozovny;

    /**
     * Gets the value of the zakladniUdaje property.
     * 
     * @return
     *     possible object is
     *     {@link ZakladniUdajeRos }
     *     
     */
    public ZakladniUdajeRos getZakladniUdaje() {
        return zakladniUdaje;
    }

    /**
     * Sets the value of the zakladniUdaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZakladniUdajeRos }
     *     
     */
    public void setZakladniUdaje(ZakladniUdajeRos value) {
        this.zakladniUdaje = value;
    }

    /**
     * Gets the value of the podnikatel property.
     * 
     * @return
     *     possible object is
     *     {@link PodnikatelRos }
     *     
     */
    public PodnikatelRos getPodnikatel() {
        return podnikatel;
    }

    /**
     * Sets the value of the podnikatel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PodnikatelRos }
     *     
     */
    public void setPodnikatel(PodnikatelRos value) {
        this.podnikatel = value;
    }

    /**
     * Gets the value of the agendy property.
     * 
     * @return
     *     possible object is
     *     {@link AgendyRos }
     *     
     */
    public AgendyRos getAgendy() {
        return agendy;
    }

    /**
     * Sets the value of the agendy property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgendyRos }
     *     
     */
    public void setAgendy(AgendyRos value) {
        this.agendy = value;
    }

    /**
     * Gets the value of the statutari property.
     * 
     * @return
     *     possible object is
     *     {@link StatutariRos }
     *     
     */
    public StatutariRos getStatutari() {
        return statutari;
    }

    /**
     * Sets the value of the statutari property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatutariRos }
     *     
     */
    public void setStatutari(StatutariRos value) {
        this.statutari = value;
    }

    /**
     * Gets the value of the provozovny property.
     * 
     * @return
     *     possible object is
     *     {@link ProvozovnyRos }
     *     
     */
    public ProvozovnyRos getProvozovny() {
        return provozovny;
    }

    /**
     * Sets the value of the provozovny property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvozovnyRos }
     *     
     */
    public void setProvozovny(ProvozovnyRos value) {
        this.provozovny = value;
    }

}
