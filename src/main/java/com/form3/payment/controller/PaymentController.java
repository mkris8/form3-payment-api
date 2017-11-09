package com.form3.payment.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.form3.payment.model.json.Payment;
import com.form3.payment.services.PaymentManager;

@RestController("paymentController")
public class PaymentController {

	private static final Logger logger = LoggerFactory.getLogger(PaymentController.class);
	
	@Autowired
	PaymentManager paymentManager;

	@RequestMapping(value = PaymentURIConstants.TEST_PAYMENT, method = RequestMethod.GET)
	public @ResponseBody Payment getTestPayment2() {
		logger.info("Start getTestPayment");
		return paymentManager.getTestPayment();
	}
	
	@RequestMapping(value = PaymentURIConstants.GET_PAYMENT, method = RequestMethod.GET)
	public @ResponseBody Payment getPayment(@PathVariable("id") String id) {
		logger.info("Start getPayment. id="+id);
		return paymentManager.getPayment(id);	
	}	
	
	@RequestMapping(value = PaymentURIConstants.GET_PAYMENT_RESOURCES, method = RequestMethod.GET)
	public @ResponseBody Object getPaymentResources(@PathVariable("id") String id,
			@PathVariable("resource") String resource) {

		logger.info("Start getPaymentResources. id=" + id, "resource=" + resource);
		return paymentManager.getPaymentResources(id, resource);
	}	

	@RequestMapping(value = PaymentURIConstants.GET_ALL_PAYMENTS, method = RequestMethod.GET)
	public @ResponseBody List<Payment> getAllPayments() {
		logger.info("Start getAllPayments.");
		return paymentManager.getAllPayments();
	}
	
	@RequestMapping(value = PaymentURIConstants.CREATE_PAYMENT, method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Payment createPayment(@RequestBody Payment payment) {
		logger.info("Start createPayment.");
		return paymentManager.createPayment(payment);
	}
	
	@RequestMapping(value = PaymentURIConstants.DELETE_PAYMENT, method = RequestMethod.PUT)
	public @ResponseBody Payment deletePayment(@PathVariable("id") String id) {
		logger.info("Start delete Payment for id: " + id);
		return paymentManager.deletePayment(id);
	}

}