//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.03.29 at 07:54:38 PM CEST 
//


package cz.stuchlikova.ares.standard.stub;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ares_vyber_typ.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ares_vyber_typ"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="FREE"/&gt;
 *     &lt;enumeration value="ICO"/&gt;
 *     &lt;enumeration value="RC"/&gt;
 *     &lt;enumeration value="OF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ares_vyber_typ")
@XmlEnum
public enum AresVyberTyp2 {

    FREE,
    ICO,
    RC,
    OF;

    public String value() {
        return name();
    }

    public static AresVyberTyp2 fromValue(String v) {
        return valueOf(v);
    }

}
