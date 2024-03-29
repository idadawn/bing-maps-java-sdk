
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
 * <p>Java class for Route complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Route">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/search/local/ws/rest/v1}Resource">
 *       &lt;sequence>
 *         &lt;element name="DistanceUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DurationUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TravelDistance" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TravelDuration" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="RouteLeg" type="{http://schemas.microsoft.com/search/local/ws/rest/v1}RouteLeg" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RoutePath" type="{http://schemas.microsoft.com/search/local/ws/rest/v1}RoutePath" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Route", propOrder = {
    "distanceUnit",
    "durationUnit",
    "travelDistance",
    "travelDuration",
    "routeLeg",
    "routePath"
})
public class Route
    extends Resource
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "DistanceUnit")
    protected String distanceUnit;
    @XmlElement(name = "DurationUnit")
    protected String durationUnit;
    @XmlElement(name = "TravelDistance", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Double travelDistance;
    @XmlElement(name = "TravelDuration")
    protected long travelDuration;
    @XmlElement(name = "RouteLeg")
    protected List<RouteLeg> routeLeg;
    @XmlElement(name = "RoutePath")
    protected RoutePath routePath;

    /**
     * Gets the value of the distanceUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistanceUnit() {
        return distanceUnit;
    }

    /**
     * Sets the value of the distanceUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistanceUnit(String value) {
        this.distanceUnit = value;
    }

    /**
     * Gets the value of the durationUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurationUnit() {
        return durationUnit;
    }

    /**
     * Sets the value of the durationUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurationUnit(String value) {
        this.durationUnit = value;
    }

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
     * Gets the value of the routeLeg property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routeLeg property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRouteLeg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RouteLeg }
     * 
     * 
     */
    public List<RouteLeg> getRouteLeg() {
        if (routeLeg == null) {
            routeLeg = new ArrayList<RouteLeg>();
        }
        return this.routeLeg;
    }

    /**
     * Gets the value of the routePath property.
     * 
     * @return
     *     possible object is
     *     {@link RoutePath }
     *     
     */
    public RoutePath getRoutePath() {
        return routePath;
    }

    /**
     * Sets the value of the routePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutePath }
     *     
     */
    public void setRoutePath(RoutePath value) {
        this.routePath = value;
    }

}
