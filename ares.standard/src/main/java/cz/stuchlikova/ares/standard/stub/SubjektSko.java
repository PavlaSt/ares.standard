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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * údaje o subjektu v SKO
 * 
 * <p>Java class for subjekt_sko complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="subjekt_sko"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Klic_ARES" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Red_IZO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}izo_sko"/&gt;
 *         &lt;element name="ICO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}ico"/&gt;
 *         &lt;element name="Zakladni_udaje" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}zakladni_udaje_eks_sko" minOccurs="0"/&gt;
 *         &lt;element name="Datum_aktualizace" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Datum_vzniku" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Datum_zaniku" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Pravni_forma_sko" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}pravni_forma" minOccurs="0"/&gt;
 *         &lt;element name="Pravni_forma" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}pravni_forma"/&gt;
 *         &lt;element name="Financni_urad" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}financni_urad" minOccurs="0"/&gt;
 *         &lt;element name="Email1" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}e_mail_sko" minOccurs="0"/&gt;
 *         &lt;element name="Email2" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}e_mail_sko" minOccurs="0"/&gt;
 *         &lt;element name="Www" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/&gt;
 *         &lt;element name="Adresa" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}adresa_ARES" minOccurs="0"/&gt;
 *         &lt;element name="Angazma" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}angazma_sko" minOccurs="0"/&gt;
 *         &lt;element name="Soucasti" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}soucasti_sko" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subjekt_sko", propOrder = {
    "klicARES",
    "redIZO",
    "ico",
    "zakladniUdaje",
    "datumAktualizace",
    "datumVzniku",
    "datumZaniku",
    "pravniFormaSko",
    "pravniForma",
    "financniUrad",
    "email1",
    "email2",
    "www",
    "adresa",
    "angazma",
    "soucasti"
})
public class SubjektSko {

    @XmlElement(name = "Klic_ARES")
    protected int klicARES;
    @XmlElement(name = "Red_IZO", required = true)
    protected String redIZO;
    @XmlElement(name = "ICO", required = true)
    protected String ico;
    @XmlElement(name = "Zakladni_udaje")
    protected ZakladniUdajeEksSko zakladniUdaje;
    @XmlElement(name = "Datum_aktualizace")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumAktualizace;
    @XmlElement(name = "Datum_vzniku")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumVzniku;
    @XmlElement(name = "Datum_zaniku")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumZaniku;
    @XmlElement(name = "Pravni_forma_sko")
    protected PravniForma2 pravniFormaSko;
    @XmlElement(name = "Pravni_forma", required = true)
    protected PravniForma2 pravniForma;
    @XmlElement(name = "Financni_urad")
    protected FinancniUrad2 financniUrad;
    @XmlElement(name = "Email1")
    protected String email1;
    @XmlElement(name = "Email2")
    protected String email2;
    @XmlElement(name = "Www")
    protected String www;
    @XmlElement(name = "Adresa")
    protected AdresaARES2 adresa;
    @XmlElement(name = "Angazma")
    protected AngazmaSko angazma;
    @XmlElement(name = "Soucasti")
    protected SoucastiSko soucasti;

    /**
     * Gets the value of the klicARES property.
     * 
     */
    public int getKlicARES() {
        return klicARES;
    }

    /**
     * Sets the value of the klicARES property.
     * 
     */
    public void setKlicARES(int value) {
        this.klicARES = value;
    }

    /**
     * Gets the value of the redIZO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedIZO() {
        return redIZO;
    }

    /**
     * Sets the value of the redIZO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedIZO(String value) {
        this.redIZO = value;
    }

    /**
     * Gets the value of the ico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getICO() {
        return ico;
    }

    /**
     * Sets the value of the ico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setICO(String value) {
        this.ico = value;
    }

    /**
     * Gets the value of the zakladniUdaje property.
     * 
     * @return
     *     possible object is
     *     {@link ZakladniUdajeEksSko }
     *     
     */
    public ZakladniUdajeEksSko getZakladniUdaje() {
        return zakladniUdaje;
    }

