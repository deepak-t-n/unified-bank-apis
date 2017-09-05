package org.dnb.tcs.hackathon.bankb.apis.models;

public class Payment {

	private Integer paymentId;
	private Integer beneficiaryAcc;
	private Integer payerAcc;
	private String txnMsg;
	private Integer amt;
	private Integer customerId;
	
	public Integer getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}
	public Integer getBeneficiaryAcc() {
		return beneficiaryAcc;
	}
	public void setBeneficiaryAcc(Integer beneficiaryAcc) {
		this.beneficiaryAcc = beneficiaryAcc;
	}
	public Integer getPayerAcc() {
		return payerAcc;
	}
	public void setPayerAcc(Integer payerAcc) {
		this.payerAcc = payerAcc;
	}
	public String getTxnMsg() {
		return txnMsg;
	}
	public void setTxnMsg(String txnMsg) {
		this.txnMsg = txnMsg;
	}
	public Integer getAmt() {
		return amt;
	}
	public void setAmt(Integer amt) {
		this.amt = amt;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	
	@Override
	public String toString() {
		return String.format("Payment [paymentId=%s, beneficiaryAcc=%s, payerAcc=%s, txnMsg=%s, amt=%s, customerId=%s]",
				paymentId, beneficiaryAcc, payerAcc, txnMsg, amt, customerId);
	}
	
}
