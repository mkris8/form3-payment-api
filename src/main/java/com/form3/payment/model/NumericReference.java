package com.form3.payment.model;

import java.util.Date;

public class NumericReference {

	private String paymentId ;
	private String paymentPurpose;
	private String paymentScheme;
	private String paymentType;
	private String processingDate;
	private String reference;
	private String schemePaymentSubtype;
	private String schemePaymentType;
	
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public String getPaymentPurpose() {
		return paymentPurpose;
	}
	public void setPaymentPurpose(String paymentPurpose) {
		this.paymentPurpose = paymentPurpose;
	}
	public String getPaymentScheme() {
		return paymentScheme;
	}
	public void setPaymentScheme(String paymentScheme) {
		this.paymentScheme = paymentScheme;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getProcessingDate() {
		return processingDate;
	}
	public void setProcessingDate(String processingDate) {
		this.processingDate = processingDate;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getSchemePaymentSubtype() {
		return schemePaymentSubtype;
	}
	public void setSchemePaymentSubtype(String schemePaymentSubtype) {
		this.schemePaymentSubtype = schemePaymentSubtype;
	}
	public String getSchemePaymentType() {
		return schemePaymentType;
	}
	public void setSchemePaymentType(String schemePaymentType) {
		this.schemePaymentType = schemePaymentType;
	}
}
