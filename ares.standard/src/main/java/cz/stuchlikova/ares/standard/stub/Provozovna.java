//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.15 at 10:09:56 PM CEST 
//


package cz.stuchlikova.ares.standard.stub;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Údaje o provozovnách subjektu
 * 
 * <p>Java class for provozovna complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="provozovna"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Cislo_provozovny" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="Nazev_provozovny" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}nazev_provozovny" minOccurs="0"/&gt;
 *         &lt;element name="Adresa_provozovny" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}adresa_RZP"/&gt;
 *         &lt;element name="Druh_provozovny" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}druh_provozovny" minOccurs="0"/&gt;
 *         &lt;element name="Provozovna_existuje" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}ano_ne"/&gt;
 *         &lt;element name="Provozovane_zivnosti" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}provozovane_zivnosti" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "provozovna", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1", propOrder = {
    "cisloProvozovny",
    "nazevProvozovny",
    "adresaProvozovny",
    "druhProvozovny",
    "provozovnaExistuje",
    "provozovaneZivnosti"
})
public class Provozovna {

    @XmlElement(name = "Cislo_provozovny")
    protected short cisloProvozovny;
    @XmlElement(name = "Nazev_provozovny")
    protected String nazevProvozovny;
    @XmlElement(name = "Adresa_provozovny", required = true)
    protected AdresaRZP adresaProvozovny;
    @XmlElement(name = "Druh_provozovny")
    protected String druhProvozovny;
    @XmlElement(name = "Provozovna_existuje", required = true)
    @XmlSchemaType(name = "string")
    protected AnoNe provozovnaExistuje;
    @XmlElement(name = "Provozovane_zivnosti")
    protected ProvozovaneZivnosti provozovaneZivnosti;

    /**
     * Gets the value of the cisloProvozovny property.
     * 
     */
    public short getCisloProvozovny() {
        return cisloProvozovny;
    }

    /**
     * Sets the value of the cisloProvozovny property.
     * 
     */
    public void setCisloProvozovny(short value) {
        this.cisloProvozovny = value;
    }

    /**
     * Gets the value of the nazevProvozovny property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevProvozovny() {
        return nazevProvozovny;
    }

    /**
     * Sets the value of the nazevProvozovny property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevProvozovny(String value) {
        this.nazevProvozovny = value;
    }

    /**
     * Gets the value of the adresaProvozovny property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaRZP }
     *     
     */
    public AdresaRZP getAdresaProvozovny() {
        return adresaProvozovny;
    }

    /**
     * Sets the value of the adresaProvozovny property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaRZP }
     *     
     */
    public void setAdresaProvozovny(AdresaRZP value) {
        this.adresaProvozovny = value;
    }

    /**
     * Gets the value of the druhProvozovny property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDruhProvozovny() {
        return druhProvozovny;
    }

    /**
     * Sets the value of the druhProvozovny property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDruhProvozovny(String value) {
        this.druhProvozovny = value;
    }

    /**
     * Gets the value of the provozovnaExistuje property.
     * 
     * @return
     *     possible object is
     *     {@link AnoNe }
     *     
     */
    public AnoNe getProvozovnaExistuje() {
        return provozovnaExistuje;
    }

    /**
     * Sets the value of the provozovnaExistuje property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnoNe }
     *     
     */
    public void setProvozovnaExistuje(AnoNe value) {
        this.provozovnaExistuje = value;
    }

    /**
     * Gets the value of the provozovaneZivnosti property.
     * 
     * @return
     *     possible object is
     *     {@link ProvozovaneZivnosti }
     *     
     */
    public ProvozovaneZivnosti getProvozovaneZivnosti() {
        return provozovaneZivnosti;
    }

    /**
     * Sets the value of the provozovaneZivnosti property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvozovaneZivnosti }
     *     
     */
    public void setProvozovaneZivnosti(ProvozovaneZivnosti value) {
        this.provozovaneZivnosti = value;
    }

}
