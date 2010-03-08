
package com.google.code.bing.webservices.schema.routeservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://dev.virtualearth.net/webservices/v1/route}MajorRoutesRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "request"
})
@XmlRootElement(name = "CalculateRoutesFromMajorRoads", namespace = "http://dev.virtualearth.net/webservices/v1/route/contracts")
public class CalculateRoutesFromMajorRoads {

    @XmlElementRef(name = "request", namespace = "http://dev.virtualearth.net/webservices/v1/route/contracts", type = JAXBElement.class)
    protected JAXBElement<MajorRoutesRequest> request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MajorRoutesRequest }{@code >}
     *     
     */
    public JAXBElement<MajorRoutesRequest> getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MajorRoutesRequest }{@code >}
     *     
     */
    public void setRequest(JAXBElement<MajorRoutesRequest> value) {
        this.request = ((JAXBElement<MajorRoutesRequest> ) value);
    }

}
