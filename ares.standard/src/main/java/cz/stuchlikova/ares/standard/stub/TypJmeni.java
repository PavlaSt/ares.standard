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
 * <p>Java class for typ_jmeni.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typ_jmeni"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Základní"/&gt;
 *     &lt;enumeration value="Kmenové"/&gt;
 *     &lt;enumeration value="Nadační"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typ_jmeni", namespace = "http://wwwinfo.mfcr.cz/ares/xml_doc/schemas/ares/ares_datatypes/v_1.0.1")
@XmlEnum
public enum TypJmeni {

    @XmlEnumValue("Z\u00e1kladn\u00ed")
    ZÁKLADNÍ("Z\u00e1kladn\u00ed"),
    @XmlEnumValue("Kmenov\u00e9")
    KMENOVÉ("Kmenov\u00e9"),
    @XmlEnumValue("Nada\u010dn\u00ed")
    NADAČNÍ("Nada\u010dn\u00ed");
    private final String value;

    TypJmeni(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypJmeni fromValue(String v) {
        for (TypJmeni c: TypJmeni.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
