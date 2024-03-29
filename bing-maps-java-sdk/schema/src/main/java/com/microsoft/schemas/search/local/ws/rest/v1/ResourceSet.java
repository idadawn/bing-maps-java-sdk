
package com.microsoft.schemas.search.local.ws.rest.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EstimatedTotal" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Resources" type="{http://schemas.microsoft.com/search/local/ws/rest/v1}ArrayOfChoice1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceSet", propOrder = {
    "estimatedTotal",
    "resources"
})
public class ResourceSet {

    @XmlElement(name = "EstimatedTotal")
    protected long estimatedTotal;
    @XmlElement(name = "Resources")
    protected ArrayOfChoice1 resources;

    /**
     * Gets the value of the estimatedTotal property.
     * 
     */
    public long getEstimatedTotal() {
        return estimatedTotal;
    }

    /**
     * Sets the value of the estimatedTotal property.
     * 
     */
    public void setEstimatedTotal(long value) {
        this.estimatedTotal = value;
    }

    /**
     * Gets the value of the resources property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfChoice1 }
     *     
     */
    public ArrayOfChoice1 getResources() {
        return resources;
    }

    /**
     * Sets the value of the resources property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfChoice1 }
     *     
     */
    public void setResources(ArrayOfChoice1 value) {
        this.resources = value;
    }

}
