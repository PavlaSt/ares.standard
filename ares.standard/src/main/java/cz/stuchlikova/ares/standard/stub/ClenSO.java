//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.10 at 07:21:26 PM CET 
//


package cz.stuchlikova.ares.standard.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Člen statutárního orgánu
 * 
 * <p>Java class for clen_SO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clen_SO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Statutar" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}angazma_PO_n_FO" minOccurs="0"/&gt;
 *         &lt;element name="Clenstvi" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}trvani" minOccurs="0"/&gt;
 *         &lt;element name="Ve_funkci" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}trvani" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clen_SO", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1", propOrder = {
    "statutar",
    "clenstvi",
    "veFunkci"
})
public class ClenSO {

    @XmlElement(name = "Statutar")
    protected AngazmaPONFO statutar;
    @XmlElement(name = "Clenstvi")
    protected Trvani clenstvi;
    @XmlElement(name = "Ve_funkci")
    protected Trvani veFunkci;

    /**
     * Gets the value of the statutar property.
     * 
     * @return
     *     possible object is
     *     {@link AngazmaPONFO }
     *     
     */
    public AngazmaPONFO getStatutar() {
        return statutar;
    }

    /**
     * Sets the value of the statutar property.
     * 
     * @param value
     *     allowed object is
     *     {@link AngazmaPONFO }
     *     
     */
    public void setStatutar(AngazmaPONFO value) {
        this.statutar = value;
    }

    /**
     * Gets the value of the clenstvi property.
     * 
     * @return
     *     possible object is
     *     {@link Trvani }
     *     
     */
    public Trvani getClenstvi() {
        return clenstvi;
    }

    /**
     * Sets the value of the clenstvi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trvani }
     *     
     */
    public void setClenstvi(Trvani value) {
        this.clenstvi = value;
    }

    /**
     * Gets the value of the veFunkci property.
     * 
     * @return
     *     possible object is
     *     {@link Trvani }
     *     
     */
    public Trvani getVeFunkci() {
        return veFunkci;
    }

    /**
     * Sets the value of the veFunkci property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trvani }
     *     
     */
    public void setVeFunkci(Trvani value) {
        this.veFunkci = value;
    }

}
