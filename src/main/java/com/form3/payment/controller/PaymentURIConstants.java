package com.form3.payment.controller;

public class PaymentURIConstants {

	public static final String TEST_PAYMENT = "/form3/payment/test";
	public static final String GET_PAYMENT = "/form3/payment/{id}";
	public static final String GET_PAYMENT_RESOURCES = "/form3/payment/{id}/{resource}";
	public static final String GET_ALL_PAYMENTS = "/form3/payment/all";
	public static final String CREATE_PAYMENT = "/form3/payment/create";
	public static final String DELETE_PAYMENT = "/form3/payment/delete/{id}";
	
	public static final String HOST = "http://localhost:8080";
	public static final String SAMPLE_RQST = "{\"type\":\"Payment\","
			+ "\"id\":\"4ee3a8d8-ca7b-4290-a52c-dd5b6165ec111\","
			+ "\"version\":0,\"organisation_id\":\"743d5b63-8e6f-432e-a8fa-c5d8d2ee5fcb\","
			+ "\"attributes\":{\"amount\":100.21,\"beneficiaryParty\""
			+ ":{\"account_name\":\"W Owens\",\"account_number\":31926819,"
			+ "\"account_number_code\":null,\"account_type\":0,\"address\":"
			+ "\"1 The Beneficiary Localtown SE2\",\"bank_id\":403000,\"bank_id_code\""
			+ ":\"GBDSC\",\"name\":\"Wilfred Jeremiah Owens\"}},\"endToEndReference\""
			+ ":\"Wil piano Jan\"}";
	public static final String DELETE = "/form3/payment/delete/";
	
	

}
