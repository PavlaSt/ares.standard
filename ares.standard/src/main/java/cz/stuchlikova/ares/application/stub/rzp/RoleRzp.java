//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.04.19 at 09:56:22 AM CEST 
//


package cz.stuchlikova.ares.application.stub.rzp;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for role_rzp.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="role_rzp"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;maxLength value="1"/&gt;
 *     &lt;enumeration value="P"/&gt;
 *     &lt;enumeration value="O"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "role_rzp")
@XmlEnum
public enum RoleRzp {

    P,
    O,
    S;

    public String value() {
        return name();
    }

    public static RoleRzp fromValue(String v) {
        return valueOf(v);
    }

}