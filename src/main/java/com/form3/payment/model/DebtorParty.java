package com.form3.payment.model;

public class DebtorParty {

	private String accountName;
	private String accountNumber;
	private String accountNumberCode;
	private String address;
	private String bankId;
	private String bankIdCode;
	private String name;
	
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountNumberCode() {
		return accountNumberCode;
	}
	public void setAccountNumberCode(String accountNumberCode) {
		this.accountNumberCode = accountNumberCode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBankId() {
		return bankId;
	}
	public void setBankId(String bankId) {
		this.bankId = bankId;
	}
	public String getBankIdCode() {
		return bankIdCode;
	}
	public void setBankIdCode(String bankIdCode) {
		this.bankIdCode = bankIdCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
