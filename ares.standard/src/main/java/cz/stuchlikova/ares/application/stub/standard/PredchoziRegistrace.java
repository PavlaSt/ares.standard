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
 * Předchozí registrace bude naplněna v okamžiku přechodu subjektu na nový soud
 * 
 * <p>Java class for predchozi_registrace complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="predchozi_registrace"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Soud" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}soud"/&gt;
 *         &lt;element name="Spisova_znacka" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}spisova_znacka"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "predchozi_registrace", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1", propOrder = {
    "soud",
    "spisovaZnacka"
})
public class PredchoziRegistrace {

    @XmlElement(name = "Soud", required = true)
    protected Soud soud;
    @XmlElement(name = "Spisova_znacka", required = true)
    protected SpisovaZnacka spisovaZnacka;

    /**
     * Gets the value of the soud property.
     * 
     * @return
     *     possible object is
     *     {@link Soud }
     *     
     */
    public Soud getSoud() {
        return soud;
    }

    /**
     * Sets the value of the soud property.
     * 
     * @param value
     *     allowed object is
     *     {@link Soud }
     *     
     */
    public void setSoud(Soud value) {
        this.soud = value;
    }

    /**
     * Gets the value of the spisovaZnacka property.
     * 
     * @return
     *     possible object is
     *     {@link SpisovaZnacka }
     *     
     */
    public SpisovaZnacka getSpisovaZnacka() {
        return spisovaZnacka;
    }

    /**
     * Sets the value of the spisovaZnacka property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpisovaZnacka }
     *     
     */
    public void setSpisovaZnacka(SpisovaZnacka value) {
        this.spisovaZnacka = value;
    }

}
