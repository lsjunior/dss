//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.2-hudson-jaxb-ri-2.2-63- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.04.09 at 01:57:18 PM CEST 
//


package eu.europa.esig.jaxb.tslx;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.esig.jaxb.xades.ObjectIdentifierType;


/**
 * <p>Java class for ExtendedKeyUsageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendedKeyUsageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="KeyPurposeId" type="{http://uri.etsi.org/01903/v1.3.2#}ObjectIdentifierType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedKeyUsageType", propOrder = {
    "keyPurposeId"
})
public class ExtendedKeyUsageType
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(name = "KeyPurposeId", required = true)
    protected List<ObjectIdentifierType> keyPurposeId;

    /**
     * Gets the value of the keyPurposeId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyPurposeId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyPurposeId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjectIdentifierType }
     * 
     * 
     */
    public List<ObjectIdentifierType> getKeyPurposeId() {
        if (keyPurposeId == null) {
            keyPurposeId = new ArrayList<ObjectIdentifierType>();
        }
        return this.keyPurposeId;
    }

}