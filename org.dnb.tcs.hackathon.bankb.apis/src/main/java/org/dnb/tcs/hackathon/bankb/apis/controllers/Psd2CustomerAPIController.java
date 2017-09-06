package org.dnb.tcs.hackathon.bankb.apis.controllers;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.dnb.tcs.hackathon.bankb.apis.Application;
import org.dnb.tcs.hackathon.bankb.apis.models.Customer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Psd2CustomerAPIController {
	
	private static final Logger logger = LogManager.getLogger(Psd2CustomerAPIController.class);
	
	@RequestMapping(method = RequestMethod.GET, path="/bankb/customer/id/{id}", produces = "application/json")
	public Customer getCustomerInfo(@PathVariable("id") String id){
		logger.info("Fetching Customer Information for " + id);
		
		Customer customer = Application.getCustomer(id);
		
		logger.info("Returing Customer Information for " + customer);
		
		return customer;
	}
	
}
