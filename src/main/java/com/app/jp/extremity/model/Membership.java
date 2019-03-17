
/*
 Author:Prachi
 Role:Admin
*/




package com.app.jp.extremity.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Membership {
@Id
    private String membershipId;
    private String membershipType;
    private String membershipPrice;
    private String membershipValidity;
	public String getMembershipId() {
		return membershipId;
	}
	public void setMembershipId(String membershipId) {
		this.membershipId = membershipId;
	}
	public String getMembershipType() {
		return membershipType;
	}
	public void setMembershipType(String membershipType) {
		this.membershipType = membershipType;
	}
	public String getMembershipPrice() {
		return membershipPrice;
	}
	public void setMembershipPrice(String membershipPrice) {
		this.membershipPrice = membershipPrice;
	}
	public String getMembershipValidity() {
		return membershipValidity;
	}
	public void setMembershipValidity(String membershipValidity) {
		this.membershipValidity = membershipValidity;
	}
    
    

}

