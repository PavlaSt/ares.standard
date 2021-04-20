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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for odstepne_zavody complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="odstepne_zavody"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Odstepny_zavod" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ICO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}ico" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="Obchodni_firma" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}obchodni_firma" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="Sidlo" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}adresa_ARES" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="Cinnosti" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}cinnosti" minOccurs="0"/&gt;
 *                   &lt;element name="Vedouci" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}angazma" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "odstepne_zavody", propOrder = {
    "odstepnyZavod"
})
public class OdstepneZavody2 {

    @XmlElement(name = "Odstepny_zavod", required = true)
    protected List<OdstepneZavody2 .OdstepnyZavod> odstepnyZavod;

    /**
     * Gets the value of the odstepnyZavod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the odstepnyZavod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOdstepnyZavod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OdstepneZavody2 .OdstepnyZavod }
     * 
     * 
     */
    public List<OdstepneZavody2 .OdstepnyZavod> getOdstepnyZavod() {
        if (odstepnyZavod == null) {
            odstepnyZavod = new ArrayList<OdstepneZavody2 .OdstepnyZavod>();
        }
        return this.odstepnyZavod;
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
     *         &lt;element name="ICO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}ico" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="Obchodni_firma" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}obchodni_firma" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="Sidlo" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}adresa_ARES" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="Cinnosti" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}cinnosti" minOccurs="0"/&gt;
     *         &lt;element name="Vedouci" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}angazma" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "ico",
        "obchodniFirma",
        "sidlo",
        "cinnosti",
        "vedouci"
    })
    public static class OdstepnyZavod {

        @XmlElement(name = "ICO")
        protected List<Ico2> ico;
        @XmlElement(name = "Obchodni_firma")
        protected List<ObchodniFirma2> obchodniFirma;
        @XmlElement(name = "Sidlo")
        protected List<AdresaARES2> sidlo;
        @XmlElement(name = "Cinnosti")
        protected Cinnosti cinnosti;
        @XmlElement(name = "Vedouci")
        protected List<Angazma> vedouci;
        @XmlAttribute(name = "dod")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dod;
        @XmlAttribute(name = "ddo")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar ddo;

        /**
         * Gets the value of the ico property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ico property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getICO().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Ico2 }
         * 
         * 
         */
        public List<Ico2> getICO() {
            if (ico == null) {
                ico = new ArrayList<Ico2>();
            }
            return this.ico;
        }

        /**
         * Gets the value of the obchodniFirma property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the obchodniFirma property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getObchodniFirma().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ObchodniFirma2 }
         * 
         * 
         */
        public List<ObchodniFirma2> getObchodniFirma() {
            if (obchodniFirma == null) {
                obchodniFirma = new ArrayList<ObchodniFirma2>();
            }
            return this.obchodniFirma;
        }

        /**
         * Gets the value of the sidlo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sidlo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSidlo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AdresaARES2 }
         * 
         * 
         */
        public List<AdresaARES2> getSidlo() {
            if (sidlo == null) {
                sidlo = new ArrayList<AdresaARES2>();
            }
            return this.sidlo;
        }

        /**
         * Gets the value of the cinnosti property.
         * 
         * @return
         *     possible object is
         *     {@link Cinnosti }
         *     
         */
        public Cinnosti getCinnosti() {
            return cinnosti;
        }

        /**
         * Sets the value of the cinnosti property.
         * 
         * @param value
         *     allowed object is
         *     {@link Cinnosti }
         *     
         */
        public void setCinnosti(Cinnosti value) {
            this.cinnosti = value;
        }

        /**
         * Gets the value of the vedouci property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vedouci property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVedouci().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Angazma }
         * 
         * 
         */
        public List<Angazma> getVedouci() {
            if (vedouci == null) {
                vedouci = new ArrayList<Angazma>();
            }
            return this.vedouci;
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