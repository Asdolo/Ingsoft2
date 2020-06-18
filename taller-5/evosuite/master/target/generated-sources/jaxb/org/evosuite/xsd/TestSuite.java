//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.18 at 07:36:59 PM ART 
//


package org.evosuite.xsd;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TestSuite complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestSuite">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fullPathOfTestSuite" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numberOfTests" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="totalNumberOfStatements" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="totalEffortInSeconds" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;sequence>
 *           &lt;element name="coverage" type="{}Coverage" maxOccurs="unbounded"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestSuite", propOrder = {
    "fullPathOfTestSuite",
    "numberOfTests",
    "totalNumberOfStatements",
    "totalEffortInSeconds",
    "coverage"
})
public class TestSuite {

    @XmlElement(required = true)
    protected String fullPathOfTestSuite;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfTests;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalNumberOfStatements;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger totalEffortInSeconds;
    @XmlElement(required = true)
    protected List<Coverage> coverage;

    /**
     * Gets the value of the fullPathOfTestSuite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullPathOfTestSuite() {
        return fullPathOfTestSuite;
    }

    /**
     * Sets the value of the fullPathOfTestSuite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullPathOfTestSuite(String value) {
        this.fullPathOfTestSuite = value;
    }

    /**
     * Gets the value of the numberOfTests property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfTests() {
        return numberOfTests;
    }

    /**
     * Sets the value of the numberOfTests property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfTests(BigInteger value) {
        this.numberOfTests = value;
    }

    /**
     * Gets the value of the totalNumberOfStatements property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalNumberOfStatements() {
        return totalNumberOfStatements;
    }

    /**
     * Sets the value of the totalNumberOfStatements property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalNumberOfStatements(BigInteger value) {
        this.totalNumberOfStatements = value;
    }

    /**
     * Gets the value of the totalEffortInSeconds property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalEffortInSeconds() {
        return totalEffortInSeconds;
    }

    /**
     * Sets the value of the totalEffortInSeconds property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalEffortInSeconds(BigInteger value) {
        this.totalEffortInSeconds = value;
    }

    /**
     * Gets the value of the coverage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coverage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoverage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coverage }
     * 
     * 
     */
    public List<Coverage> getCoverage() {
        if (coverage == null) {
            coverage = new ArrayList<Coverage>();
        }
        return this.coverage;
    }

}
