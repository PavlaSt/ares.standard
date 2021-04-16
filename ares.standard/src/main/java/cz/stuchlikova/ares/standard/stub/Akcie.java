//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.15 at 10:09:56 PM CEST 
//


package cz.stuchlikova.ares.standard.stub;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for akcie complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="akcie"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Emise" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Druh_akcie" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}druh_akcie" minOccurs="0"/&gt;
 *                   &lt;element name="Hodnota" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}hodnota_emise" minOccurs="0"/&gt;
 *                   &lt;element name="Pocet" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}pocet_akcii" minOccurs="0"/&gt;
 *                   &lt;element name="Text" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}textType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="Podoba" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}podoba_akcii" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="dod" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *                 &lt;attribute name="ddo" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "akcie", propOrder = {
    "emise"
})
public class Akcie {

    @XmlElement(name = "Emise", required = true)
    protected List<Akcie.Emise> emise;

    /**
     * Gets the value of the emise property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emise property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmise().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Akcie.Emise }
     * 
     * 
     */
    public List<Akcie.Emise> getEmise() {
        if (emise == null) {
            emise = new ArrayList<Akcie.Emise>();
        }
        return this.emise;
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
     *         &lt;element name="Druh_akcie" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}druh_akcie" minOccurs="0"/&gt;
     *         &lt;element name="Hodnota" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}hodnota_emise" minOccurs="0"/&gt;
     *         &lt;element name="Pocet" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}pocet_akcii" minOccurs="0"/&gt;
     *         &lt;element name="Text" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}textType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="Podoba" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}podoba_akcii" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="dod" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
     *       &lt;attribute name="ddo" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "druhAkcie",
        "hodnota",
        "pocet",
        "text",
        "podoba"
    })
    public static class Emise {

        @XmlElement(name = "Druh_akcie")
        @XmlSchemaType(name = "string")
        protected DruhAkcie2 druhAkcie;
        @XmlElement(name = "Hodnota")
        protected String hodnota;
        @XmlElement(name = "Pocet")
        protected BigDecimal pocet;
        @XmlElement(name = "Text")
        protected List<TextType> text;
        @XmlElement(name = "Podoba")
        @XmlSchemaType(name = "string")
        protected PodobaAkcii podoba;
        @XmlAttribute(name = "dod")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dod;
        @XmlAttribute(name = "ddo")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar ddo;

        /**
         * Gets the value of the druhAkcie property.
         * 
         * @return
         *     possible object is
         *     {@link DruhAkcie2 }
         *     
         */
        public DruhAkcie2 getDruhAkcie() {
            return druhAkcie;
        }

        /**
         * Sets the value of the druhAkcie property.
         * 
         * @param value
         *     allowed object is
         *     {@link DruhAkcie2 }
         *     
         */
        public void setDruhAkcie(DruhAkcie2 value) {
            this.druhAkcie = value;
        }

        /**
         * Gets the value of the hodnota property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHodnota() {
            return hodnota;
        }

        /**
         * Sets the value of the hodnota property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHodnota(String value) {
            this.hodnota = value;
        }

        /**
         * Gets the value of the pocet property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPocet() {
            return pocet;
        }

        /**
         * Sets the value of the pocet property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPocet(BigDecimal value) {
            this.pocet = value;
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

        /**
         * Gets the value of the podoba property.
         * 
         * @return
         *     possible object is
         *     {@link PodobaAkcii }
         *     
         */
        public PodobaAkcii getPodoba() {
            return podoba;
        }

        /**
         * Sets the value of the podoba property.
         * 
         * @param value
         *     allowed object is
         *     {@link PodobaAkcii }
         *     
         */
        public void setPodoba(PodobaAkcii value) {
            this.podoba = value;
        }

        /**
         * Gets the value of the dod property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDod() {
            return dod;
        }

        /**
         * Sets the value of the dod property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDod(XMLGregorianCalendar value) {
            this.dod = value;
        }

        /**
         * Gets the value of the ddo property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDdo() {
            return ddo;
        }

        /**
         * Sets the value of the ddo property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDdo(XMLGregorianCalendar value) {
            this.ddo = value;
        }

    }

}
