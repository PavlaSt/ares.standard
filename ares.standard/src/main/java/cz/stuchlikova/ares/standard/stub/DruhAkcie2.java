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
 * <p>Java class for druh_akcie.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="druh_akcie"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Akcie na jméno"/&gt;
 *     &lt;enumeration value="Akcie na majitele"/&gt;
 *     &lt;enumeration value="Zaměstnanecké akcie na jméno"/&gt;
 *     &lt;enumeration value="Prioritní akcie na majitele"/&gt;
 *     &lt;enumeration value="Prioritní akcie na jméno"/&gt;
 *     &lt;enumeration value="Akcie se zvláštními právy"/&gt;
 *     &lt;enumeration value="Kmenové akcie na jméno"/&gt;
 *     &lt;enumeration value="Kmenové akcie na majitele"/&gt;
 *     &lt;enumeration value="Na doručitele"/&gt;
 *     &lt;enumeration value="Na jméno a majitele"/&gt;
 *     &lt;enumeration value="Na držitele"/&gt;
 *     &lt;enumeration value="Bez uvedení druhu"/&gt;
 *     &lt;enumeration value="Hromadná akcie"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "druh_akcie")
@XmlEnum
public enum DruhAkcie2 {

    @XmlEnumValue("Akcie na jm\u00e9no")
    AKCIE_NA_JMÉNO("Akcie na jm\u00e9no"),
    @XmlEnumValue("Akcie na majitele")
    AKCIE_NA_MAJITELE("Akcie na majitele"),
    @XmlEnumValue("Zam\u011bstnaneck\u00e9 akcie na jm\u00e9no")
    ZAMĚSTNANECKÉ_AKCIE_NA_JMÉNO("Zam\u011bstnaneck\u00e9 akcie na jm\u00e9no"),
    @XmlEnumValue("Prioritn\u00ed akcie na majitele")
    PRIORITNÍ_AKCIE_NA_MAJITELE("Prioritn\u00ed akcie na majitele"),
    @XmlEnumValue("Prioritn\u00ed akcie na jm\u00e9no")
    PRIORITNÍ_AKCIE_NA_JMÉNO("Prioritn\u00ed akcie na jm\u00e9no"),
    @XmlEnumValue("Akcie se zvl\u00e1\u0161tn\u00edmi pr\u00e1vy")
    AKCIE_SE_ZVLÁŠTNÍMI_PRÁVY("Akcie se zvl\u00e1\u0161tn\u00edmi pr\u00e1vy"),
    @XmlEnumValue("Kmenov\u00e9 akcie na jm\u00e9no")
    KMENOVÉ_AKCIE_NA_JMÉNO("Kmenov\u00e9 akcie na jm\u00e9no"),
    @XmlEnumValue("Kmenov\u00e9 akcie na majitele")
    KMENOVÉ_AKCIE_NA_MAJITELE("Kmenov\u00e9 akcie na majitele"),
    @XmlEnumValue("Na doru\u010ditele")
    NA_DORUČITELE("Na doru\u010ditele"),
    @XmlEnumValue("Na jm\u00e9no a majitele")
    NA_JMÉNO_A_MAJITELE("Na jm\u00e9no a majitele"),
    @XmlEnumValue("Na dr\u017eitele")
    NA_DRŽITELE("Na dr\u017eitele"),
    @XmlEnumValue("Bez uveden\u00ed druhu")
    BEZ_UVEDENÍ_DRUHU("Bez uveden\u00ed druhu"),
    @XmlEnumValue("Hromadn\u00e1 akcie")
    HROMADNÁ_AKCIE("Hromadn\u00e1 akcie");
    private final String value;

    DruhAkcie2(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DruhAkcie2 fromValue(String v) {
        for (DruhAkcie2 c: DruhAkcie2 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
