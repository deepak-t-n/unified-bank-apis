package org.dnb.tcs.hackathon.bankb.apis.controllers;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.dnb.tcs.hackathon.bankb.apis.Application;
import org.dnb.tcs.hackathon.bankb.apis.models.Payment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Psd2PaymentAPIController {
	
	private static final Logger logger = LogManager.getLogger(Psd2PaymentAPIController.class);
	
	@RequestMapping(method = RequestMethod.GET, path="/bankb/payments/paymentId/{paymentId}", produces = "application/json")
	public Payment getCustomerInfo(@PathVariable("paymentId") Integer paymentId){
		logger.info("Fetching payment Information for " + paymentId);
		
		Payment payment = Application.getPayment(paymentId);
		
		logger.info("Returing Customer Information for " + payment);
		
		return payment;
	}
	
}
