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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for spolecnici complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="spolecnici"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Clenske_vklady" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}clenske_vklady"/&gt;
 *         &lt;element name="Spolecnici_bez_vkladu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}spolecnici_bez_vkladu"/&gt;
 *         &lt;element name="Spolecnici_s_vkladem" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}spolecnici_s_vkladem"/&gt;
 *         &lt;element name="Komanditni_spolecnici" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}komanditni_spolecnici"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "spolecnici", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1", propOrder = {
    "clenskeVklady",
    "spolecniciBezVkladu",
    "spolecniciSVkladem",
    "komanditniSpolecnici"
})
public class Spolecnici {

    @XmlElement(name = "Clenske_vklady")
    protected ClenskeVklady clenskeVklady;
    @XmlElement(name = "Spolecnici_bez_vkladu")
    protected SpolecniciBezVkladu spolecniciBezVkladu;
    @XmlElement(name = "Spolecnici_s_vkladem")
    protected SpolecniciSVkladem spolecniciSVkladem;
    @XmlElement(name = "Komanditni_spolecnici")
    protected KomanditniSpolecnici komanditniSpolecnici;

    /**
     * Gets the value of the clenskeVklady property.
     * 
     * @return
     *     possible object is
     *     {@link ClenskeVklady }
     *     
     */
    public ClenskeVklady getClenskeVklady() {
        return clenskeVklady;
    }

    /**
     * Sets the value of the clenskeVklady property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClenskeVklady }
     *     
     */
    public void setClenskeVklady(ClenskeVklady value) {
        this.clenskeVklady = value;
    }

    /**
     * Gets the value of the spolecniciBezVkladu property.
     * 
     * @return
     *     possible object is
     *     {@link SpolecniciBezVkladu }
     *     
     */
    public SpolecniciBezVkladu getSpolecniciBezVkladu() {
        return spolecniciBezVkladu;
    }

    /**
     * Sets the value of the spolecniciBezVkladu property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpolecniciBezVkladu }
     *     
     */
    public void setSpolecniciBezVkladu(SpolecniciBezVkladu value) {
        this.spolecniciBezVkladu = value;
    }

    /**
     * Gets the value of the spolecniciSVkladem property.
     * 
     * @return
     *     possible object is
     *     {@link SpolecniciSVkladem }
     *     
     */
    public SpolecniciSVkladem getSpolecniciSVkladem() {
        return spolecniciSVkladem;
    }

    /**
     * Sets the value of the spolecniciSVkladem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpolecniciSVkladem }
     *     
     */
    public void setSpolecniciSVkladem(SpolecniciSVkladem value) {
        this.spolecniciSVkladem = value;
    }

    /**
     * Gets the value of the komanditniSpolecnici property.
     * 
     * @return
     *     possible object is
     *     {@link KomanditniSpolecnici }
     *     
     */
    public KomanditniSpolecnici getKomanditniSpolecnici() {
        return komanditniSpolecnici;
    }

    /**
     * Sets the value of the komanditniSpolecnici property.
     * 
     * @param value
     *     allowed object is
     *     {@link KomanditniSpolecnici }
     *     
     */
    public void setKomanditniSpolecnici(KomanditniSpolecnici value) {
        this.komanditniSpolecnici = value;
    }

}
