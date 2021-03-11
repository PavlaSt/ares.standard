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
 * <p>Java class for vysledek_dotazu complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vysledek_dotazu"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Pocet_nalezenych" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Chyba" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}chyba" minOccurs="0"/&gt;
 *         &lt;element name="Pocet_nenalezenych" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Seznam_nenalezenych" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}slovo" minOccurs="0"/&gt;
 *         &lt;element name="Pocet_navracenych" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="Seznam_navracenych" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}seznam_navracenych" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vysledek_dotazu", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1", propOrder = {
    "pocetNalezenych",
    "chyba",
    "pocetNenalezenych",
    "seznamNenalezenych",
    "pocetNavracenych",
    "seznamNavracenych"
})
public class VysledekDotazu {

    @XmlElement(name = "Pocet_nalezenych")
    protected int pocetNalezenych;
    @XmlElement(name = "Chyba")
    protected Chyba chyba;
    @XmlElement(name = "Pocet_nenalezenych")
    protected Integer pocetNenalezenych;
    @XmlElement(name = "Seznam_nenalezenych")
    protected Slovo seznamNenalezenych;
    @XmlElement(name = "Pocet_navracenych")
    protected Integer pocetNavracenych;
    @XmlElement(name = "Seznam_navracenych")
    protected SeznamNavracenych seznamNavracenych;

    /**
     * Gets the value of the pocetNalezenych property.
     * 
     */
    public int getPocetNalezenych() {
        return pocetNalezenych;
    }

    /**
     * Sets the value of the pocetNalezenych property.
     * 
     */
    public void setPocetNalezenych(int value) {
        this.pocetNalezenych = value;
    }

    /**
     * Gets the value of the chyba property.
     * 
     * @return
     *     possible object is
     *     {@link Chyba }
     *     
     */
    public Chyba getChyba() {
        return chyba;
    }

    /**
     * Sets the value of the chyba property.
     * 
     * @param value
     *     allowed object is
     *     {@link Chyba }
     *     
     */
    public void setChyba(Chyba value) {
        this.chyba = value;
    }

    /**
     * Gets the value of the pocetNenalezenych property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPocetNenalezenych() {
        return pocetNenalezenych;
    }

    /**
     * Sets the value of the pocetNenalezenych property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPocetNenalezenych(Integer value) {
        this.pocetNenalezenych = value;
    }

    /**
     * Gets the value of the seznamNenalezenych property.
     * 
     * @return
     *     possible object is
     *     {@link Slovo }
     *     
     */
    public Slovo getSeznamNenalezenych() {
        return seznamNenalezenych;
    }

    /**
     * Sets the value of the seznamNenalezenych property.
     * 
     * @param value
     *     allowed object is
     *     {@link Slovo }
     *     
     */
    public void setSeznamNenalezenych(Slovo value) {
        this.seznamNenalezenych = value;
    }

    /**
     * Gets the value of the pocetNavracenych property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPocetNavracenych() {
        return pocetNavracenych;
    }

    /**
     * Sets the value of the pocetNavracenych property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPocetNavracenych(Integer value) {
        this.pocetNavracenych = value;
    }

    /**
     * Gets the value of the seznamNavracenych property.
     * 
     * @return
     *     possible object is
     *     {@link SeznamNavracenych }
     *     
     */
    public SeznamNavracenych getSeznamNavracenych() {
        return seznamNavracenych;
    }

    /**
     * Sets the value of the seznamNavracenych property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeznamNavracenych }
     *     
     */
    public void setSeznamNavracenych(SeznamNavracenych value) {
        this.seznamNavracenych = value;
    }

}
