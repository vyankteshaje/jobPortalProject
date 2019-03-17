package com.app.jp.extremity.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PaymentDetails {
@Id
	private String paymentId;
	private String paymentSubscriptionType;
	private String paymentSubscriptionDate;
	private String paymentValidTill;
	private String paymentTransactionId;
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public String getPaymentSubscriptionType() {
		return paymentSubscriptionType;
	}
	public void setPaymentSubscriptionType(String paymentSubscriptionType) {
		this.paymentSubscriptionType = paymentSubscriptionType;
	}
	public String getPaymentSubscriptionDate() {
		return paymentSubscriptionDate;
	}
	public void setPaymentSubscriptionDate(String paymentSubscriptionDate) {
		this.paymentSubscriptionDate = paymentSubscriptionDate;
	}
	public String getPaymentValidTill() {
		return paymentValidTill;
	}
	public void setPaymentValidTill(String paymentValidTill) {
		this.paymentValidTill = paymentValidTill;
	}
	public String getPaymentTransactionId() {
		return paymentTransactionId;
	}
	public void setPaymentTransactionId(String paymentTransactionId) {
		this.paymentTransactionId = paymentTransactionId;
	}
	
}
