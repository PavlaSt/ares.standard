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
 * Data o fyzicky zrušených větách
 * 
 * <p>Java class for k_zruseno complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="k_zruseno"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="O_podnetu" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="O_podn_zrus" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="O_upadce" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "k_zruseno", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1", propOrder = {
    "oPodnetu",
    "oPodnZrus",
    "oUpadce"
})
public class KZruseno {

    @XmlElement(name = "O_podnetu")
    protected int oPodnetu;
    @XmlElement(name = "O_podn_zrus")
    protected int oPodnZrus;
    @XmlElement(name = "O_upadce")
    protected int oUpadce;

    /**
     * Gets the value of the oPodnetu property.
     * 
     */
    public int getOPodnetu() {
        return oPodnetu;
    }

    /**
     * Sets the value of the oPodnetu property.
     * 
     */
    public void setOPodnetu(int value) {
        this.oPodnetu = value;
    }

    /**
     * Gets the value of the oPodnZrus property.
     * 
     */
    public int getOPodnZrus() {
        return oPodnZrus;
    }

    /**
     * Sets the value of the oPodnZrus property.
     * 
     */
    public void setOPodnZrus(int value) {
        this.oPodnZrus = value;
    }

    /**
     * Gets the value of the oUpadce property.
     * 
     */
    public int getOUpadce() {
        return oUpadce;
    }

    /**
     * Sets the value of the oUpadce property.
     * 
     */
    public void setOUpadce(int value) {
        this.oUpadce = value;
    }

}
