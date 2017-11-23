//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.16 at 09:16:37 AM CET 
//


package org.etsi.uri._02640.v2_;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.etsi.uri._01903.v1_3.CertIDType;


/**
 * <p>Java class for CertificateDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CertificateDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="X509Certificate" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="CertID" type="{http://uri.etsi.org/01903/v1.3.2#}CertIDType"/&gt;
 *         &lt;element ref="{http://uri.etsi.org/02640/v2#}CertIDAndSignature"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateDetailsType", propOrder = {
    "x509Certificate",
    "certID",
    "certIDAndSignature"
})
public class CertificateDetailsType {

    @XmlElement(name = "X509Certificate")
    protected byte[] x509Certificate;
    @XmlElement(name = "CertID")
    protected CertIDType certID;
    @XmlElement(name = "CertIDAndSignature")
    protected CertIDAndSignatureType certIDAndSignature;

    /**
     * Gets the value of the x509Certificate property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getX509Certificate() {
        return x509Certificate;
    }

    /**
     * Sets the value of the x509Certificate property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setX509Certificate(byte[] value) {
        this.x509Certificate = value;
    }

    /**
     * Gets the value of the certID property.
     * 
     * @return
     *     possible object is
     *     {@link CertIDType }
     *     
     */
    public CertIDType getCertID() {
        return certID;
    }

    /**
     * Sets the value of the certID property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertIDType }
     *     
     */
    public void setCertID(CertIDType value) {
        this.certID = value;
    }

    /**
     * Gets the value of the certIDAndSignature property.
     * 
     * @return
     *     possible object is
     *     {@link CertIDAndSignatureType }
     *     
     */
    public CertIDAndSignatureType getCertIDAndSignature() {
        return certIDAndSignature;
    }

    /**
     * Sets the value of the certIDAndSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertIDAndSignatureType }
     *     
     */
    public void setCertIDAndSignature(CertIDAndSignatureType value) {
        this.certIDAndSignature = value;
    }

}
