package org.dnb.tcs.hackathon.unifiedbanking.apis.models;

import java.util.ArrayList;
import java.util.List;

import org.dnb.tcs.hackathon.unifiedbanking.mediator.models.AccountMediator;

public class CustomerAccs {
	
	private String customerID;
	private List<Account> accounts;
	
	public CustomerAccs(AccountMediator[] accountMediator) {
		accounts = new ArrayList<Account>();
		for (int i = 0; i < accountMediator.length; i++) {
			customerID = accountMediator[i].getCustomerId();
						
			Account account = new Account();
			account.setAccountNumber(accountMediator[i].getAccountNumber());
			account.setAvailableBalance(accountMediator[i].getBalanceAmt());
			account.setBankInfo(accountMediator[i].getBankInfo());
			
			accounts.add(account);
		}
		
	}
	
	public CustomerAccs() {}
	
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public List<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	@Override
	public String toString() {
		return "CustomerAccs [customerID=" + customerID + ", accounts=" + accounts + "]";
	}

}
