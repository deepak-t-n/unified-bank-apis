package org.dnb.tcs.hackathon.bankb.apis;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dnb.tcs.hackathon.bankb.apis.models.AccountInfo;
import org.dnb.tcs.hackathon.bankb.apis.models.ContactDetails;
import org.dnb.tcs.hackathon.bankb.apis.models.Customer;
import org.dnb.tcs.hackathon.bankb.apis.models.Payment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static Map<Integer, Customer> bankBCustomers = new HashMap<Integer, Customer>();
	public static Map<Integer,Payment> payments = new HashMap<Integer,Payment>();

	public static void main(String[] args) throws Exception {

		loadCustomers();
		loadPayments();
		
		SpringApplication.run(Application.class, args);
	}

	public static Customer getCustomer(Integer personalId) {

		return bankBCustomers.get(personalId);
	}
	
	public static List<AccountInfo> getAccountInfo(Integer customerId){
		
		return getCustomer(customerId).getAccs();
	}
	
	public static Payment getPayment(Integer paymentId){
		return payments.get(paymentId);
	}
	
	private static void loadPayments(){
		for (int i = 0; i < 3; i++) {
			Payment payment = new Payment();
			
			payment.setCustomerId(i);
			payment.setAmt(100+i);
			payment.setBeneficiaryAcc(20000000+i);
			payment.setPayerAcc(100000000+i);
			payment.setPaymentId(1000+i);
			payment.setTxnMsg("Payment " +i);

			payments.put(payment.getPaymentId(), payment);
		}
	}
	
	private static void loadCustomers() {
		for (int i = 0; i < 3; i++) {
			Customer customer = new Customer(i + "- Customer", i);
			ContactDetails contactDetails = new ContactDetails();
			AccountInfo accountInfo = new AccountInfo();
			List<AccountInfo> accs = new ArrayList<AccountInfo>();
			
			customer.setIdType("NorwegianID");
			customer.setDob((new GregorianCalendar(1980 + i, i, 15+i)).getTime());
			customer.setGender("Male");
			customer.setNationality("Norwegian");
			
			contactDetails.setAddressLine1("Address Line - " +i);
			contactDetails.setCity("Oslo");
			contactDetails.setEmail("email-"+i+"@test.com");
			contactDetails.setPostalCode("019"+i);
			contactDetails.setPhone(90000000+i);
			
			accountInfo.setCustomerId(i);
			accountInfo.setAccountNumber(100000000+i);
			accs.add(accountInfo);
			
			customer.setAccs(accs);
			customer.setContactDetails(contactDetails);
			
			bankBCustomers.put(i, customer);
		}
	}
}
