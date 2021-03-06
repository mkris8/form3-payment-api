package com.form3.payment.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import com.form3.payment.model.json.Attributes;
import com.form3.payment.model.json.BeneficiaryParty;
import com.form3.payment.model.json.ChargesInformation;
import com.form3.payment.model.json.DebtorParty;
import com.form3.payment.model.json.Payment;
import com.form3.payment.model.json.SenderCharge;

@RunWith(SpringRunner.class)
@SpringBootTest

public class PaymentControllerTest {

	private PaymentController controller;
	private @Mock Payment mockPayment;
	private @Mock List<Payment> listOfPayments;
	private @Mock PaymentController mockcontroller;
	private @Mock Map<String, Payment> paymentData;
	
	@Before
	public void init() throws Exception {
		controller = new PaymentController();
	}
	
	@Test
	public void getSamplePayment() {
		initialize(controller);
		Assert.notNull(controller);
	}

	@Test
	public void getAllPayments() {
		when(mockcontroller.getAllPayments()).thenReturn(listOfPayments);
	}
	
	@Ignore
	public void getAllPaymentsForEmptyPayments() {
		List<Payment> paymentsList = controller.getAllPayments();
		assertEquals(0, paymentsList.size());
	}
	
	@Test
	public void getPayment() throws Exception{
		when(mockcontroller.getPayment(anyString())).thenReturn(mockPayment);
	}
	
	@Test
	public void createPayment() {
		when(mockcontroller.createPayment(mockPayment)).thenReturn(mockPayment);
	}

	@Test
	public void deletePayment() {
		when(mockcontroller.deletePayment(anyString())).thenReturn(mockPayment);
	}
	
	private void initialize(PaymentController controller) {
		
		Payment payment = new Payment();
		Attributes attributes = new Attributes();
		BeneficiaryParty beneficiaryParty = new  BeneficiaryParty();
		
		payment.setType("Payment");
		payment.setId("4ee3a8d8-ca7b-4290-a52c-dd5b6165ec43");
		payment.setVersion(0);
		payment.setOrganisation_id("743d5b63-8e6f-432e-a8fa-c5d8d2ee5fcb");
		
		attributes.setAmount("100.21");
		beneficiaryParty.setAccountName("W Owens");
		beneficiaryParty.setAccountNumber("31926819");
		beneficiaryParty.setAccountType(0);
		beneficiaryParty.setAddress("1 The Beneficiary Localtown SE2");
		beneficiaryParty.setBankId("403000");
		beneficiaryParty.setBankIdCode("GBDSC");
		beneficiaryParty.setName("Wilfred Jeremiah Owens");
		attributes.setBeneficiaryParty(beneficiaryParty);
		
		payment.setAttributes(attributes);
		
		ChargesInformation chargesInformation = new ChargesInformation();
		chargesInformation.setBearerCode("SHAR");
		
		SenderCharge SenderCharge1 = new SenderCharge();
		SenderCharge1.setAmount("5.00");
		SenderCharge1.setCurrency("GBP");
		SenderCharge SenderCharge2 = new SenderCharge();
		SenderCharge2.setAmount("10.00");
		SenderCharge2.setCurrency("USD");
		List<SenderCharge> SenderChargeList = new ArrayList<SenderCharge>();
		SenderChargeList.add(SenderCharge1);
		SenderChargeList.add(SenderCharge2);
		
		chargesInformation.setSenderCharges(SenderChargeList);
		
		chargesInformation.setReceiverChargesAmount("1.00");
		chargesInformation.setReceiverChargesCurrency("USD");
		payment.setChargesInformation(chargesInformation);
		payment.setCurrency("GBP");
		
		DebtorParty debtorParty = new DebtorParty();
		debtorParty.setAccountName("EJ Brown Black");
		debtorParty.setAccountNumber("GB29XABC10161234567801");
		debtorParty.setAccountNumberCode("IBAN");
		debtorParty.setAddress("10 Debtor Crescent Sourcetown NE1");
		debtorParty.setBankId("203301");
		debtorParty.setBankIdCode("GBDSC");
		debtorParty.setName("Emelia Jane Brown");
		payment.setDebtorParty(debtorParty);
		payment.setEndToEndReference("Wil piano Jan");
	}
	
}
