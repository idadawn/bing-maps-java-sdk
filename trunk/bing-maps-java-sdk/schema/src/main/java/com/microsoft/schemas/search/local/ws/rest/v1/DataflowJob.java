
package com.microsoft.schemas.search.local.ws.rest.v1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DataflowJob complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataflowJob">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/search/local/ws/rest/v1}Resource">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CompletedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TotalEntityCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="ProcessedEntityCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="FailedEntityCount" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataflowJob", propOrder = {
    "description",
    "status",
    "errorMessage",
    "createdDate",
    "completedDate",
    "totalEntityCount",
    "processedEntityCount",
    "failedEntityCount"
})
public class DataflowJob
    extends Resource
{

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    @XmlElement(name = "CreatedDate", required = true)
    protected XMLGregorianCalendar createdDate;
    @XmlElement(name = "CompletedDate", required = true, nillable = true)
    protected XMLGregorianCalendar completedDate;
    @XmlElement(name = "TotalEntityCount")
    protected long totalEntityCount;
    @XmlElement(name = "ProcessedEntityCount")
    protected long processedEntityCount;
    @XmlElement(name = "FailedEntityCount")
    protected long failedEntityCount;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the errorMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the completedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompletedDate() {
        return completedDate;
    }

    /**
     * Sets the value of the completedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompletedDate(XMLGregorianCalendar value) {
        this.completedDate = value;
    }

    /**
     * Gets the value of the totalEntityCount property.
     * 
     */
    public long getTotalEntityCount() {
        return totalEntityCount;
    }

    /**
     * Sets the value of the totalEntityCount property.
     * 
     */
    public void setTotalEntityCount(long value) {
        this.totalEntityCount = value;
    }

    /**
     * Gets the value of the processedEntityCount property.
     * 
     */
    public long getProcessedEntityCount() {
        return processedEntityCount;
    }

    /**
     * Sets the value of the processedEntityCount property.
     * 
     */
    public void setProcessedEntityCount(long value) {
        this.processedEntityCount = value;
    }

    /**
     * Gets the value of the failedEntityCount property.
     * 
     */
    public long getFailedEntityCount() {
        return failedEntityCount;
    }

    /**
     * Sets the value of the failedEntityCount property.
     * 
     */
    public void setFailedEntityCount(long value) {
        this.failedEntityCount = value;
    }

}
