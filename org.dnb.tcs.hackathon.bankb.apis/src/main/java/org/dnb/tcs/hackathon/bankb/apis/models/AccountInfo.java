package org.dnb.tcs.hackathon.bankb.apis.models;

public class AccountInfo {
	
	private String customerId;
	private String accountNumber;
	private Integer balanceAmt;
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Integer getBalanceAmt() {
		return balanceAmt;
	}
	public void setBalanceAmt(Integer balanceAmt) {
		this.balanceAmt = balanceAmt;
	}
	
}
