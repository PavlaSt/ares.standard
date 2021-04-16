//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.15 at 10:09:56 PM CEST 
//


package cz.stuchlikova.ares.standard.stub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


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
 *                   &lt;element name="ICO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}ico" minOccurs="0"/&gt;
 *                   &lt;element name="Oznaceni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}obchodni_firma" minOccurs="0"/&gt;
 *                   &lt;element name="Sidlo" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}adresa_ARES" minOccurs="0"/&gt;
 *                   &lt;element name="Vedouci" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}angazma_FO" minOccurs="0"/&gt;
 *                   &lt;element name="Predmet_podnikani" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Text" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}text" maxOccurs="unbounded"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
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
@XmlType(name = "odstepne_zavody", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1", propOrder = {
    "odstepnyZavod"
})
public class OdstepneZavody {

    @XmlElement(name = "Odstepny_zavod", required = true)
    protected List<OdstepneZavody.OdstepnyZavod> odstepnyZavod;

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
     * {@link OdstepneZavody.OdstepnyZavod }
     * 
     * 
     */
    public List<OdstepneZavody.OdstepnyZavod> getOdstepnyZavod() {
        if (odstepnyZavod == null) {
            odstepnyZavod = new ArrayList<OdstepneZavody.OdstepnyZavod>();
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
     *         &lt;element name="ICO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}ico" minOccurs="0"/&gt;
     *         &lt;element name="Oznaceni" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}obchodni_firma" minOccurs="0"/&gt;
     *         &lt;element name="Sidlo" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}adresa_ARES" minOccurs="0"/&gt;
     *         &lt;element name="Vedouci" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}angazma_FO" minOccurs="0"/&gt;
     *         &lt;element name="Predmet_podnikani" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Text" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}text" maxOccurs="unbounded"/&gt;
     *                 &lt;/sequence&gt;
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
    @XmlType(name = "", propOrder = {
        "ico",
        "oznaceni",
        "sidlo",
        "vedouci",
        "predmetPodnikani"
    })
    public static class OdstepnyZavod {

        @XmlElement(name = "ICO", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1")
        protected String ico;
        @XmlElement(name = "Oznaceni", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1")
        protected String oznaceni;
        @XmlElement(name = "Sidlo", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1")
        protected AdresaARES sidlo;
        @XmlElement(name = "Vedouci", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1")
        protected AngazmaFO vedouci;
        @XmlElement(name = "Predmet_podnikani", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1")
        protected OdstepneZavody.OdstepnyZavod.PredmetPodnikani predmetPodnikani;

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
         * Gets the value of the oznaceni property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOznaceni() {
            return oznaceni;
        }

        /**
         * Sets the value of the oznaceni property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOznaceni(String value) {
            this.oznaceni = value;
        }

        /**
         * Gets the value of the sidlo property.
         * 
         * @return
         *     possible object is
         *     {@link AdresaARES }
         *     
         */
        public AdresaARES getSidlo() {
            return sidlo;
        }

        /**
         * Sets the value of the sidlo property.
         * 
         * @param value
         *     allowed object is
         *     {@link AdresaARES }
         *     
         */
        public void setSidlo(AdresaARES value) {
            this.sidlo = value;
        }

        /**
         * Gets the value of the vedouci property.
         * 
         * @return
         *     possible object is
         *     {@link AngazmaFO }
         *     
         */
        public AngazmaFO getVedouci() {
            return vedouci;
        }

        /**
         * Sets the value of the vedouci property.
         * 
         * @param value
         *     allowed object is
         *     {@link AngazmaFO }
         *     
         */
        public void setVedouci(AngazmaFO value) {
            this.vedouci = value;
        }

        /**
         * Gets the value of the predmetPodnikani property.
         * 
         * @return
         *     possible object is
         *     {@link OdstepneZavody.OdstepnyZavod.PredmetPodnikani }
         *     
         */
        public OdstepneZavody.OdstepnyZavod.PredmetPodnikani getPredmetPodnikani() {
            return predmetPodnikani;
        }

        /**
         * Sets the value of the predmetPodnikani property.
         * 
         * @param value
         *     allowed object is
         *     {@link OdstepneZavody.OdstepnyZavod.PredmetPodnikani }
         *     
         */
        public void setPredmetPodnikani(OdstepneZavody.OdstepnyZavod.PredmetPodnikani value) {
            this.predmetPodnikani = value;
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
         *         &lt;element name="Text" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/uvis_datatypes/v_1.0.1}text" maxOccurs="unbounded"/&gt;
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
            "text"
        })
        public static class PredmetPodnikani {

            @XmlElement(name = "Text", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1", required = true)
            protected List<String> text;

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
             * {@link String }
             * 
             * 
             */
            public List<String> getText() {
                if (text == null) {
                    text = new ArrayList<String>();
                }
                return this.text;
            }

        }

    }

}
