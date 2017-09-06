package org.dnb.tcs.hackathon.unifiedbanking.apis.controllers;

import java.io.IOException;
import java.net.MalformedURLException;

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
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

@RestController
public class UnifiedPaymentAPIController {
	
	private static final Logger logger = LogManager.getLogger(UnifiedPaymentAPIController.class);
	
	@RequestMapping(method = RequestMethod.GET, path="/ubp/payments", produces = "application/json")
	public Payment getPaymentDetails(@RequestParam("bankID") String bankIDStr, @RequestParam("paymentId") String paymentIdStr){
		logger.info("Fetching payment Information for bankID =" + bankIDStr + " & paymentId = " + paymentIdStr);
		
		String endPointUrl = "";
		Payment payment = null;
		PaymentMediator paymentMediator = null;
		Integer bankID = Integer.parseInt(bankIDStr);
		Long paymentId = Long.parseLong(paymentIdStr);
		
		Client client = Client.create();
		
		if (1 == bankID){
			endPointUrl = "https://dnbapistore.com/hackathon/payments/1.0/payment/"+paymentId;
		} else {
			endPointUrl = "http://localhost:8080/bankb/payments/paymentId/"+paymentId;
		}
		
		
		try {
			
			WebResource webResource = client.resource(endPointUrl);
			ClientResponse response = webResource.accept("application/json").header("Authorization", "Bearer cb456f4e-c563-3cd2-8017-109e4bbc630e").get(ClientResponse.class);
									
			if ((response.getStatus() >= 203)){
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatus());
			}

			
			String output =response.getEntity(String.class);			
			
			output = output.replaceAll("KIDNumber", "kidNumber");

			if (1 == bankID){
				payment = new ObjectMapper().readValue(output, Payment.class);
			} else {
				paymentMediator = new ObjectMapper().readValue(output, PaymentMediator.class);
				
				payment = new Payment(paymentMediator);
			}
			
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
