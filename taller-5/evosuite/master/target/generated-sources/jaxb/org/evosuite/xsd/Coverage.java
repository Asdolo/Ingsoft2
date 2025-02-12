//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.18 at 07:36:59 PM ART 
//


package org.evosuite.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Coverage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Coverage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="criterion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="coverageValue" type="{}percentage"/>
 *         &lt;element name="coverageBitString" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Coverage", propOrder = {
    "criterion",
    "coverageValue",
    "coverageBitString"
})
public class Coverage {

    @XmlElement(required = true)
    protected String criterion;
    protected double coverageValue;
    @XmlElement(required = true)
    protected String coverageBitString;

    /**
     * Gets the value of the criterion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCriterion() {
        return criterion;
    }

    /**
     * Sets the value of the criterion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCriterion(String value) {
        this.criterion = value;
    }

    /**
     * Gets the value of the coverageValue property.
     * 
     */
    public double getCoverageValue() {
        return coverageValue;
    }

    /**
     * Sets the value of the coverageValue property.
     * 
     */
    public void setCoverageValue(double value) {
        this.coverageValue = value;
    }

    /**
     * Gets the value of the coverageBitString property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverageBitString() {
        return coverageBitString;
    }

    /**
     * Sets the value of the coverageBitString property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverageBitString(String value) {
        this.coverageBitString = value;
    }

}
