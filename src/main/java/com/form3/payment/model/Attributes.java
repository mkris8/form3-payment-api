package com.form3.payment.model;

public class Attributes {
//	"amount": "100.21",
//	"beneficiary_party": {
//	"account_name": "W Owens",
//		"account_number": "31926819",
//		"account_number_code": "BBAN",
//		"account_type": 0,
//		"address": "1 The Beneficiary Localtown SE2",
//		"bank_id": "403000",
//		"bank_id_code": "GBDSC",
//		"name": "Wilfred Jeremiah Owens"
	
	private double amount;
	private BeneficiaryParty beneficiaryParty;
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public BeneficiaryParty getBeneficiaryParty() {
		return beneficiaryParty;
	}
	public void setBeneficiaryParty(BeneficiaryParty beneficiaryParty) {
		this.beneficiaryParty = beneficiaryParty;
	}
}
