package com.koitoer.spring.webservice.domain;


import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
* <p>Java class for anonymous complex type.
* 
* <p>The following schema fragment specifies the expected content contained within this class.
* 
* <pre>
* &lt;complexType>
*   &lt;complexContent>
*     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
*       &lt;attribute name="amount" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
*       &lt;attribute name="confirmationId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
*       &lt;attribute name="filmId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
*       &lt;attribute name="quantity" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
*       &lt;attribute name="sessionDate" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
*     &lt;/restriction>
*   &lt;/complexContent>
* &lt;/complexType>
* </pre>
* 
* 
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ticketResponse")
public class TicketResponse {

 @XmlAttribute(name = "amount", required = true)
 protected BigDecimal amount;
 @XmlAttribute(name = "confirmationId", required = true)
 protected String confirmationId;
 @XmlAttribute(name = "filmId", required = true)
 protected String filmId;
 @XmlAttribute(name = "quantity", required = true)
 protected BigInteger quantity;
 @XmlAttribute(name = "sessionDate", required = true)
 @XmlSchemaType(name = "date")
 protected XMLGregorianCalendar sessionDate;

 /**
  * Gets the value of the amount property.
  * 
  * @return
  *     possible object is
  *     {@link BigDecimal }
  *     
  */
 public BigDecimal getAmount() {
     return amount;
 }

 /**
  * Sets the value of the amount property.
  * 
  * @param value
  *     allowed object is
  *     {@link BigDecimal }
  *     
  */
 public void setAmount(BigDecimal value) {
     this.amount = value;
 }

 /**
  * Gets the value of the confirmationId property.
  * 
  * @return
  *     possible object is
  *     {@link String }
  *     
  */
 public String getConfirmationId() {
     return confirmationId;
 }

 /**
  * Sets the value of the confirmationId property.
  * 
  * @param value
  *     allowed object is
  *     {@link String }
  *     
  */
 public void setConfirmationId(String value) {
     this.confirmationId = value;
 }

 /**
  * Gets the value of the filmId property.
  * 
  * @return
  *     possible object is
  *     {@link String }
  *     
  */
 public String getFilmId() {
     return filmId;
 }

 /**
  * Sets the value of the filmId property.
  * 
  * @param value
  *     allowed object is
  *     {@link String }
  *     
  */
 public void setFilmId(String value) {
     this.filmId = value;
 }

 /**
  * Gets the value of the quantity property.
  * 
  * @return
  *     possible object is
  *     {@link BigInteger }
  *     
  */
 public BigInteger getQuantity() {
     return quantity;
 }

 /**
  * Sets the value of the quantity property.
  * 
  * @param value
  *     allowed object is
  *     {@link BigInteger }
  *     
  */
 public void setQuantity(BigInteger value) {
     this.quantity = value;
 }

 /**
  * Gets the value of the sessionDate property.
  * 
  * @return
  *     possible object is
  *     {@link XMLGregorianCalendar }
  *     
  */
 public XMLGregorianCalendar getSessionDate() {
     return sessionDate;
 }

 /**
  * Sets the value of the sessionDate property.
  * 
  * @param value
  *     allowed object is
  *     {@link XMLGregorianCalendar }
  *     
  */
 public void setSessionDate(XMLGregorianCalendar value) {
     this.sessionDate = value;
 }

}

