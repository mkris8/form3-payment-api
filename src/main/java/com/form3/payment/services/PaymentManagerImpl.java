package com.form3.payment.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.form3.payment.model.json.Attributes;
import com.form3.payment.model.json.BeneficiaryParty;
import com.form3.payment.model.json.ChargesInformation;
import com.form3.payment.model.json.DebtorParty;
import com.form3.payment.model.json.Fx;
import com.form3.payment.model.json.Payment;
import com.form3.payment.model.json.SenderCharge;
import com.form3.payment.model.json.SponsorParty;

@Service ("paymentManager")
public class PaymentManagerImpl implements PaymentManager {

	//Map to store Payments, ideally this is a DAO layer to database persistence
	Map<String, Payment> paymentData = new HashMap<String, Payment>();
	private final String errorMessage = "The requested Payment does not exist for id:";
			
	@Override
	public Payment getTestPayment() {
		Payment payment = setUpSamplePayment();
		paymentData.put(payment.getId(), payment);
		
		return payment;
	}

	@Override
	public Payment getPayment(String paymentId) {
		Payment payment;
		
		if(paymentData.containsKey(paymentId)) {
			payment =  paymentData.get(paymentId);
		} else {
			payment = new Payment();
			payment.setErrorMessage(errorMessage +paymentId);
		}
		
		return payment;
	}

	@Override
	public Object getPaymentResources(String id, String resource) {
		final String errorResponse = "No available resource for this request. Please try again";

		if (resource.equalsIgnoreCase("attributes")) {
			return paymentData.get(id).getAttributes();
		} else if (resource.equalsIgnoreCase("chargesInformation")) {
			return paymentData.get(id).getChargesInformation();
		} else if (resource.equalsIgnoreCase("currency")) {
			return paymentData.get(id).getCurrency();
		} else if (resource.equalsIgnoreCase("debtorparty")) {
			return paymentData.get(id).getDebtorParty();
		} else if (resource.equalsIgnoreCase("endToEndReference")) {
			return paymentData.get(id).getEndToEndReference();
		} else if (resource.equalsIgnoreCase("Fx")) {
			return paymentData.get(id).getFx();
		} else if (resource.equalsIgnoreCase("numericReference")) {
			return paymentData.get(id).getNumericReference();
		} else if (resource.equalsIgnoreCase("sponsorParty")) {
			return paymentData.get(id).getSponsorParty();
		}

		return errorResponse;
	}

	@Override
	public List<Payment> getAllPayments() {
		List<Payment> payments = new ArrayList<Payment>();
		Set<String> paymentIdKeys = paymentData.keySet();
		for(String i : paymentIdKeys){
			payments.add(paymentData.get(i));
		}
		
		return payments;
	}

	@Override
	public Payment createPayment(Payment payment) {
		paymentData.put(payment.getId(), payment);
		
		return payment;
	}

	@Override
	public Payment deletePayment(String id) {
		Payment payment;
		
		if(paymentData.containsKey(id)) {
			payment =  paymentData.get(id);
		} else {
			payment = new Payment();
			payment.setErrorMessage(errorMessage+id);
		}
		
		paymentData.remove(id);
		
		return payment;
	}
	
	private Payment setUpSamplePayment() {
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
		
		Fx fx = new Fx();
		fx.setContractReference("FX123");
		fx.setExchangeRate("2.00000");
		fx.setOriginalAmount("200.42");
		fx.setOriginalCurrency("USD");
		payment.setFx(fx);
		
		payment.setNumericReference("1002001");
		payment.setPaymentId("123456789012345678");
		payment.setPaymentPurpose("Paying for goods/services");
		payment.setPaymentScheme("FPS");
		payment.setPaymentType("Credit");
		payment.setProcessingDate("2017-01-18");
		payment.setReference("Payment for Em's piano lessons");
		payment.setSchemePaymentSubType("InternetBanking");
		payment.setSchemePaymentType("ImmediatePayment");
		
		SponsorParty sponsorParty = new SponsorParty();
		sponsorParty.setAccountNumber("56781234");
		sponsorParty.setBankId("123123");
		sponsorParty.setBankIdCode("GBDSC");
		payment.setSponsorParty(sponsorParty);
		
		return payment;
	}
}
