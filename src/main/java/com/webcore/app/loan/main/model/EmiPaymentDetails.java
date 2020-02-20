package com.webcore.app.loan.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class EmiPaymentDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int emiPaymentId;
	private int loanNo;
	private double emiAmount;
	private String emiLastDate;
	private double emiPaidAmount;
	private double totalAmount;
	private String emiPaidDate;
	public int getEmiPaymentId() {
		return emiPaymentId;
	}
	public void setEmiPaymentId(int emiPaymentId) {
		this.emiPaymentId = emiPaymentId;
	}
	public int getLoanNo() {
		return loanNo;
	}
	public void setLoanNo(int loanNo) {
		this.loanNo = loanNo;
	}
	public Double getEmiAmount() {
		return emiAmount;
	}
	public void setEmiAmount(Double emiAmount) {
		this.emiAmount = emiAmount;
	}
	public String getEmiLastDate() {
		return emiLastDate;
	}
	public void setEmiLastDate(String emiLastDate) {
		this.emiLastDate = emiLastDate;
	}
	public Double getEmiPaidAmount() {
		return emiPaidAmount;
	}
	public void setEmiPaidAmount(Double emiPaidAmount) {
		this.emiPaidAmount = emiPaidAmount;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getEmiPaidDate() {
		return emiPaidDate;
	}
	public void setEmiPaidDate(String emiPaidDate) {
		this.emiPaidDate = emiPaidDate;
	}
	

}
