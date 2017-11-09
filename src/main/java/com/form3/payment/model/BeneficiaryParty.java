package com.form3.payment.model;

public class BeneficiaryParty {
//
//	"account_name": "W Owens",
//	"account_number": "31926819",
//	"account_number_code": "BBAN",
//	"account_type": 0,
//	"address": "1 The Beneficiary Localtown SE2",
//	"bank_id": "403000",
//	"bank_id_code": "GBDSC",
//	"name": "Wilfred Jeremiah Owens"
	
	private String account_name;
	private int account_number;
	private String account_number_code;
	private int account_type;
	private String address;
	private int bank_id;
	private String bank_id_code;
	private String name;
	
	public String getAccount_name() {
		return account_name;
	}
	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}
	public int getAccount_number() {
		return account_number;
	}
	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}
	public String getAccount_number_code() {
		return account_number_code;
	}
	public void setAccount_number_code(String account_number_code) {
		this.account_number_code = account_number_code;
	}
	public int getAccount_type() {
		return account_type;
	}
	public void setAccount_type(int account_type) {
		this.account_type = account_type;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getBank_id() {
		return bank_id;
	}
	public void setBank_id(int bank_id) {
		this.bank_id = bank_id;
	}
	public String getBank_id_code() {
		return bank_id_code;
	}
	public void setBank_id_code(String bank_id_code) {
		this.bank_id_code = bank_id_code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
