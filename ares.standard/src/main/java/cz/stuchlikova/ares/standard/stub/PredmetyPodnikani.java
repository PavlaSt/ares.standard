//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.29 at 07:54:38 PM CEST 
//


package cz.stuchlikova.ares.standard.stub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * pro volání z basic
 *       
 * 
 * <p>Java class for predmety_podnikani complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="predmety_podnikani"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Predmet_podnikani" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1}predmet_podnikani" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "predmety_podnikani", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1", propOrder = {
    "predmetPodnikani"
})
public class PredmetyPodnikani {

    @XmlElement(name = "Predmet_podnikani")
    protected List<PredmetPodnikani> predmetPodnikani;

    /**
     * Gets the value of the predmetPodnikani property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the predmetPodnikani property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPredmetPodnikani().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PredmetPodnikani }
     * 
     * 
     */
    public List<PredmetPodnikani> getPredmetPodnikani() {
        if (predmetPodnikani == null) {
            predmetPodnikani = new ArrayList<PredmetPodnikani>();
        }
        return this.predmetPodnikani;
    }

}
