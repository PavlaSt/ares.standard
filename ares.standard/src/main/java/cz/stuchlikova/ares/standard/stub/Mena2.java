//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.10 at 07:21:26 PM CET 
//


package cz.stuchlikova.ares.standard.stub;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mena.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="mena"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Kč"/&gt;
 *     &lt;enumeration value="USD"/&gt;
 *     &lt;enumeration value="DM"/&gt;
 *     &lt;enumeration value="GBP"/&gt;
 *     &lt;enumeration value="SK"/&gt;
 *     &lt;enumeration value="EUR"/&gt;
 *     &lt;enumeration value="EURO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "mena")
@XmlEnum
public enum Mena2 {

    @XmlEnumValue("K\u010d")
    KČ("K\u010d"),
    USD("USD"),
    DM("DM"),
    GBP("GBP"),
    SK("SK"),
    EUR("EUR"),
    EURO("EURO");
    private final String value;

    Mena2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Mena2 fromValue(String v) {
        for (Mena2 c: Mena2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
