package org.dnb.tcs.hackathon.bankb.apis.models;

public class Payment {

	private Long paymentId;
	private Long beneficiaryAcc;
	private Long payerAcc;
	private String txnMsg;
	private Integer amt;
	private Long customerId;
	
	public Long getPaymentId() {
		return paymentId;
	}


	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}


	public Long getBeneficiaryAcc() {
		return beneficiaryAcc;
	}


	public void setBeneficiaryAcc(long beneficiaryAcc) {
		this.beneficiaryAcc = beneficiaryAcc;
	}


	public Long getPayerAcc() {
		return payerAcc;
	}


	public void setPayerAcc(long payerAcc) {
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


	public Long getCustomerId() {
		return customerId;
	}


	public void setCustomerId(long i) {
		this.customerId = i;
	}


	@Override
	public String toString() {
		return String.format("Payment [paymentId=%s, beneficiaryAcc=%s, payerAcc=%s, txnMsg=%s, amt=%s, customerId=%s]",
				paymentId, beneficiaryAcc, payerAcc, txnMsg, amt, customerId);
	}
	
}
