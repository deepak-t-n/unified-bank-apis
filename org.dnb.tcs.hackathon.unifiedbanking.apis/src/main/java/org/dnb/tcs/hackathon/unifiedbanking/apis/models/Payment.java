package org.dnb.tcs.hackathon.unifiedbanking.apis.models;

import java.util.Date;

import org.dnb.tcs.hackathon.unifiedbanking.mediator.models.PaymentMediator;

public class Payment {

	private Integer paymentIDNumber;
	private Date paymentDate;
	private Integer debitAccountNumber;
	private Integer creditAccountNumber;
	private String message;
	private Integer amount;
	private Integer KIDNumber;
	
	public Payment(PaymentMediator paymentMediator) {
		this.paymentIDNumber = paymentMediator.getPaymentId();
		this.debitAccountNumber = paymentMediator.getPayerAcc();
		this.creditAccountNumber = paymentMediator.getBeneficiaryAcc();
		this.amount = paymentMediator.getAmt();
		this.message = paymentMediator.getTxnMsg();
	}
	
	public Integer getPaymentIDNumber() {
		return paymentIDNumber;
	}
	public void setPaymentIDNumber(Integer paymentIDNumber) {
		this.paymentIDNumber = paymentIDNumber;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public Integer getDebitAccountNumber() {
		return debitAccountNumber;
	}
	public void setDebitAccountNumber(Integer debitAccountNumber) {
		this.debitAccountNumber = debitAccountNumber;
	}
	public Integer getCreditAccountNumber() {
		return creditAccountNumber;
	}
	public void setCreditAccountNumber(Integer creditAccountNumber) {
		this.creditAccountNumber = creditAccountNumber;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Integer getKIDNumber() {
		return KIDNumber;
	}
	public void setKIDNumber(Integer kIDNumber) {
		KIDNumber = kIDNumber;
	}
	
	@Override
	public String toString() {
		return "Payment [paymentIDNumber=" + paymentIDNumber + ", paymentDate="
				+ paymentDate + ", debitAccountNumber=" + debitAccountNumber
				+ ", creditAccountNumber=" + creditAccountNumber + ", message="
				+ message + ", amount=" + amount + ", KIDNumber=" + KIDNumber
				+ "]";
	}
	
	
}
