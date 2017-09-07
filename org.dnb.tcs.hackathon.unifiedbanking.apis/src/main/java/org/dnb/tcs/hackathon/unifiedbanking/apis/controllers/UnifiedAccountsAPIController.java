package org.dnb.tcs.hackathon.unifiedbanking.apis.controllers;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.dnb.tcs.hackathon.unifiedbanking.apis.models.CustomerAccs;
import org.dnb.tcs.hackathon.unifiedbanking.mediator.models.AccountMediator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

@RestController
public class UnifiedAccountsAPIController {
	
	private static final Logger logger = LogManager.getLogger(UnifiedAccountsAPIController.class);
	
	@RequestMapping(method = RequestMethod.GET, path="/ubp/bankID/getAllAccount/customer", produces = "application/json")
	public CustomerAccs getCustomerInfo(@RequestParam("customerID") String customerID){
		logger.info("Fetching Customer Information for customerID =" +customerID);
		String bankBendPoint = "http://localhost:8080/bankb/account/customerId/"+customerID;
		String dnbEndPoint = "https://dnbapistore.com/hackathon/accounts/1.0/account/customer/"+customerID;
		
		CustomerAccs customerAccs = null;
		
		try {
			Client clientBankB = Client.create();
			WebResource webResourceBankB = clientBankB.resource(bankBendPoint);
			logger.info("Calling the Bank B end point" + bankBendPoint);
			
			ClientResponse bankBResponse = webResourceBankB.accept("application/json").get(ClientResponse.class);
			
			if ((bankBResponse.getStatus() >= 203)){
				throw new RuntimeException(" bankBResponse Failed : HTTP error code : "
						+ bankBResponse.getStatus());
			}
			
			String bankBAccountStr  =bankBResponse.getEntity(String.class);	
			
			logger.info("Response from Bank B end point" + bankBAccountStr);
			AccountMediator[] accountMediator;
			accountMediator = new ObjectMapper().readValue(bankBAccountStr, AccountMediator[].class);
			
			customerAccs = new CustomerAccs(accountMediator);
			
			Client clientDnb = Client.create();
			WebResource dnbWebResource = clientDnb.resource(dnbEndPoint);
			
			logger.info("Calling the DnB end point" + dnbEndPoint);
			ClientResponse dnbResponse = dnbWebResource.accept("application/json").header("Authorization", Constants.accessKey).get(ClientResponse.class);
									
			if ((dnbResponse.getStatus() >= 203)){
				throw new RuntimeException("dnbResponse Failed : HTTP error code : "
						+ dnbResponse.getStatus());
			}
			
			String dnbAccountStr  =dnbResponse.getEntity(String.class);	
			
			logger.info("Response from DnB end point" + dnbAccountStr);
			
			CustomerAccs tempDnbCustAcc = new ObjectMapper().readValue(dnbAccountStr, CustomerAccs.class);
			
			customerAccs.getAccounts().addAll(tempDnbCustAcc.getAccounts());
			
		} catch (IOException e) {
			logger.error("Invalid Json", e);
		}
		
		logger.info("Returing Customer Information for " + customerAccs);
		
		return customerAccs;
	}
	
}
