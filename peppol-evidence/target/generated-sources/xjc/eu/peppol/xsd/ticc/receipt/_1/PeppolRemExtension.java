//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.16 at 09:16:37 AM CET 
//


package eu.peppol.xsd.ticc.receipt._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TransmissionProtocol" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TransmissionRole" type="{http://peppol.eu/xsd/ticc/receipt/1.0}TransmissionRole"/&gt;
 *         &lt;element name="OriginalReceipt" type="{http://peppol.eu/xsd/ticc/receipt/1.0}OriginalReceiptType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "transmissionProtocol",
    "transmissionRole",
    "originalReceipt"
})
@XmlRootElement(name = "PeppolRemExtension")
public class PeppolRemExtension {

    @XmlElement(name = "TransmissionProtocol", required = true)
    protected String transmissionProtocol;
    @XmlElement(name = "TransmissionRole", required = true)
    @XmlSchemaType(name = "string")
    protected TransmissionRole transmissionRole;
    @XmlElement(name = "OriginalReceipt")
    protected OriginalReceiptType originalReceipt;

    /**
     * Gets the value of the transmissionProtocol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransmissionProtocol() {
        return transmissionProtocol;
    }

    /**
     * Sets the value of the transmissionProtocol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransmissionProtocol(String value) {
        this.transmissionProtocol = value;
    }

    /**
     * Gets the value of the transmissionRole property.
     * 
     * @return
     *     possible object is
     *     {@link TransmissionRole }
     *     
     */
    public TransmissionRole getTransmissionRole() {
        return transmissionRole;
    }

    /**
     * Sets the value of the transmissionRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransmissionRole }
     *     
     */
    public void setTransmissionRole(TransmissionRole value) {
        this.transmissionRole = value;
    }

    /**
     * Gets the value of the originalReceipt property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalReceiptType }
     *     
     */
    public OriginalReceiptType getOriginalReceipt() {
        return originalReceipt;
    }

    /**
     * Sets the value of the originalReceipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalReceiptType }
     *     
     */
    public void setOriginalReceipt(OriginalReceiptType value) {
        this.originalReceipt = value;
    }

}
