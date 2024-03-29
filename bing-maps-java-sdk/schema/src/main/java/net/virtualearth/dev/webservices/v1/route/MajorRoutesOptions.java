
package net.virtualearth.dev.webservices.v1.route;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MajorRoutesOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MajorRoutesOptions">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.virtualearth.net/webservices/v1/route}RouteOptions">
 *       &lt;sequence>
 *         &lt;element name="ReturnRoutes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MajorRoutesOptions", propOrder = {
    "returnRoutes"
})
public class MajorRoutesOptions
    extends RouteOptions
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "ReturnRoutes")
    protected Boolean returnRoutes;

    /**
     * Gets the value of the returnRoutes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReturnRoutes() {
        return returnRoutes;
    }

    /**
     * Sets the value of the returnRoutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReturnRoutes(Boolean value) {
        this.returnRoutes = value;
    }

}
