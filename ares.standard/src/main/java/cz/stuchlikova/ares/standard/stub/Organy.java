//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.24 at 03:40:11 PM CET 
//


package cz.stuchlikova.ares.standard.stub;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Orgány jsou angazma rozsirene o dic, stat, pr.formu, fyz.osobu v pravnicke, rodné prijmeni a rc cizince, jsou typu PO nebo FO s moznosti násobnosti
 * 
 * <p>Java class for organy complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="organy"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Organ_PO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}organ_PO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Organ_FO" type="{http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.4}organ_FO" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "organy", propOrder = {
    "organPO",
    "organFO"
})
public class Organy {

    @XmlElement(name = "Organ_PO")
    protected List<OrganPO> organPO;
    @XmlElement(name = "Organ_FO")
    protected List<OrganFO> organFO;

    /**
     * Gets the value of the organPO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organPO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganPO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganPO }
     * 
     * 
     */
    public List<OrganPO> getOrganPO() {
        if (organPO == null) {
            organPO = new ArrayList<OrganPO>();
        }
        return this.organPO;
    }

    /**
     * Gets the value of the organFO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organFO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrganFO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganFO }
     * 
     * 
     */
    public List<OrganFO> getOrganFO() {
        if (organFO == null) {
            organFO = new ArrayList<OrganFO>();
        }
        return this.organFO;
    }

}
