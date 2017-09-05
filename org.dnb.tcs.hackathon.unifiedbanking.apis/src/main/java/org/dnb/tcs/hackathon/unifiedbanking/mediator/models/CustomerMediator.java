package org.dnb.tcs.hackathon.unifiedbanking.mediator.models;

import java.util.Date;
import java.util.List;

public class CustomerMediator {
	
	private String customerName;
	private Integer personalId;
	private String idType;
	private Date dob;
	private String gender;
	private String nationality;
	private ContactDetailsMediator contactDetailsMediator;
	private List<AccountMediator> accs;
	
	public CustomerMediator(String customerName, Integer personalId){
		this.customerName = customerName;
		this.personalId = personalId;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Integer getPersonalId() {
		return personalId;
	}
	public void setPersonalId(Integer personalId) {
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

	public ContactDetailsMediator getContactDetails() {
		return contactDetailsMediator;
	}

	public void setContactDetails(ContactDetailsMediator contactDetailsMediator) {
		this.contactDetailsMediator = contactDetailsMediator;
	}

	public List<AccountMediator> getAccs() {
		return accs;
	}

	public void setAccs(List<AccountMediator> accs) {
		this.accs = accs;
	}

	@Override
	public String toString() {
		return String.format(
				"Customer [customerName=%s, personalId=%s, idType=%s, dob=%s, gender=%s, nationality=%s, contactDetails=%s, accs=%s]",
				customerName, personalId, idType, dob, gender, nationality, contactDetailsMediator, accs);
	}

	

}
