//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.19 at 09:56:20 AM CEST 
//


package cz.stuchlikova.ares.application.stub.standard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for stav_subjektu.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="stav_subjektu"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Aktivní"/&gt;
 *     &lt;enumeration value="Zaniklý"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "stav_subjektu", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1")
@XmlEnum
public enum StavSubjektu {

    @XmlEnumValue("Aktivn\u00ed")
    AKTIVNÍ("Aktivn\u00ed"),
    @XmlEnumValue("Zanikl\u00fd")
    ZANIKLÝ("Zanikl\u00fd");
    private final String value;

    StavSubjektu(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StavSubjektu fromValue(String v) {
        for (StavSubjektu c: StavSubjektu.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
