package org.dnb.tcs.hackathon.unifiedbanking.apis.controllers;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.dnb.tcs.hackathon.unifiedbanking.apis.models.Customer;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UnifiedCustomerAPIController {
	
	private static final Logger logger = LogManager.getLogger(UnifiedCustomerAPIController.class);
	
	@RequestMapping(method = RequestMethod.GET, path="/ubp/bankID/{bankID}/customer/id/{id}", produces = "application/json")
	public Customer getCustomerInfo(@PathVariable("bankID") Integer bankID,@PathVariable("id") Integer id){
		logger.info("Fetching Customer Information for bankID =" + bankID + " & id= " +id);
		
		Customer customer = new Customer("TEst", 123);
		
		logger.info("Returing Customer Information for " + customer);
		
		return customer;
	}
	
}
