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
 * Výpis všech stavů subjektu strany/hnutí
 * 
 * <p>Java class for stavy_subj_rpsh complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="stavy_subj_rpsh"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Stav_subjektu" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}stav_subj_rpsh" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "stavy_subj_rpsh", propOrder = {
    "stavSubjektu"
})
public class StavySubjRpsh {

    @XmlElement(name = "Stav_subjektu", required = true)
    protected List<StavSubjRpsh> stavSubjektu;

    /**
     * Gets the value of the stavSubjektu property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stavSubjektu property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStavSubjektu().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StavSubjRpsh }
     * 
     * 
     */
    public List<StavSubjRpsh> getStavSubjektu() {
        if (stavSubjektu == null) {
            stavSubjektu = new ArrayList<StavSubjRpsh>();
        }
        return this.stavSubjektu;
    }

}
