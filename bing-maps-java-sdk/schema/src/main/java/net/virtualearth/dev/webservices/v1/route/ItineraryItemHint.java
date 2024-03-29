
package net.virtualearth.dev.webservices.v1.route;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItineraryItemHint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItineraryItemHint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HintType" type="{http://dev.virtualearth.net/webservices/v1/route}ItineraryItemHintType" minOccurs="0"/>
 *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryItemHint", propOrder = {
    "hintType",
    "text"
})
public class ItineraryItemHint
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "HintType")
    protected ItineraryItemHintType hintType;
    @XmlElement(name = "Text", nillable = true)
    protected String text;

    /**
     * Gets the value of the hintType property.
     * 
     * @return
     *     possible object is
     *     {@link ItineraryItemHintType }
     *     
     */
    public ItineraryItemHintType getHintType() {
        return hintType;
    }

    /**
     * Sets the value of the hintType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItineraryItemHintType }
     *     
     */
    public void setHintType(ItineraryItemHintType value) {
        this.hintType = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

}
