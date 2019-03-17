package com.app.jp.extremity.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CompanyRegistryAddress {
@Id
	private String companyRegistryAddressId;
	private String companyRegistryAddressStreet;
	private String companyRegistryAddressCity;
	private String companyRegistryAddressState;
	private String companyRegistryAddressCountry;
	private String companyRegistryAddressZipcode;
	public String getCompanyRegistryAddressId() {
		return companyRegistryAddressId;
	}
	public void setCompanyRegistryAddressId(String companyRegistryAddressId) {
		this.companyRegistryAddressId = companyRegistryAddressId;
	}
	public String getCompanyRegistryAddressStreet() {
		return companyRegistryAddressStreet;
	}
	public void setCompanyRegistryAddressStreet(String companyRegistryAddressStreet) {
		this.companyRegistryAddressStreet = companyRegistryAddressStreet;
	}
	public String getCompanyRegistryAddressCity() {
		return companyRegistryAddressCity;
	}
	public void setCompanyRegistryAddressCity(String companyRegistryAddressCity) {
		this.companyRegistryAddressCity = companyRegistryAddressCity;
	}
	public String getCompanyRegistryAddressState() {
		return companyRegistryAddressState;
	}
	public void setCompanyRegistryAddressState(String companyRegistryAddressState) {
		this.companyRegistryAddressState = companyRegistryAddressState;
	}
	public String getCompanyRegistryAddressCountry() {
		return companyRegistryAddressCountry;
	}
	public void setCompanyRegistryAddressCountry(String companyRegistryAddressCountry) {
		this.companyRegistryAddressCountry = companyRegistryAddressCountry;
	}
	public String getCompanyRegistryAddressZipcode() {
		return companyRegistryAddressZipcode;
	}
	public void setCompanyRegistryAddressZipcode(String companyRegistryAddressZipcode) {
		this.companyRegistryAddressZipcode = companyRegistryAddressZipcode;
	}
}
