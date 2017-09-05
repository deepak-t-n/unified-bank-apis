package org.dnb.tcs.hackathon.bankb.apis.controllers;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.dnb.tcs.hackathon.bankb.apis.Application;
import org.dnb.tcs.hackathon.bankb.apis.models.AccountInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Psd2AccountAPIController {
	
	private static final Logger logger = LogManager.getLogger(Psd2AccountAPIController.class);
	
	@RequestMapping(method = RequestMethod.GET, path="/bankb/account/customerId/{customerId}", produces = "application/json")
	public List<AccountInfo> getAccountInfo(@PathVariable("customerId") Integer customerId){
		logger.info("Fetching AccountInfo Information for " + customerId);
		
		List<AccountInfo> accs = Application.getAccountInfo(customerId);
		
		logger.info("Returing Account Information for " + accs);
		
		return accs;
	}
	
}
