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
 * <p>Java class for pf_osoba.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="pf_osoba"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="F"/&gt;
 *     &lt;enumeration value="P"/&gt;
 *     &lt;enumeration value="X"/&gt;
 *     &lt;enumeration value="Z"/&gt;
 *     &lt;enumeration value="O"/&gt;
 *     &lt;enumeration value="C"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "pf_osoba")
@XmlEnum
public enum PfOsoba2 {

    F,
    P,
    X,
    Z,
    O,
    C;

    public String value() {
        return name();
    }

    public static PfOsoba2 fromValue(String v) {
        return valueOf(v);
    }

}
