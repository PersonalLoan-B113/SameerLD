package com.crts.app.finace.loandisbursment.model;


public class EmiDetails
{
	private int emiPaymentId;
	private int loanNO;
	private double emiAmount;
	private String lastDate;
	private double emiPaidAmount;
	private double totalAmount;
	
	
	public int getEmiPaymentId() {
		return emiPaymentId;
	}
	public void setEmiPaymentId(int emiPaymentId) {
		this.emiPaymentId = emiPaymentId;
	}
	public int getLoanNO() {
		return loanNO;
	}
	public void setLoanNO(int loanNO) {
		this.loanNO = loanNO;
	}
	public double getEmiAmount() {
		return emiAmount;
	}
	public void setEmiAmount(double emiAmount) {
		this.emiAmount = emiAmount;
	}
	public String getLastDate() {
		return lastDate;
	}
	public void setLastDate(String lastDate) {
		this.lastDate = lastDate;
	}
	public double getEmiPaidAmount() {
		return emiPaidAmount;
	}
	public void setEmiPaidAmount(double emiPaidAmount) {
		this.emiPaidAmount = emiPaidAmount;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
	

}
