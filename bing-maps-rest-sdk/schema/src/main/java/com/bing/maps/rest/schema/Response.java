
package com.bing.maps.rest.schema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Copyright" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BrandLogoUri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="StatusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthenticationResultCode" type="{http://schemas.microsoft.com/search/local/ws/rest/v1}AuthenticationResultCode"/>
 *         &lt;element name="ErrorDetails" type="{http://schemas.microsoft.com/search/local/ws/rest/v1}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="TraceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResourceSets" type="{http://schemas.microsoft.com/search/local/ws/rest/v1}ArrayOfResourceSet" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Response", propOrder = {
    "copyright",
    "brandLogoUri",
    "statusCode",
    "statusDescription",
    "authenticationResultCode",
    "errorDetails",
    "traceId",
    "resourceSets"
})
public class Response
    implements Serializable
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlElement(name = "Copyright")
    protected String copyright;
    @XmlElement(name = "BrandLogoUri")
    protected String brandLogoUri;
    @XmlElement(name = "StatusCode")
    protected int statusCode;
    @XmlElement(name = "StatusDescription")
    protected String statusDescription;
    @XmlElement(name = "AuthenticationResultCode", required = true)
    protected AuthenticationResultCode authenticationResultCode;
    @XmlElement(name = "ErrorDetails")
    protected ArrayOfString errorDetails;
    @XmlElement(name = "TraceId")
    protected String traceId;
    @XmlElement(name = "ResourceSets")
    protected ArrayOfResourceSet resourceSets;

    /**
     * Gets the value of the copyright property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyright() {
        return copyright;
    }

    /**
     * Sets the value of the copyright property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyright(String value) {
        this.copyright = value;
    }

    /**
     * Gets the value of the brandLogoUri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandLogoUri() {
        return brandLogoUri;
    }

    /**
     * Sets the value of the brandLogoUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandLogoUri(String value) {
        this.brandLogoUri = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     */
    public int getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     */
    public void setStatusCode(int value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the statusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDescription() {
        return statusDescription;
    }

    /**
     * Sets the value of the statusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDescription(String value) {
        this.statusDescription = value;
    }

    /**
     * Gets the value of the authenticationResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationResultCode }
     *     
     */
    public AuthenticationResultCode getAuthenticationResultCode() {
        return authenticationResultCode;
    }

    /**
     * Sets the value of the authenticationResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationResultCode }
     *     
     */
    public void setAuthenticationResultCode(AuthenticationResultCode value) {
        this.authenticationResultCode = value;
    }

    /**
     * Gets the value of the errorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getErrorDetails() {
        return errorDetails;
    }

    /**
     * Sets the value of the errorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setErrorDetails(ArrayOfString value) {
        this.errorDetails = value;
    }

    /**
     * Gets the value of the traceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraceId() {
        return traceId;
    }

    /**
     * Sets the value of the traceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraceId(String value) {
        this.traceId = value;
    }

    /**
     * Gets the value of the resourceSets property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfResourceSet }
     *     
     */
    public ArrayOfResourceSet getResourceSets() {
        return resourceSets;
    }

    /**
     * Sets the value of the resourceSets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfResourceSet }
     *     
     */
    public void setResourceSets(ArrayOfResourceSet value) {
        this.resourceSets = value;
    }

}
