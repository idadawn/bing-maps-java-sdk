
package com.microsoft.schemas.search.local.ws.rest.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BoundingBox complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BoundingBox">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SouthLatitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="WestLongitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="NorthLatitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="EastLongitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BoundingBox", propOrder = {
    "southLatitude",
    "westLongitude",
    "northLatitude",
    "eastLongitude"
})
public class BoundingBox {

    @XmlElement(name = "SouthLatitude")
    protected double southLatitude;
    @XmlElement(name = "WestLongitude")
    protected double westLongitude;
    @XmlElement(name = "NorthLatitude")
    protected double northLatitude;
    @XmlElement(name = "EastLongitude")
    protected double eastLongitude;

    /**
     * Gets the value of the southLatitude property.
     * 
     */
    public double getSouthLatitude() {
        return southLatitude;
    }

    /**
     * Sets the value of the southLatitude property.
     * 
     */
    public void setSouthLatitude(double value) {
        this.southLatitude = value;
    }

    /**
     * Gets the value of the westLongitude property.
     * 
     */
    public double getWestLongitude() {
        return westLongitude;
    }

    /**
     * Sets the value of the westLongitude property.
     * 
     */
    public void setWestLongitude(double value) {
        this.westLongitude = value;
    }

    /**
     * Gets the value of the northLatitude property.
     * 
     */
    public double getNorthLatitude() {
        return northLatitude;
    }

    /**
     * Sets the value of the northLatitude property.
     * 
     */
    public void setNorthLatitude(double value) {
        this.northLatitude = value;
    }

    /**
     * Gets the value of the eastLongitude property.
     * 
     */
    public double getEastLongitude() {
        return eastLongitude;
    }

    /**
     * Sets the value of the eastLongitude property.
     * 
     */
    public void setEastLongitude(double value) {
        this.eastLongitude = value;
    }

}
