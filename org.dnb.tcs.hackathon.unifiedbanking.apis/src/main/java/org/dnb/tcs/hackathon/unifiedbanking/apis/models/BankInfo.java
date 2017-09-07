package org.dnb.tcs.hackathon.unifiedbanking.apis.models;

public class BankInfo {
	
	private Integer bankID = 1;
	private String bankName = "DNB";
	
	
	public void setBankID(Integer bankID) {
		this.bankID = bankID;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	public Integer getBankID() {
		return bankID;
	}
	public String getBankName() {
		return bankName;
	}

}
