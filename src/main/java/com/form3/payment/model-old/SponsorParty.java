package com.form3.payment.model;

public class SponsorParty {

	private int accountNumber;
	private int bankId;
	private String bankIdCode;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public String getBankIdCode() {
		return bankIdCode;
	}
	public void setBankIdCode(String bankIdCode) {
		this.bankIdCode = bankIdCode;
	}
}