    /**
     * Sets the value of the zakladniUdaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZakladniUdajeEksSko }
     *     
     */
    public void setZakladniUdaje(ZakladniUdajeEksSko value) {
        this.zakladniUdaje = value;
    }

    /**
     * Gets the value of the datumAktualizace property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumAktualizace() {
        return datumAktualizace;
    }

    /**
     * Sets the value of the datumAktualizace property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumAktualizace(XMLGregorianCalendar value) {
        this.datumAktualizace = value;
    }

    /**
     * Gets the value of the datumVzniku property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumVzniku() {
        return datumVzniku;
    }

    /**
     * Sets the value of the datumVzniku property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumVzniku(XMLGregorianCalendar value) {
        this.datumVzniku = value;
    }

    /**
     * Gets the value of the datumZaniku property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumZaniku() {
        return datumZaniku;
    }

    /**
     * Sets the value of the datumZaniku property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumZaniku(XMLGregorianCalendar value) {
        this.datumZaniku = value;
    }

    /**
     * Gets the value of the pravniFormaSko property.
     * 
     * @return
     *     possible object is
     *     {@link PravniForma2 }
     *     
     */
    public PravniForma2 getPravniFormaSko() {
        return pravniFormaSko;
    }

    /**
     * Sets the value of the pravniFormaSko property.
     * 
     * @param value
     *     allowed object is
     *     {@link PravniForma2 }
     *     
     */
    public void setPravniFormaSko(PravniForma2 value) {
        this.pravniFormaSko = value;
    }

    /**
     * Gets the value of the pravniForma property.
     * 
     * @return
     *     possible object is
     *     {@link PravniForma2 }
     *     
     */
    public PravniForma2 getPravniForma() {
        return pravniForma;
    }

    /**
     * Sets the value of the pravniForma property.
     * 
     * @param value
     *     allowed object is
     *     {@link PravniForma2 }
     *     
     */
    public void setPravniForma(PravniForma2 value) {
        this.pravniForma = value;
    }

    /**
     * Gets the value of the financniUrad property.
     * 
     * @return
     *     possible object is
     *     {@link FinancniUrad2 }
     *     
     */
    public FinancniUrad2 getFinancniUrad() {
        return financniUrad;
    }

    /**
     * Sets the value of the financniUrad property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancniUrad2 }
     *     
     */
    public void setFinancniUrad(FinancniUrad2 value) {
        this.financniUrad = value;
    }

    /**
     * Gets the value of the email1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail1() {
        return email1;
    }

    /**
     * Sets the value of the email1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail1(String value) {
        this.email1 = value;
    }

    /**
     * Gets the value of the email2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail2() {
        return email2;
    }

    /**
     * Sets the value of the email2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail2(String value) {
        this.email2 = value;
    }

    /**
     * Gets the value of the www property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWww() {
        return www;
    }

    /**
     * Sets the value of the www property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWww(String value) {
        this.www = value;
    }

    /**
     * Gets the value of the adresa property.
     * 
     * @return
     *     possible object is
     *     {@link AdresaARES2 }
     *     
     */
    public AdresaARES2 getAdresa() {
        return adresa;
    }

    /**
     * Sets the value of the adresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdresaARES2 }
     *     
     */
    public void setAdresa(AdresaARES2 value) {
        this.adresa = value;
    }

    /**
     * Gets the value of the angazma property.
     * 
     * @return
     *     possible object is
     *     {@link AngazmaSko }
     *     
     */
    public AngazmaSko getAngazma() {
        return angazma;
    }

    /**
     * Sets the value of the angazma property.
     * 
     * @param value
     *     allowed object is
     *     {@link AngazmaSko }
     *     
     */
    public void setAngazma(AngazmaSko value) {
        this.angazma = value;
    }

    /**
     * Gets the value of the soucasti property.
     * 
     * @return
     *     possible object is
     *     {@link SoucastiSko }
     *     
     */
    public SoucastiSko getSoucasti() {
        return soucasti;
    }

    /**
     * Sets the value of the soucasti property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoucastiSko }
     *     
     */
    public void setSoucasti(SoucastiSko value) {
        this.soucasti = value;
    }

}
