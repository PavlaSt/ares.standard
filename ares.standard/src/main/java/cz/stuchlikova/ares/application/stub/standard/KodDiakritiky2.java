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
 * <p>Java class for kod_diakritiky.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="kod_diakritiky"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ISO"/&gt;
 *     &lt;enumeration value="WIN"/&gt;
 *     &lt;enumeration value="LAT"/&gt;
 *     &lt;enumeration value="UTF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "kod_diakritiky")
@XmlEnum
public enum KodDiakritiky2 {

    ISO,
    WIN,
    LAT,
    UTF;

    public String value() {
        return name();
    }

    public static KodDiakritiky2 fromValue(String v) {
        return valueOf(v);
    }

}
