//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.19 at 09:56:20 AM CEST 
//


package cz.stuchlikova.ares.application.stub.standard;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clenske_vklady complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clenske_vklady"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Zakladni_CV" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Vklad" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}vklad" minOccurs="0"/&gt;
 *                   &lt;element name="Poznamka" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Jednotlivy_CV" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Vkladatel" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}angazma_PO_n_FO" minOccurs="0"/&gt;
 *                   &lt;element name="Vklad" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}vklad" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Text" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}text" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clenske_vklady", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1", propOrder = {
    "zakladniCV",
    "jednotlivyCV",
    "text"
})
public class ClenskeVklady {

    @XmlElement(name = "Zakladni_CV")
    protected List<ClenskeVklady.ZakladniCV> zakladniCV;
    @XmlElement(name = "Jednotlivy_CV")
    protected List<ClenskeVklady.JednotlivyCV> jednotlivyCV;
    @XmlElement(name = "Text")
    protected String text;

    /**
     * Gets the value of the zakladniCV property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zakladniCV property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZakladniCV().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClenskeVklady.ZakladniCV }
     * 
     * 
     */
    public List<ClenskeVklady.ZakladniCV> getZakladniCV() {
        if (zakladniCV == null) {
            zakladniCV = new ArrayList<ClenskeVklady.ZakladniCV>();
        }
        return this.zakladniCV;
    }

    /**
     * Gets the value of the jednotlivyCV property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jednotlivyCV property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJednotlivyCV().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClenskeVklady.JednotlivyCV }
     * 
     * 
     */
    public List<ClenskeVklady.JednotlivyCV> getJednotlivyCV() {
        if (jednotlivyCV == null) {
            jednotlivyCV = new ArrayList<ClenskeVklady.JednotlivyCV>();
        }
        return this.jednotlivyCV;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Vkladatel" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}angazma_PO_n_FO" minOccurs="0"/&gt;
     *         &lt;element name="Vklad" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}vklad" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "vkladatel",
        "vklad"
    })
    public static class JednotlivyCV {

        @XmlElement(name = "Vkladatel", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1")
        protected AngazmaPONFO vkladatel;
        @XmlElement(name = "Vklad", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1")
        protected Vklad vklad;

        /**
         * Gets the value of the vkladatel property.
         * 
         * @return
         *     possible object is
         *     {@link AngazmaPONFO }
         *     
         */
        public AngazmaPONFO getVkladatel() {
            return vkladatel;
        }

        /**
         * Sets the value of the vkladatel property.
         * 
         * @param value
         *     allowed object is
         *     {@link AngazmaPONFO }
         *     
         */
        public void setVkladatel(AngazmaPONFO value) {
            this.vkladatel = value;
        }

        /**
         * Gets the value of the vklad property.
         * 
         * @return
         *     possible object is
         *     {@link Vklad }
         *     
         */
        public Vklad getVklad() {
            return vklad;
        }

        /**
         * Sets the value of the vklad property.
         * 
         * @param value
         *     allowed object is
         *     {@link Vklad }
         *     
         */
        public void setVklad(Vklad value) {
            this.vklad = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Vklad" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}vklad" minOccurs="0"/&gt;
     *         &lt;element name="Poznamka" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}popis" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "vklad",
        "poznamka"
    })
    public static class ZakladniCV {

        @XmlElement(name = "Vklad", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1")
        protected Vklad vklad;
        @XmlElement(name = "Poznamka", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1")
        protected String poznamka;

        /**
         * Gets the value of the vklad property.
         * 
         * @return
         *     possible object is
         *     {@link Vklad }
         *     
         */
        public Vklad getVklad() {
            return vklad;
        }

        /**
         * Sets the value of the vklad property.
         * 
         * @param value
         *     allowed object is
         *     {@link Vklad }
         *     
         */
        public void setVklad(Vklad value) {
            this.vklad = value;
        }

        /**
         * Gets the value of the poznamka property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPoznamka() {
            return poznamka;
        }

        /**
         * Sets the value of the poznamka property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPoznamka(String value) {
            this.poznamka = value;
        }

    }

}
