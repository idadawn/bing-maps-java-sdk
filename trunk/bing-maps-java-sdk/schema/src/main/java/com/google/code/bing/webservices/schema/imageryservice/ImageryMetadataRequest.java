
package com.google.code.bing.webservices.schema.imageryservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImageryMetadataRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImageryMetadataRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.virtualearth.net/webservices/v1/common}RequestBase">
 *       &lt;sequence>
 *         &lt;element name="Options" type="{http://dev.virtualearth.net/webservices/v1/imagery}ImageryMetadataOptions" minOccurs="0"/>
 *         &lt;element name="Style" type="{http://dev.virtualearth.net/webservices/v1/common}MapStyle" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageryMetadataRequest", namespace = "http://dev.virtualearth.net/webservices/v1/imagery", propOrder = {
    "options",
    "style"
})
public class ImageryMetadataRequest
    extends RequestBase
{

    @XmlElementRef(name = "Options", namespace = "http://dev.virtualearth.net/webservices/v1/imagery", type = JAXBElement.class)
    protected JAXBElement<ImageryMetadataOptions> options;
    @XmlElement(name = "Style", namespace = "http://dev.virtualearth.net/webservices/v1/imagery")
    protected MapStyle style;

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ImageryMetadataOptions }{@code >}
     *     
     */
    public JAXBElement<ImageryMetadataOptions> getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ImageryMetadataOptions }{@code >}
     *     
     */
    public void setOptions(JAXBElement<ImageryMetadataOptions> value) {
        this.options = ((JAXBElement<ImageryMetadataOptions> ) value);
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link MapStyle }
     *     
     */
    public MapStyle getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link MapStyle }
     *     
     */
    public void setStyle(MapStyle value) {
        this.style = value;
    }

}
