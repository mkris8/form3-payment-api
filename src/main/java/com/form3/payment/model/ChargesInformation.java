package com.form3.payment.model;

import java.util.List;

public class ChargesInformation {

	private String bearerCode;
	private List<SenderCharges> senderCharges;
	private double receiverChargesAmount;
	private String receiverChargesCurrency ; 
	
	public String getBearerCode() {
		return bearerCode;
	}
	public void setBearerCode(String bearerCode) {
		this.bearerCode = bearerCode;
	}
	public List<SenderCharges> getSenderCharges() {
		return senderCharges;
	}
	public void setSenderCharges(List<SenderCharges> senderCharges) {
		this.senderCharges = senderCharges;
	}
	public double getReceiverChargesAmount() {
		return receiverChargesAmount;
	}
	public void setReceiverChargesAmount(double receiverChargesAmount) {
		this.receiverChargesAmount = receiverChargesAmount;
	}
	public String getReceiverChargesCurrency() {
		return receiverChargesCurrency;
	}
	public void setReceiverChargesCurrency(String receiverChargesCurrency) {
		this.receiverChargesCurrency = receiverChargesCurrency;
	}
	
}
