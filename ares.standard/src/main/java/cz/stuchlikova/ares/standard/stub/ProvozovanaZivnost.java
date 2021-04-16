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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Údaje o jedné provozované živnosti (liší se od "Živnosti")
 * 
 * <p>Java class for provozovana_zivnost complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="provozovana_zivnost"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Evidencni_cislo" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}evidencni_cislo" minOccurs="0"/&gt;
 *         &lt;element name="Druh_zivnosti" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}druh_zivnosti" minOccurs="0"/&gt;
 *         &lt;element name="Predmet_podnikani" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}predmet_podnikani" minOccurs="0"/&gt;
 *         &lt;element name="Evidence_od" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Evidence_do" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "provozovana_zivnost", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1", propOrder = {
    "evidencniCislo",
    "druhZivnosti",
    "predmetPodnikani",
    "evidenceOd",
    "evidenceDo"
})
public class ProvozovanaZivnost {

    @XmlElement(name = "Evidencni_cislo")
    protected EvidencniCislo evidencniCislo;
    @XmlElement(name = "Druh_zivnosti")
    protected String druhZivnosti;
    @XmlElement(name = "Predmet_podnikani")
    protected PredmetPodnikani predmetPodnikani;
    @XmlElement(name = "Evidence_od")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar evidenceOd;
    @XmlElement(name = "Evidence_do")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar evidenceDo;

    /**
     * Gets the value of the evidencniCislo property.
     * 
     * @return
     *     possible object is
     *     {@link EvidencniCislo }
     *     
     */
    public EvidencniCislo getEvidencniCislo() {
        return evidencniCislo;
    }

    /**
     * Sets the value of the evidencniCislo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EvidencniCislo }
     *     
     */
    public void setEvidencniCislo(EvidencniCislo value) {
        this.evidencniCislo = value;
    }

    /**
     * Gets the value of the druhZivnosti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDruhZivnosti() {
        return druhZivnosti;
    }

    /**
     * Sets the value of the druhZivnosti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDruhZivnosti(String value) {
        this.druhZivnosti = value;
    }

    /**
     * Gets the value of the predmetPodnikani property.
     * 
     * @return
     *     possible object is
     *     {@link PredmetPodnikani }
     *     
     */
    public PredmetPodnikani getPredmetPodnikani() {
        return predmetPodnikani;
    }

    /**
     * Sets the value of the predmetPodnikani property.
     * 
     * @param value
     *     allowed object is
     *     {@link PredmetPodnikani }
     *     
     */
    public void setPredmetPodnikani(PredmetPodnikani value) {
        this.predmetPodnikani = value;
    }

    /**
     * Gets the value of the evidenceOd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEvidenceOd() {
        return evidenceOd;
    }

    /**
     * Sets the value of the evidenceOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEvidenceOd(XMLGregorianCalendar value) {
        this.evidenceOd = value;
    }

    /**
     * Gets the value of the evidenceDo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEvidenceDo() {
        return evidenceDo;
    }

    /**
     * Sets the value of the evidenceDo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEvidenceDo(XMLGregorianCalendar value) {
        this.evidenceDo = value;
    }

}
