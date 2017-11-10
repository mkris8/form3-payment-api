package com.form3.payment.model.json;

import java.io.Serializable;
import java.util.Map;
import com.form3.payment.model.json.Attributes;
import com.form3.payment.model.json.BeneficiaryParty;
import com.form3.payment.model.json.ChargesInformation;
import com.form3.payment.model.json.DebtorParty;
import com.form3.payment.model.json.Fx;
import com.form3.payment.model.json.Payment;
import com.form3.payment.model.json.SenderCharge;
import com.form3.payment.model.json.SponsorParty;
public class Payment implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String type;
	private String id;
	private int version;
	private String organisation_id;
	
	private Attributes attributes;
	private ChargesInformation chargesInformation;
	private String currency;

	private DebtorParty debtorParty;
	private String endToEndReference;
	private Fx fx;
	
	private String numericReference;
	private String paymentId;
	private String paymentPurpose;
	private String paymentScheme;
	private String paymentType;
	private String processingDate;
	private String reference;
	private String schemePaymentSubType;
	private String schemePaymentType;
	
	private SponsorParty sponsorParty;
	
	private String errorMessage;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public String getOrganisation_id() {
		return organisation_id;
	}
	public void setOrganisation_id(String organisation_id) {
		this.organisation_id = organisation_id;
	}

	public Attributes getAttributes() {
		return attributes;
	}
	
	public void setAttributes(Attributes attributes) {
		this.attributes = attributes;
	}
	
	public ChargesInformation getChargesInformation() {
		return chargesInformation;
	}
	
	public void setChargesInformation(ChargesInformation chargesInformation) {
		this.chargesInformation = chargesInformation;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public DebtorParty getDebtorParty() {
		return debtorParty;
	}
	public void setDebtorParty(DebtorParty debtorParty) {
		this.debtorParty = debtorParty;
	}
	public String getEndToEndReference() {
		return endToEndReference;
	}
	public void setEndToEndReference(String endToEndReference) {
		this.endToEndReference = endToEndReference;
	}
	public Fx getFx() {
		return fx;
	}
	public void setFx(Fx fx) {
		this.fx = fx;
	}

	public String getNumericReference() {
		return numericReference;
	}
	public void setNumericReference(String numericReference) {
		this.numericReference = numericReference;
	}
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
	public String getSchemePaymentSubType() {
		return schemePaymentSubType;
	}
	public void setSchemePaymentSubType(String schemePaymentSubType) {
		this.schemePaymentSubType = schemePaymentSubType;
	}
	public String getSchemePaymentType() {
		return schemePaymentType;
	}
	public void setSchemePaymentType(String schemePaymentType) {
		this.schemePaymentType = schemePaymentType;
	}
	public SponsorParty getSponsorParty() {
		return sponsorParty;
	}
	public void setSponsorParty(SponsorParty sponsorParty) {
		this.sponsorParty = sponsorParty;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
