package org.dnb.tcs.hackathon.unifiedbanking.mediator.models;

public class PaymentMediator {

	private Long paymentId;
	private Long beneficiaryAcc;
	private Long payerAcc;
	private String txnMsg;
	private Integer amt;
	private Long customerId;
	
	public Long getPaymentId() {
		return paymentId;
	}



	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}



	public Long getBeneficiaryAcc() {
		return beneficiaryAcc;
	}



	public void setBeneficiaryAcc(Long beneficiaryAcc) {
		this.beneficiaryAcc = beneficiaryAcc;
	}



	public Long getPayerAcc() {
		return payerAcc;
	}



	public void setPayerAcc(Long payerAcc) {
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



	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}



	@Override
	public String toString() {
		return String.format("Payment [paymentId=%s, beneficiaryAcc=%s, payerAcc=%s, txnMsg=%s, amt=%s, customerId=%s]",
				paymentId, beneficiaryAcc, payerAcc, txnMsg, amt, customerId);
	}
	
}
