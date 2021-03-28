//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.24 at 03:40:11 PM CET 
//


package cz.stuchlikova.ares.standard.stub;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ares_dotaz_typ.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ares_dotaz_typ"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Standard"/&gt;
 *     &lt;enumeration value="Seznam_Reg"/&gt;
 *     &lt;enumeration value="Vypis_OR"/&gt;
 *     &lt;enumeration value="Vypis_RZP"/&gt;
 *     &lt;enumeration value="Vypis_RES"/&gt;
 *     &lt;enumeration value="Vypis_RZZ"/&gt;
 *     &lt;enumeration value="Basic"/&gt;
 *     &lt;enumeration value="Vypis_CNS"/&gt;
 *     &lt;enumeration value="Vypis_OSS"/&gt;
 *     &lt;enumeration value="Stdadr"/&gt;
 *     &lt;enumeration value="zl"/&gt;
 *     &lt;enumeration value="es"/&gt;
 *     &lt;enumeration value="su"/&gt;
 *     &lt;enumeration value="fo"/&gt;
 *     &lt;enumeration value="ceu"/&gt;
 *     &lt;enumeration value="zm"/&gt;
 *     &lt;enumeration value="szr"/&gt;
 *     &lt;enumeration value="Vypis_OFF"/&gt;
 *     &lt;enumeration value="Vypis_PSH"/&gt;
 *     &lt;enumeration value="Vypis_IR"/&gt;
 *     &lt;enumeration value="Vypis_SKO"/&gt;
 *     &lt;enumeration value="Vypis_ros"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ares_dotaz_typ")
@XmlEnum
public enum AresDotazTyp2 {

    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    @XmlEnumValue("Seznam_Reg")
    SEZNAM_REG("Seznam_Reg"),
    @XmlEnumValue("Vypis_OR")
    VYPIS_OR("Vypis_OR"),
    @XmlEnumValue("Vypis_RZP")
    VYPIS_RZP("Vypis_RZP"),
    @XmlEnumValue("Vypis_RES")
    VYPIS_RES("Vypis_RES"),
    @XmlEnumValue("Vypis_RZZ")
    VYPIS_RZZ("Vypis_RZZ"),
    @XmlEnumValue("Basic")
    BASIC("Basic"),
    @XmlEnumValue("Vypis_CNS")
    VYPIS_CNS("Vypis_CNS"),
    @XmlEnumValue("Vypis_OSS")
    VYPIS_OSS("Vypis_OSS"),
    @XmlEnumValue("Stdadr")
    STDADR("Stdadr"),
    @XmlEnumValue("zl")
    ZL("zl"),
    @XmlEnumValue("es")
    ES("es"),
    @XmlEnumValue("su")
    SU("su"),
    @XmlEnumValue("fo")
    FO("fo"),
    @XmlEnumValue("ceu")
    CEU("ceu"),
    @XmlEnumValue("zm")
    ZM("zm"),
    @XmlEnumValue("szr")
    SZR("szr"),
    @XmlEnumValue("Vypis_OFF")
    VYPIS_OFF("Vypis_OFF"),
    @XmlEnumValue("Vypis_PSH")
    VYPIS_PSH("Vypis_PSH"),
    @XmlEnumValue("Vypis_IR")
    VYPIS_IR("Vypis_IR"),
    @XmlEnumValue("Vypis_SKO")
    VYPIS_SKO("Vypis_SKO"),
    @XmlEnumValue("Vypis_ros")
    VYPIS_ROS("Vypis_ros");
    private final String value;

    AresDotazTyp2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AresDotazTyp2 fromValue(String v) {
        for (AresDotazTyp2 c: AresDotazTyp2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
