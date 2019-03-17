package com.app.jp.extremity.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ContactPerson {
	@Id

	private String companyRegistryId;
	private String contactPersonId;
	private String contactPersonName;
	private String contactPersonDesignation;
	private String contactPersonEmailId;
	private String contactPersonMobileNo;
	public String getCompanyRegistryId() {
		return companyRegistryId;
	}
	public void setCompanyRegistryId(String companyRegistryId) {
		this.companyRegistryId = companyRegistryId;
	}
	public String getContactPersonId() {
		return contactPersonId;
	}
	public void setContactPersonId(String contactPersonId) {
		this.contactPersonId = contactPersonId;
	}
	public String getContactPersonName() {
		return contactPersonName;
	}
	public void setContactPersonName(String contactPersonName) {
		this.contactPersonName = contactPersonName;
	}
	public String getContactPersonDesignation() {
		return contactPersonDesignation;
	}
	public void setContactPersonDesignation(String contactPersonDesignation) {
		this.contactPersonDesignation = contactPersonDesignation;
	}
	public String getContactPersonEmailId() {
		return contactPersonEmailId;
	}
	public void setContactPersonEmailId(String contactPersonEmailId) {
		this.contactPersonEmailId = contactPersonEmailId;
	}
	public String getContactPersonMobileNo() {
		return contactPersonMobileNo;
	}
	public void setContactPersonMobileNo(String contactPersonMobileNo) {
		this.contactPersonMobileNo = contactPersonMobileNo;
	}
	
}
