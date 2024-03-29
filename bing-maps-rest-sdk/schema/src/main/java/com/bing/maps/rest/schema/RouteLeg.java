
package com.bing.maps.rest.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for RouteLeg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RouteLeg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TravelDistance" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TravelDuration" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ActualStart" type="{http://schemas.microsoft.com/search/local/ws/rest/v1}Point" minOccurs="0"/>
 *         &lt;element name="ActualEnd" type="{http://schemas.microsoft.com/search/local/ws/rest/v1}Point" minOccurs="0"/>
 *         &lt;element name="StartLocation" type="{http://schemas.microsoft.com/search/local/ws/rest/v1}Location" minOccurs="0"/>
 *         &lt;element name="EndLocation" type="{http://schemas.microsoft.com/search/local/ws/rest/v1}Location" minOccurs="0"/>
 *         &lt;element name="ItineraryItem" type="{http://schemas.microsoft.com/search/local/ws/rest/v1}ItineraryItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RouteLeg", propOrder = {
    "travelDistance",
    "travelDuration",
    "actualStart",
    "actualEnd",
    "startLocation",
    "endLocation",
    "itineraryItem"
})
public class RouteLeg
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "TravelDistance", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Double travelDistance;
    @XmlElement(name = "TravelDuration")
    protected long travelDuration;
    @XmlElement(name = "ActualStart")
    protected Point actualStart;
    @XmlElement(name = "ActualEnd")
    protected Point actualEnd;
    @XmlElement(name = "StartLocation")
    protected Location startLocation;
    @XmlElement(name = "EndLocation")
    protected Location endLocation;
    @XmlElement(name = "ItineraryItem")
    protected List<ItineraryItem> itineraryItem;

    /**
     * Gets the value of the travelDistance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getTravelDistance() {
        return travelDistance;
    }

    /**
     * Sets the value of the travelDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelDistance(Double value) {
        this.travelDistance = value;
    }

    /**
     * Gets the value of the travelDuration property.
     * 
     */
    public long getTravelDuration() {
        return travelDuration;
    }

    /**
     * Sets the value of the travelDuration property.
     * 
     */
    public void setTravelDuration(long value) {
        this.travelDuration = value;
    }

    /**
     * Gets the value of the actualStart property.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getActualStart() {
        return actualStart;
    }

    /**
     * Sets the value of the actualStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setActualStart(Point value) {
        this.actualStart = value;
    }

    /**
     * Gets the value of the actualEnd property.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getActualEnd() {
        return actualEnd;
    }

    /**
     * Sets the value of the actualEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setActualEnd(Point value) {
        this.actualEnd = value;
    }

    /**
     * Gets the value of the startLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getStartLocation() {
        return startLocation;
    }

    /**
     * Sets the value of the startLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setStartLocation(Location value) {
        this.startLocation = value;
    }

    /**
     * Gets the value of the endLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getEndLocation() {
        return endLocation;
    }

    /**
     * Sets the value of the endLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setEndLocation(Location value) {
        this.endLocation = value;
    }

    /**
     * Gets the value of the itineraryItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itineraryItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItineraryItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItineraryItem }
     * 
     * 
     */
    public List<ItineraryItem> getItineraryItem() {
        if (itineraryItem == null) {
            itineraryItem = new ArrayList<ItineraryItem>();
        }
        return this.itineraryItem;
    }

}
