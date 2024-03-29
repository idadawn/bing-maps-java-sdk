
package net.virtualearth.dev.webservices.v1.imagery;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImageryProvider complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImageryProvider">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Attribution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CoverageAreas" type="{http://dev.virtualearth.net/webservices/v1/imagery}ArrayOfCoverageArea" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageryProvider", propOrder = {
    "attribution",
    "coverageAreas"
})
public class ImageryProvider
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Attribution", nillable = true)
    protected String attribution;
    @XmlElement(name = "CoverageAreas", nillable = true)
    protected ArrayOfCoverageArea coverageAreas;

    /**
     * Gets the value of the attribution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttribution() {
        return attribution;
    }

    /**
     * Sets the value of the attribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttribution(String value) {
        this.attribution = value;
    }

    /**
     * Gets the value of the coverageAreas property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCoverageArea }
     *     
     */
    public ArrayOfCoverageArea getCoverageAreas() {
        return coverageAreas;
    }

    /**
     * Sets the value of the coverageAreas property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCoverageArea }
     *     
     */
    public void setCoverageAreas(ArrayOfCoverageArea value) {
        this.coverageAreas = value;
    }

}
