
package com.microsoft.schemas.search.local.ws.rest.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItineraryItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItineraryItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TravelMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TravelDistance" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="TravelDuration" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ManeuverPoint" type="{http://schemas.microsoft.com/search/local/ws/rest/v1}Point" minOccurs="0"/>
 *         &lt;element name="Instruction" type="{http://schemas.microsoft.com/search/local/ws/rest/v1}Instruction" minOccurs="0"/>
 *         &lt;element name="CompassDirection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Hint" type="{http://schemas.microsoft.com/search/local/ws/rest/v1}Hint" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Warning" type="{http://schemas.microsoft.com/search/local/ws/rest/v1}Warning" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryItem", propOrder = {
    "travelMode",
    "travelDistance",
    "travelDuration",
    "maneuverPoint",
    "instruction",
    "compassDirection",
    "hint",
    "warning"
})
public class ItineraryItem {

    @XmlElement(name = "TravelMode")
    protected String travelMode;
    @XmlElement(name = "TravelDistance")
    protected double travelDistance;
    @XmlElement(name = "TravelDuration")
    protected long travelDuration;
    @XmlElement(name = "ManeuverPoint")
    protected Point maneuverPoint;
    @XmlElement(name = "Instruction")
    protected Instruction instruction;
    @XmlElement(name = "CompassDirection")
    protected String compassDirection;
    @XmlElement(name = "Hint")
    protected List<Hint> hint;
    @XmlElement(name = "Warning")
    protected List<Warning> warning;

    /**
     * Gets the value of the travelMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelMode() {
        return travelMode;
    }

    /**
     * Sets the value of the travelMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelMode(String value) {
        this.travelMode = value;
    }

    /**
     * Gets the value of the travelDistance property.
     * 
     */
    public double getTravelDistance() {
        return travelDistance;
    }

    /**
     * Sets the value of the travelDistance property.
     * 
     */
    public void setTravelDistance(double value) {
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
     * Gets the value of the maneuverPoint property.
     * 
     * @return
     *     possible object is
     *     {@link Point }
     *     
     */
    public Point getManeuverPoint() {
        return maneuverPoint;
    }

    /**
     * Sets the value of the maneuverPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Point }
     *     
     */
    public void setManeuverPoint(Point value) {
        this.maneuverPoint = value;
    }

    /**
     * Gets the value of the instruction property.
     * 
     * @return
     *     possible object is
     *     {@link Instruction }
     *     
     */
    public Instruction getInstruction() {
        return instruction;
    }

    /**
     * Sets the value of the instruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Instruction }
     *     
     */
    public void setInstruction(Instruction value) {
        this.instruction = value;
    }

    /**
     * Gets the value of the compassDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompassDirection() {
        return compassDirection;
    }

    /**
     * Sets the value of the compassDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompassDirection(String value) {
        this.compassDirection = value;
    }

    /**
     * Gets the value of the hint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Hint }
     * 
     * 
     */
    public List<Hint> getHint() {
        if (hint == null) {
            hint = new ArrayList<Hint>();
        }
        return this.hint;
    }

    /**
     * Gets the value of the warning property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warning property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarning().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Warning }
     * 
     * 
     */
    public List<Warning> getWarning() {
        if (warning == null) {
            warning = new ArrayList<Warning>();
        }
        return this.warning;
    }

}
