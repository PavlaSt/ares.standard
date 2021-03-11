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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Nadační fond, k 16.6.2003 se ještě nevyskytuje
 * 
 * <p>Java class for nadacni_fond complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nadacni_fond"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Opravnena_osoba_nadacniho_fondu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}angazma" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Clenstvi" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}trvani" minOccurs="0"/&gt;
 *         &lt;element name="Ve_funkci" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}trvani" minOccurs="0"/&gt;
 *         &lt;element name="Text" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}textType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nadacni_fond", propOrder = {
    "opravnenaOsobaNadacnihoFondu",
    "clenstvi",
    "veFunkci",
    "text"
})
public class NadacniFond {

    @XmlElement(name = "Opravnena_osoba_nadacniho_fondu")
    protected List<Angazma> opravnenaOsobaNadacnihoFondu;
    @XmlElement(name = "Clenstvi")
    protected Trvani2 clenstvi;
    @XmlElement(name = "Ve_funkci")
    protected Trvani2 veFunkci;
    @XmlElement(name = "Text")
    protected List<TextType> text;

    /**
     * Gets the value of the opravnenaOsobaNadacnihoFondu property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opravnenaOsobaNadacnihoFondu property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpravnenaOsobaNadacnihoFondu().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Angazma }
     * 
     * 
     */
    public List<Angazma> getOpravnenaOsobaNadacnihoFondu() {
        if (opravnenaOsobaNadacnihoFondu == null) {
            opravnenaOsobaNadacnihoFondu = new ArrayList<Angazma>();
        }
        return this.opravnenaOsobaNadacnihoFondu;
    }

    /**
     * Gets the value of the clenstvi property.
     * 
     * @return
     *     possible object is
     *     {@link Trvani2 }
     *     
     */
    public Trvani2 getClenstvi() {
        return clenstvi;
    }

    /**
     * Sets the value of the clenstvi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trvani2 }
     *     
     */
    public void setClenstvi(Trvani2 value) {
        this.clenstvi = value;
    }

    /**
     * Gets the value of the veFunkci property.
     * 
     * @return
     *     possible object is
     *     {@link Trvani2 }
     *     
     */
    public Trvani2 getVeFunkci() {
        return veFunkci;
    }

    /**
     * Sets the value of the veFunkci property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trvani2 }
     *     
     */
    public void setVeFunkci(Trvani2 value) {
        this.veFunkci = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the text property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextType }
     * 
     * 
     */
    public List<TextType> getText() {
        if (text == null) {
            text = new ArrayList<TextType>();
        }
        return this.text;
    }

}
