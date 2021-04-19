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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Identifikace osoby v RŽP (Pozn. v rodném čísle je u cizinců prvních 6 znaků datum narození ve tvaru jako v rč + nuly místo koncovky rč)
 * 
 * <p>Java class for osoba_RZP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="osoba_RZP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Role" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}role_rzp"/&gt;
 *         &lt;element name="Jmeno" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}jmeno"/&gt;
 *         &lt;element name="Prijmeni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}prijmeni"/&gt;
 *         &lt;element name="Datum_narozeni" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Titul_pred" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}titul_pred" minOccurs="0"/&gt;
 *         &lt;element name="Titul_za" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}titul_za" minOccurs="0"/&gt;
 *         &lt;element name="Rodne_cislo" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}rodne_cislo" minOccurs="0"/&gt;
 *         &lt;element name="Kod_statu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}kod_statu" minOccurs="0"/&gt;
 *         &lt;element name="Nazev_statu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}nazev_statu" minOccurs="0"/&gt;
 *         &lt;element name="Bydliste" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}adresa_ARES" minOccurs="0"/&gt;
 *         &lt;element name="Pobyt" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}adresa_ARES" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "osoba_RZP", propOrder = {
    "role",
    "jmeno",
    "prijmeni",
    "datumNarozeni",
    "titulPred",
    "titulZa",
    "rodneCislo",
    "kodStatu",
    "nazevStatu",
    "bydliste",
    "pobyt"
})
public class OsobaRZP {

    @XmlElement(name = "Role", required = true)
    @XmlSchemaType(name = "string")
    protected RoleRzp role;
    @XmlElement(name = "Jmeno", required = true)
    protected String jmeno;
    @XmlElement(name = "Prijmeni", required = true)
    protected String prijmeni;
    @XmlElement(name = "Datum_narozeni")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumNarozeni;
    @XmlElement(name = "Titul_pred")
    protected String titulPred;
    @XmlElement(name = "Titul_za")
    protected String titulZa;
    @XmlElement(name = "Rodne_cislo")
    protected String rodneCislo;
    @XmlElement(name = "Kod_statu")
    protected String kodStatu;
    @XmlElement(name = "Nazev_statu")
    protected String nazevStatu;
    @XmlElement(name = "Bydliste")
    protected AdresaARES2 bydliste;
    @XmlElement(name = "Pobyt")
    protected AdresaARES2 pobyt;

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link RoleRzp }
     *     
     */
    public RoleRzp getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleRzp }
     *     
     */
    public void setRole(RoleRzp value) {
        this.role = value;
    }

    /**
     * Gets the value of the jmeno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJmeno() {
        return jmeno;
    }

    /**
     * Sets the value of the jmeno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJmeno(String value) {
        this.jmeno = value;
    }

    /**
     * Gets the value of the prijmeni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrijmeni() {
        return prijmeni;
    }

    /**
     * Sets the value of the prijmeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrijmeni(String value) {
        this.prijmeni = value;
    }

    /**
     * Gets the value of the datumNarozeni property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumNarozeni() {
        return datumNarozeni;
    }

    /**
     * Sets the value of the datumNarozeni property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumNarozeni(XMLGregorianCalendar value) {
        this.datumNarozeni = value;
    }

    /**
     * Gets the value of the titulPred property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitulPred() {
        return titulPred;
    }

    /**
     * Sets the value of the titulPred property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulPred(String value) {
        this.titulPred = value;
    }

    /**
     * Gets the value of the titulZa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitulZa() {
        return titulZa;
    }

    /**
     * Sets the value of the titulZa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulZa(String value) {
        this.titulZa = value;
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
     * Gets the value of the kodStatu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKodStatu() {
        return kodStatu;
    }

    /**
     * Sets the value of the kodStatu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKodStatu(String value) {
        this.kodStatu = value;
    }

    /**
     * Gets the value of the nazevStatu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNazevStatu() {
        return nazevStatu;
    }

    /**
     * Sets the value of the nazevStatu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazevStatu(String value) {
        this.nazevStatu = value;
    }

    /**
     * Gets the value of the bydliste property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaARES2 }
     *     
     */
    public AdresaARES2 getBydliste() {
        return bydliste;
    }

    /**
     * Sets the value of the bydliste property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaARES2 }
     *     
     */
    public void setBydliste(AdresaARES2 value) {
        this.bydliste = value;
    }

    /**
     * Gets the value of the pobyt property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaARES2 }
     *     
     */
    public AdresaARES2 getPobyt() {
        return pobyt;
    }

    /**
     * Sets the value of the pobyt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaARES2 }
     *     
     */
    public void setPobyt(AdresaARES2 value) {
        this.pobyt = value;
    }

}
