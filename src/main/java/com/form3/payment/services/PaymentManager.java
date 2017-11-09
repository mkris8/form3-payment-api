package com.form3.payment.services;

import java.util.List;

import com.form3.payment.model.Payment;

public interface PaymentManager {

	public Payment getTestPayment();
	public Payment getPayment(String paymentId);
	public Object getPaymentResources (String id, String resource);
	public List<Payment> getAllPayments();
	public Payment createPayment(Payment payment);
	public Payment deletePayment(String id);
	
}
