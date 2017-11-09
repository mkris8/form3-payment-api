package com.form3.payment.controller.integration;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.form3.payment.controller.PaymentURIConstants;

public class PaymentControllerIntegrationTest {
	
	private static final Logger logger = LoggerFactory.getLogger(PaymentControllerIntegrationTest.class);
	
	@Ignore
	public void setUp() throws Exception {
		HttpClient httpClient = new DefaultHttpClient();
		HttpGet httpGet = new HttpGet(PaymentURIConstants.HOST + PaymentURIConstants.TEST_PAYMENT);
		httpClient.execute(httpGet);
	}

	@Ignore
	public void createPayment() throws Exception{
		HttpClient httpClient = new DefaultHttpClient();
		HttpPost postRequest = new HttpPost(PaymentURIConstants.HOST + PaymentURIConstants.CREATE_PAYMENT);

			StringEntity input = new StringEntity(PaymentURIConstants.SAMPLE_RQST
					);
			
			input.setContentType("application/json");
			postRequest.setEntity(input);
			HttpResponse response = httpClient.execute(postRequest);
			
			assertEquals(response.getStatusLine().getStatusCode(), 200);
			logResponse(response, "createPayment");
			
	}
	
	@Ignore
	public void testGetAllPayments() throws ClientProtocolException, IOException {
		HttpClient httpClient = new DefaultHttpClient();
		HttpGet httpGet = new HttpGet(PaymentURIConstants.HOST + PaymentURIConstants.GET_ALL_PAYMENTS);
		HttpResponse response = httpClient.execute(httpGet);

		assertEquals(response.getStatusLine().getStatusCode(), 200);
		logResponse(response, "testGetAllPayments");
	}
	
	@Ignore
	public void getPaymentDetailsForId() throws Exception{
		HttpClient httpClient = new DefaultHttpClient();
		HttpGet httpGet = new HttpGet(PaymentURIConstants.HOST + "/form3/payment/4ee3a8d8-ca7b-4290-a52c-dd5b6165ec43");
		HttpResponse response = httpClient.execute(httpGet);
		
		assertEquals(response.getStatusLine().getStatusCode(),200);
		logResponse(response, "getPaymentDetailsForId");
	}

	@Ignore
	public void testDeletePayments() throws ClientProtocolException, IOException {
		HttpClient httpClient = new DefaultHttpClient();
		HttpPut httpPut = new HttpPut(PaymentURIConstants.HOST + PaymentURIConstants.DELETE + "4ee3a8d8-ca7b-4290-a52c-dd5b6165ec43");
		HttpResponse response = httpClient.execute(httpPut);
		
		assertEquals(response.getStatusLine().getStatusCode(),200);
		logResponse(response, "testDeletePayments");
		
	}

	private void logResponse(HttpResponse response, String testName) throws IOException {
		HttpEntity entity = response.getEntity();
	    if ( entity != null ) {
            InputStream instream = entity.getContent();
            String result = convertStreamToString(instream);
            logger.info("RESPONSE in [ "+testName+" ]: " + result);
            
	    }
	}
	
	private String convertStreamToString(InputStream inputStream) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		StringBuilder builder = new StringBuilder();

		String line = null;
		try {
			while ((line = reader.readLine()) != null) {
				builder.append(line + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return builder.toString();
	}
		
}
