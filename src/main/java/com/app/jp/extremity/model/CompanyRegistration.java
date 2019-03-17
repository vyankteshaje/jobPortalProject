package com.app.jp.extremity.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class CompanyRegistration {
	@Id
	private String companyRegistryId;
	private String companyRegistryName;
	private String companyRegistryNumber;
	private String companyRegistryWebsite;
	private String companyRegistryIndustryType;
	private String companyRegistryPanNo;
	private String companyRegistryEmailId;
	private String companyRegistryPassword;
	private String companyRegistryReEnterPassword;
	private String companyRegistryDate;
	
	@OneToOne
	private PaymentDetails PaymentDetails;
	@OneToOne
	private CompanyRegistryAddress companyRegistryAddress;
	@OneToOne
	private ContactPerson contactPerson; 
	@OneToOne
	private Membership membership;
	public String getCompanyRegistryId() {
		return companyRegistryId;
	}
	public void setCompanyRegistryId(String companyRegistryId) {
		this.companyRegistryId = companyRegistryId;
	}
	public String getCompanyRegistryName() {
		return companyRegistryName;
	}
	public void setCompanyRegistryName(String companyRegistryName) {
		this.companyRegistryName = companyRegistryName;
	}
	public String getCompanyRegistryNumber() {
		return companyRegistryNumber;
	}
	public void setCompanyRegistryNumber(String companyRegistryNumber) {
		this.companyRegistryNumber = companyRegistryNumber;
	}
	public String getCompanyRegistryWebsite() {
		return companyRegistryWebsite;
	}
	public void setCompanyRegistryWebsite(String companyRegistryWebsite) {
		this.companyRegistryWebsite = companyRegistryWebsite;
	}
	public String getCompanyRegistryIndustryType() {
		return companyRegistryIndustryType;
	}
	public void setCompanyRegistryIndustryType(String companyRegistryIndustryType) {
		this.companyRegistryIndustryType = companyRegistryIndustryType;
	}
	public String getCompanyRegistryPanNo() {
		return companyRegistryPanNo;
	}
	public void setCompanyRegistryPanNo(String companyRegistryPanNo) {
		this.companyRegistryPanNo = companyRegistryPanNo;
	}
	public String getCompanyRegistryEmailId() {
		return companyRegistryEmailId;
	}
	public void setCompanyRegistryEmailId(String companyRegistryEmailId) {
		this.companyRegistryEmailId = companyRegistryEmailId;
	}
	public String getCompanyRegistryPassword() {
		return companyRegistryPassword;
	}
	public void setCompanyRegistryPassword(String companyRegistryPassword) {
		this.companyRegistryPassword = companyRegistryPassword;
	}
	public String getCompanyRegistryReEnterPassword() {
		return companyRegistryReEnterPassword;
	}
	public void setCompanyRegistryReEnterPassword(String companyRegistryReEnterPassword) {
		this.companyRegistryReEnterPassword = companyRegistryReEnterPassword;
	}
	public String getCompanyRegistryDate() {
		return companyRegistryDate;
	}
	public void setCompanyRegistryDate(String companyRegistryDate) {
		this.companyRegistryDate = companyRegistryDate;
	}
	public PaymentDetails getPaymentDetails() {
		return PaymentDetails;
	}
	public void setPaymentDetails(PaymentDetails paymentDetails) {
		PaymentDetails = paymentDetails;
	}
	public CompanyRegistryAddress getCompanyRegistryAddress() {
		return companyRegistryAddress;
	}
	public void setCompanyRegistryAddress(CompanyRegistryAddress companyRegistryAddress) {
		this.companyRegistryAddress = companyRegistryAddress;
	}
	public ContactPerson getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(ContactPerson contactPerson) {
		this.contactPerson = contactPerson;
	}
	public Membership getMembership() {
		return membership;
	}
	public void setMembership(Membership membership) {
		this.membership = membership;
	}
	

}