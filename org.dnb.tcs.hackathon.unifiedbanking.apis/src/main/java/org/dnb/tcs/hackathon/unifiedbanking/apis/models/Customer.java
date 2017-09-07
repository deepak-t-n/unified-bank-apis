package org.dnb.tcs.hackathon.unifiedbanking.apis.models;

import java.util.Date;
import java.util.List;

public class Customer {
	
	private String customerName;
	private String customerID;
	private String idType;
	private Date dob;
	private String gender;
	private String nationality;
	private ContactDetails contactDetails;
	private List<Account> accs;
	
	public Customer(String customerName, String customerID){
		this.customerName = customerName;
		this.customerID = customerID;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public ContactDetails getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(ContactDetails contactDetails) {
		this.contactDetails = contactDetails;
	}

	public List<Account> getAccs() {
		return accs;
	}

	public void setAccs(List<Account> accs) {
		this.accs = accs;
	}

	@Override
	public String toString() {
		return String.format(
				"Customer [customerName=%s, customerID=%s, idType=%s, dob=%s, gender=%s, nationality=%s, contactDetails=%s, accs=%s]",
				customerName, customerID, idType, dob, gender, nationality, contactDetails, accs);
	}

	

}
