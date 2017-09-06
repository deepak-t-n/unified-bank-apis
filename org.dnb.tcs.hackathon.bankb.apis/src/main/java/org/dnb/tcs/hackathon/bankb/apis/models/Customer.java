package org.dnb.tcs.hackathon.bankb.apis.models;

import java.util.Date;
import java.util.List;

public class Customer {
	
	private String customerName;
	private String personalId;
	private String idType;
	private Date dob;
	private String gender;
	private String nationality;
	private ContactDetails contactDetails;
	private List<AccountInfo> accs;
	
	public Customer(String customerName, String personalId){
		this.customerName = customerName;
		this.personalId = personalId;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPersonalId() {
		return personalId;
	}
	public void setPersonalId(String personalId) {
		this.personalId = personalId;
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

	public List<AccountInfo> getAccs() {
		return accs;
	}

	public void setAccs(List<AccountInfo> accs) {
		this.accs = accs;
	}

	@Override
	public String toString() {
		return String.format(
				"Customer [customerName=%s, personalId=%s, idType=%s, dob=%s, gender=%s, nationality=%s, contactDetails=%s, accs=%s]",
				customerName, personalId, idType, dob, gender, nationality, contactDetails, accs);
	}

	

}
