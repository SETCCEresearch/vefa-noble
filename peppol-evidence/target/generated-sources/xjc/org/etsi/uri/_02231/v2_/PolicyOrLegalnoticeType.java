//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.16 at 09:16:37 AM CET 
//


package org.etsi.uri._02231.v2_;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PolicyOrLegalnoticeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyOrLegalnoticeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="TSLPolicy" type="{http://uri.etsi.org/02231/v2#}NonEmptyMultiLangURIType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="TSLLegalNotice" type="{http://uri.etsi.org/02231/v2#}MultiLangStringType" maxOccurs="unbounded"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyOrLegalnoticeType", propOrder = {
    "tslPolicy",
    "tslLegalNotice"
})
public class PolicyOrLegalnoticeType {

    @XmlElement(name = "TSLPolicy")
    protected List<NonEmptyMultiLangURIType> tslPolicy;
    @XmlElement(name = "TSLLegalNotice")
    protected List<MultiLangStringType> tslLegalNotice;

    /**
     * Gets the value of the tslPolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tslPolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTSLPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonEmptyMultiLangURIType }
     * 
     * 
     */
    public List<NonEmptyMultiLangURIType> getTSLPolicy() {
        if (tslPolicy == null) {
            tslPolicy = new ArrayList<NonEmptyMultiLangURIType>();
        }
        return this.tslPolicy;
    }

    /**
     * Gets the value of the tslLegalNotice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tslLegalNotice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTSLLegalNotice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MultiLangStringType }
     * 
     * 
     */
    public List<MultiLangStringType> getTSLLegalNotice() {
        if (tslLegalNotice == null) {
            tslLegalNotice = new ArrayList<MultiLangStringType>();
        }
        return this.tslLegalNotice;
    }

}
