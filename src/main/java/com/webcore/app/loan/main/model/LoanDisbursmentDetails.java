 package com.webcore.app.loan.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoanDisbursmentDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int loanDisbursmentID;
	private int loanMasterDetailsId;
	private int loanNo;
	private double loanAmount;
	private int tenure;
	private double emi;
	private int statusCode;
	public int getLoanDisbursmentID() {
		return loanDisbursmentID;
	}
	public void setLoanDisbursmentID(int loanDisbursmentID) {
		this.loanDisbursmentID = loanDisbursmentID;
	}
	public int getLoanMasterDetailsId() {
		return loanMasterDetailsId;
	}
	public void setLoanMasterDetailsId(int loanMasterDetailsId) {
		this.loanMasterDetailsId = loanMasterDetailsId;
	}
	public int getLoanNo() {
		return loanNo;
	}
	public void setLoanNo(int loanNo) {
		this.loanNo = loanNo;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public double getEmi() {
		return emi;
	}
	public void setEmi(double emi) {
		this.emi = emi;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	
	

}
