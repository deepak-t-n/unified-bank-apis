package org.dnb.tcs.hackathon.unifiedbanking.apis.controllers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.dnb.tcs.hackathon.unifiedbanking.apis.models.Payment;
import org.dnb.tcs.hackathon.unifiedbanking.mediator.models.PaymentMediator;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class UnifiedPaymentAPIController {
	
	private static final Logger logger = LogManager.getLogger(UnifiedPaymentAPIController.class);
	
	@RequestMapping(method = RequestMethod.GET, path="/ubp/payments", produces = "application/json")
	public Payment getPaymentDetails(@RequestParam("bankID") Integer bankID, @RequestParam("paymentId") Integer paymentId){
		logger.info("Fetching payment Information for bankID =" + bankID + " & paymentId = " + paymentId);
		
		String endPointUrl = "";
		Payment payment = null;
		PaymentMediator paymentMediator = null;
		
		if (1 == bankID){
			endPointUrl = "https://dnbapistore.com/hackathon/payments/1.0/payment/"+paymentId;
		} else {
			endPointUrl = "http://localhost:8080/bankb/payments/paymentId/"+paymentId;
		}
		
		try {
			URL url = new URL(endPointUrl);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");
			conn.setRequestProperty("Authorization", "cb456f4e-c563-3cd2-8017-109e4bbc630e");
			
			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			String output;
			while ((output = br.readLine()) != null) {}
			
			if (1 == bankID){
				payment = new ObjectMapper().readValue(output, Payment.class);
			} else {
				paymentMediator = new ObjectMapper().readValue(output, PaymentMediator.class);
				
				payment = new Payment(paymentMediator);
			}
			
			conn.disconnect();
		} catch (MalformedURLException e) {
			logger.error("Invalid Json", e);
		} catch (IOException e) {
			logger.error("Invalid Json", e);
		}
		
		logger.info("Returing Customer Information for " + payment);
		
		return payment;
	}
	
	@RequestMapping(method = RequestMethod.POST, path="/ubp/payments", produces = "application/json")
	public Payment getPaymentDetails(@RequestBody Payment payment){
		logger.info("Fetching payment Information for payments " + payment);
		
		
		
		logger.info("Returing Customer Information for " + payment);
		
		return payment;
	}
	
}
