
package net.virtualearth.dev.webservices.v1.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGeocodeResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGeocodeResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GeocodeResult" type="{http://dev.virtualearth.net/webservices/v1/common}GeocodeResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGeocodeResult", propOrder = {
    "geocodeResult"
})
public class ArrayOfGeocodeResult {

    @XmlElement(name = "GeocodeResult", nillable = true)
    protected List<GeocodeResult> geocodeResult;

    /**
     * Gets the value of the geocodeResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geocodeResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeocodeResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeocodeResult }
     * 
     * 
     */
    public List<GeocodeResult> getGeocodeResult() {
        if (geocodeResult == null) {
            geocodeResult = new ArrayList<GeocodeResult>();
        }
        return this.geocodeResult;
    }

}