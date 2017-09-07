package org.dnb.tcs.hackathon.bankb.apis.models;

public class AccountInfo {
	
	private String customerId;
	private String accountNumber;
	private Integer balanceAmt;
	private BankInfo bankInfo;
	
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
	public BankInfo getBankInfo() {
		return bankInfo;
	}
	public void setBankInfo(BankInfo bankInfo) {
		this.bankInfo = bankInfo;
	}
	
	@Override
	public String toString() {
		return "AccountInfo [customerId=" + customerId + ", accountNumber=" + accountNumber + ", balanceAmt="
				+ balanceAmt + ", bankInfo=" + bankInfo + "]";
	}
	
}
