package com.form3.payment.model;

public class Fx {

	private String contractReference;
	private String exchangeRate;
	private String originalAmount;
	private String originalCurrency;
	
	public String getContractReference() {
		return contractReference;
	}
	public void setContractReference(String contractReference) {
		this.contractReference = contractReference;
	}
	public String getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(String exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	public String getOriginalAmount() {
		return originalAmount;
	}
	public void setOriginalAmount(String originalAmount) {
		this.originalAmount = originalAmount;
	}
	public String getOriginalCurrency() {
		return originalCurrency;
	}
	public void setOriginalCurrency(String originalCurrency) {
		this.originalCurrency = originalCurrency;
	}

}
