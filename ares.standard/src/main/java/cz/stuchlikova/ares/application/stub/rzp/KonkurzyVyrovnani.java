//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.19 at 09:56:22 AM CEST 
//


package cz.stuchlikova.ares.application.stub.rzp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Sekce údajů o konkurzech, vyrovnáních a zamítnutích konkurzů
 * 
 * <p>Java class for konkurzy_vyrovnani complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="konkurzy_vyrovnani"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Ukon" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="Konkurz" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}konkurz" minOccurs="0"/&gt;
 *                   &lt;element name="Vyrovnani" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}konkurz" minOccurs="0"/&gt;
 *                   &lt;element name="Zamitnuti" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}konkurz" minOccurs="0"/&gt;
 *                   &lt;element name="Insolvence" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}konkurz" minOccurs="0"/&gt;
 *                 &lt;/choice&gt;
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
@XmlType(name = "konkurzy_vyrovnani", propOrder = {
    "ukon"
})
public class KonkurzyVyrovnani {

    @XmlElement(name = "Ukon", required = true)
    protected List<KonkurzyVyrovnani.Ukon> ukon;

    /**
     * Gets the value of the ukon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ukon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUkon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KonkurzyVyrovnani.Ukon }
     * 
     * 
     */
    public List<KonkurzyVyrovnani.Ukon> getUkon() {
        if (ukon == null) {
            ukon = new ArrayList<KonkurzyVyrovnani.Ukon>();
        }
        return this.ukon;
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
     *       &lt;choice&gt;
     *         &lt;element name="Konkurz" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}konkurz" minOccurs="0"/&gt;
     *         &lt;element name="Vyrovnani" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}konkurz" minOccurs="0"/&gt;
     *         &lt;element name="Zamitnuti" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}konkurz" minOccurs="0"/&gt;
     *         &lt;element name="Insolvence" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}konkurz" minOccurs="0"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "konkurz",
        "vyrovnani",
        "zamitnuti",
        "insolvence"
    })
    public static class Ukon {

        @XmlElement(name = "Konkurz")
        protected Konkurz konkurz;
        @XmlElement(name = "Vyrovnani")
        protected Konkurz vyrovnani;
        @XmlElement(name = "Zamitnuti")
        protected Konkurz zamitnuti;
        @XmlElement(name = "Insolvence")
        protected Konkurz insolvence;

        /**
         * Gets the value of the konkurz property.
         * 
         * @return
         *     possible object is
         *     {@link Konkurz }
         *     
         */
        public Konkurz getKonkurz() {
            return konkurz;
        }

        /**
         * Sets the value of the konkurz property.
         * 
         * @param value
         *     allowed object is
         *     {@link Konkurz }
         *     
         */
        public void setKonkurz(Konkurz value) {
            this.konkurz = value;
        }

        /**
         * Gets the value of the vyrovnani property.
         * 
         * @return
         *     possible object is
         *     {@link Konkurz }
         *     
         */
        public Konkurz getVyrovnani() {
            return vyrovnani;
        }

        /**
         * Sets the value of the vyrovnani property.
         * 
         * @param value
         *     allowed object is
         *     {@link Konkurz }
         *     
         */
        public void setVyrovnani(Konkurz value) {
            this.vyrovnani = value;
        }

        /**
         * Gets the value of the zamitnuti property.
         * 
         * @return
         *     possible object is
         *     {@link Konkurz }
         *     
         */
        public Konkurz getZamitnuti() {
            return zamitnuti;
        }

        /**
         * Sets the value of the zamitnuti property.
         * 
         * @param value
         *     allowed object is
         *     {@link Konkurz }
         *     
         */
        public void setZamitnuti(Konkurz value) {
            this.zamitnuti = value;
        }

        /**
         * Gets the value of the insolvence property.
         * 
         * @return
         *     possible object is
         *     {@link Konkurz }
         *     
         */
        public Konkurz getInsolvence() {
            return insolvence;
        }

        /**
         * Sets the value of the insolvence property.
         * 
         * @param value
         *     allowed object is
         *     {@link Konkurz }
         *     
         */
        public void setInsolvence(Konkurz value) {
            this.insolvence = value;
        }

    }

}
