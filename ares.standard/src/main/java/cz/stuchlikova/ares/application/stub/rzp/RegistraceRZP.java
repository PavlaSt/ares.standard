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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Údaje o registraci subjektu
 * 
 * <p>Java class for registrace_RZP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registrace_RZP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Zivnostensky_urad" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}zivnostensky_urad" minOccurs="0"/&gt;
 *         &lt;element name="V_jednani" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}ano_ne" minOccurs="0"/&gt;
 *         &lt;element name="Obchodni_rejstrik" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}ano_ne" minOccurs="0"/&gt;
 *         &lt;element name="Financni_urad" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}financni_urad" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="aktivni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}ano_ne" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registrace_RZP", propOrder = {
    "zivnostenskyUrad",
    "vJednani",
    "obchodniRejstrik",
    "financniUrad"
})
public class RegistraceRZP {

    @XmlElement(name = "Zivnostensky_urad")
    protected ZivnostenskyUrad zivnostenskyUrad;
    @XmlElement(name = "V_jednani")
    protected String vJednani;
    @XmlElement(name = "Obchodni_rejstrik")
    protected String obchodniRejstrik;
    @XmlElement(name = "Financni_urad")
    protected FinancniUrad financniUrad;
    @XmlAttribute(name = "aktivni")
    protected String aktivni;

    /**
     * Gets the value of the zivnostenskyUrad property.
     * 
     * @return
     *     possible object is
     *     {@link ZivnostenskyUrad }
     *     
     */
    public ZivnostenskyUrad getZivnostenskyUrad() {
        return zivnostenskyUrad;
    }

    /**
     * Sets the value of the zivnostenskyUrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZivnostenskyUrad }
     *     
     */
    public void setZivnostenskyUrad(ZivnostenskyUrad value) {
        this.zivnostenskyUrad = value;
    }

    /**
     * Gets the value of the vJednani property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVJednani() {
        return vJednani;
    }

    /**
     * Sets the value of the vJednani property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVJednani(String value) {
        this.vJednani = value;
    }

    /**
     * Gets the value of the obchodniRejstrik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObchodniRejstrik() {
        return obchodniRejstrik;
    }

    /**
     * Sets the value of the obchodniRejstrik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObchodniRejstrik(String value) {
        this.obchodniRejstrik = value;
    }

    /**
     * Gets the value of the financniUrad property.
     * 
     * @return
     *     possible object is
     *     {@link FinancniUrad }
     *     
     */
    public FinancniUrad getFinancniUrad() {
        return financniUrad;
    }

    /**
     * Sets the value of the financniUrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancniUrad }
     *     
     */
    public void setFinancniUrad(FinancniUrad value) {
        this.financniUrad = value;
    }

    /**
     * Gets the value of the aktivni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAktivni() {
        return aktivni;
    }

    /**
     * Sets the value of the aktivni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAktivni(String value) {
        this.aktivni = value;
    }

}
