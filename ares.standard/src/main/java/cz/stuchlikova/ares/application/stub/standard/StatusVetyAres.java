//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.19 at 09:56:20 AM CEST 
//


package cz.stuchlikova.ares.application.stub.standard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for status_vety_ares.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="status_vety_ares"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="Z"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "status_vety_ares", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1")
@XmlEnum
public enum StatusVetyAres {


    /**
     * aktuálně platný záznam u ekonomického subjektu
     * 
     */
    A,

    /**
     * ekonomický subjekt u daného záznamu je zaniklý
     * 
     */
    Z,

    /**
     * status věty neuveden
     * 
     */
    N;

    public String value() {
        return name();
    }

    public static StatusVetyAres fromValue(String v) {
        return valueOf(v);
    }

}
