package org.dnb.tcs.hackathon.unifiedbanking.apis.models;

import java.util.Date;

import org.dnb.tcs.hackathon.unifiedbanking.mediator.models.PaymentMediator;

public class Payment {

	private Long paymentIDNumber;
	private Date paymentDate;
	private Long debitAccountNumber;
	private Long creditAccountNumber;
	private String message;
	private Integer amount;
	private Long kidNumber;
	
	public Payment(PaymentMediator paymentMediator) {
		this.paymentIDNumber = paymentMediator.getPaymentId();
		this.debitAccountNumber = paymentMediator.getPayerAcc();
		this.creditAccountNumber = paymentMediator.getBeneficiaryAcc();
		this.amount = paymentMediator.getAmt();
		this.message = paymentMediator.getTxnMsg();
	}
	
	public Payment(){
		
	}
	
	public Long getPaymentIDNumber() {
		return paymentIDNumber;
	}

	public void setPaymentIDNumber(Long paymentIDNumber) {
		this.paymentIDNumber = paymentIDNumber;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Long getDebitAccountNumber() {
		return debitAccountNumber;
	}

	public void setDebitAccountNumber(Long debitAccountNumber) {
		this.debitAccountNumber = debitAccountNumber;
	}

	public Long getCreditAccountNumber() {
		return creditAccountNumber;
	}

	public void setCreditAccountNumber(Long creditAccountNumber) {
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

	public Long getKidNumber() {
		return kidNumber;
	}

	public void setKidNumber(Long kIDNumber) {
		kidNumber = kIDNumber;
	}

	@Override
	public String toString() {
		return "Payment [paymentIDNumber=" + paymentIDNumber + ", paymentDate="
				+ paymentDate + ", debitAccountNumber=" + debitAccountNumber
				+ ", creditAccountNumber=" + creditAccountNumber + ", message="
				+ message + ", amount=" + amount + ", kidNumber=" + kidNumber
				+ "]";
	}
	
	
}
