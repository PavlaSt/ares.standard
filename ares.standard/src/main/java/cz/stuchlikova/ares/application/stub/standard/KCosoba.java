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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Osoby ve smyslu civilních individuí
 * 
 * <p>Java class for k_cosoba complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="k_cosoba"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Podnika" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}ano_ne"/&gt;
 *         &lt;element name="Cele_jmeno" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/&gt;
 *         &lt;element name="Rodne_cislo" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}rodne_cislo"/&gt;
 *         &lt;element name="Rozliseni_rodneho_cisla" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="Adresa_sidla" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}adresa_ARES" minOccurs="0"/&gt;
 *         &lt;element name="Ares" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}ano_ne"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "k_cosoba", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1", propOrder = {
    "podnika",
    "celeJmeno",
    "rodneCislo",
    "rozliseniRodnehoCisla",
    "adresaSidla",
    "ares"
})
public class KCosoba {

    @XmlElement(name = "Podnika", required = true)
    @XmlSchemaType(name = "string")
    protected AnoNe podnika;
    @XmlElement(name = "Cele_jmeno")
    protected String celeJmeno;
    @XmlElement(name = "Rodne_cislo", required = true)
    protected String rodneCislo;
    @XmlElement(name = "Rozliseni_rodneho_cisla")
    protected Short rozliseniRodnehoCisla;
    @XmlElement(name = "Adresa_sidla")
    protected AdresaARES adresaSidla;
    @XmlElement(name = "Ares", required = true)
    @XmlSchemaType(name = "string")
    protected AnoNe ares;

    /**
     * Gets the value of the podnika property.
     * 
     * @return
     *     possible object is
     *     {@link AnoNe }
     *     
     */
    public AnoNe getPodnika() {
        return podnika;
    }

    /**
     * Sets the value of the podnika property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnoNe }
     *     
     */
    public void setPodnika(AnoNe value) {
        this.podnika = value;
    }

    /**
     * Gets the value of the celeJmeno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCeleJmeno() {
        return celeJmeno;
    }

    /**
     * Sets the value of the celeJmeno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCeleJmeno(String value) {
        this.celeJmeno = value;
    }

    /**
     * Gets the value of the rodneCislo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRodneCislo() {
        return rodneCislo;
    }

    /**
     * Sets the value of the rodneCislo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRodneCislo(String value) {
        this.rodneCislo = value;
    }

    /**
     * Gets the value of the rozliseniRodnehoCisla property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRozliseniRodnehoCisla() {
        return rozliseniRodnehoCisla;
    }

    /**
     * Sets the value of the rozliseniRodnehoCisla property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRozliseniRodnehoCisla(Short value) {
        this.rozliseniRodnehoCisla = value;
    }

    /**
     * Gets the value of the adresaSidla property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaARES }
     *     
     */
    public AdresaARES getAdresaSidla() {
        return adresaSidla;
    }

    /**
     * Sets the value of the adresaSidla property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaARES }
     *     
     */
    public void setAdresaSidla(AdresaARES value) {
        this.adresaSidla = value;
    }

    /**
     * Gets the value of the ares property.
     * 
     * @return
     *     possible object is
     *     {@link AnoNe }
     *     
     */
    public AnoNe getAres() {
        return ares;
    }

    /**
     * Sets the value of the ares property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnoNe }
     *     
     */
    public void setAres(AnoNe value) {
        this.ares = value;
    }

}
