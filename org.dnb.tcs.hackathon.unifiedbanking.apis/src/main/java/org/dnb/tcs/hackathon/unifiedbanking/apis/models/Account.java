package org.dnb.tcs.hackathon.unifiedbanking.apis.models;

public class Account {
	
	private String accountNumber;
	private Integer availableBalance;
	private String accountType;
	private BankInfo bankInfo = new BankInfo();
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Integer getAvailableBalance() {
		return availableBalance;
	}
	public void setAvailableBalance(Integer availableBalance) {
		this.availableBalance = availableBalance;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	
	public BankInfo getBankInfo() {
		return bankInfo;
	}
	public void setBankInfo(BankInfo bankInfo) {
		this.bankInfo = bankInfo;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", availableBalance=" + availableBalance + ", accountType="
				+ accountType + "]";
	}
	
}
