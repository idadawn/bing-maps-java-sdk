
package net.virtualearth.dev.webservices.v1.route;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoutePathType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoutePathType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Points"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoutePathType")
@XmlEnum
public enum RoutePathType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Points")
    POINTS("Points");
    private final String value;

    RoutePathType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoutePathType fromValue(String v) {
        for (RoutePathType c: RoutePathType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
