//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.19 at 09:56:22 AM CEST 
//


package cz.stuchlikova.ares.application.stub.rzp;

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
 *     &lt;enumeration value="T"/&gt;
 *     &lt;enumeration value="Z"/&gt;
 *     &lt;enumeration value="U"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="Tuzemská"/&gt;
 *     &lt;enumeration value="Zahraniční"/&gt;
 *     &lt;enumeration value="Uprchlík"/&gt;
 *     &lt;enumeration value="Evropská společnost"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tzu_osoba")
@XmlEnum
public enum TzuOsoba {

    T("T"),
    Z("Z"),
    U("U"),
    E("E"),
    @XmlEnumValue("Tuzemsk\u00e1")
    TUZEMSKÁ("Tuzemsk\u00e1"),
    @XmlEnumValue("Zahrani\u010dn\u00ed")
    ZAHRANIČNÍ("Zahrani\u010dn\u00ed"),
    @XmlEnumValue("Uprchl\u00edk")
    UPRCHLÍK("Uprchl\u00edk"),
    @XmlEnumValue("Evropsk\u00e1 spole\u010dnost")
    EVROPSKÁ_SPOLEČNOST("Evropsk\u00e1 spole\u010dnost");
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