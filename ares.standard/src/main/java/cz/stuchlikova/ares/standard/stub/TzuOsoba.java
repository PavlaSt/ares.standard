//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.15 at 10:09:56 PM CEST 
//


package cz.stuchlikova.ares.standard.stub;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tzu_osoba.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tzu_osoba"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Tuzemská"/&gt;
 *     &lt;enumeration value="Zahraniční"/&gt;
 *     &lt;enumeration value="Uprchík"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tzu_osoba", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1")
@XmlEnum
public enum TzuOsoba {

    @XmlEnumValue("Tuzemsk\u00e1")
    TUZEMSKÁ("Tuzemsk\u00e1"),
    @XmlEnumValue("Zahrani\u010dn\u00ed")
    ZAHRANIČNÍ("Zahrani\u010dn\u00ed"),
    @XmlEnumValue("Uprch\u00edk")
    UPRCHÍK("Uprch\u00edk");
    private final String value;

    TzuOsoba(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TzuOsoba fromValue(String v) {
        for (TzuOsoba c: TzuOsoba.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
