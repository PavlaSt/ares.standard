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
 * <p>Java class for zdroj_type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="zdroj_type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;minLength value="2"/&gt;
 *     &lt;maxLength value="5"/&gt;
 *     &lt;enumeration value="ARES"/&gt;
 *     &lt;enumeration value="OR"/&gt;
 *     &lt;enumeration value="RES"/&gt;
 *     &lt;enumeration value="RZP"/&gt;
 *     &lt;enumeration value="RŽP"/&gt;
 *     &lt;enumeration value="RZZ"/&gt;
 *     &lt;enumeration value="DPH"/&gt;
 *     &lt;enumeration value="SD"/&gt;
 *     &lt;enumeration value="SCP"/&gt;
 *     &lt;enumeration value="CEU"/&gt;
 *     &lt;enumeration value="CEDR"/&gt;
 *     &lt;enumeration value="RARIS"/&gt;
 *     &lt;enumeration value="RCNS"/&gt;
 *     &lt;enumeration value="PSH"/&gt;
 *     &lt;enumeration value="OSS"/&gt;
 *     &lt;enumeration value="SZR"/&gt;
 *     &lt;enumeration value="IR"/&gt;
 *     &lt;enumeration value="SKO"/&gt;
 *     &lt;enumeration value="RŠ"/&gt;
 *     &lt;enumeration value="EZP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "zdroj_type")
@XmlEnum
public enum ZdrojType2 {

    ARES,
    OR,
    RES,
    RZP,
    RŽP,
    RZZ,
    DPH,
    SD,
    SCP,
    CEU,
    CEDR,
    RARIS,
    RCNS,
    PSH,
    OSS,
    SZR,
    IR,
    SKO,
    RŠ,
    EZP;

    public String value() {
        return name();
    }

    public static ZdrojType2 fromValue(String v) {
        return valueOf(v);
    }

}
