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
 * <p>Java class for vystup_format.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="vystup_format"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="XML"/&gt;
 *     &lt;enumeration value="HTML"/&gt;
 *     &lt;enumeration value="XHTML"/&gt;
 *     &lt;enumeration value="TEXT"/&gt;
 *     &lt;enumeration value="jenIC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "vystup_format")
@XmlEnum
public enum VystupFormat {

    XML("XML"),
    HTML("HTML"),
    XHTML("XHTML"),
    TEXT("TEXT"),
    @XmlEnumValue("jenIC")
    JEN_IC("jenIC");
    private final String value;

    VystupFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VystupFormat fromValue(String v) {
        for (VystupFormat c: VystupFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
