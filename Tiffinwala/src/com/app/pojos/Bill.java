package com.app.pojos;

import java.time.LocalDate;

public class Bill {
	private Integer billId, studentId;
	private Double billAmount, dueAmount;
	private LocalDate billDate;
	private Boolean paymentStatus;

	public Bill() {
		System.out.println("in def Bill Ctor");
	}

	public Bill(Integer billId, Integer studentId, Double billAmount, Double dueAmount, LocalDate billDate,
			Boolean paymentStatus) {
		super();
		this.billId = billId;
		this.studentId = studentId;
		this.billAmount = billAmount;
		this.dueAmount = dueAmount;
		this.billDate = billDate;
		this.paymentStatus = paymentStatus;
	}

	public Integer getBillId() {
		return billId;
	}

	public void setBillId(Integer billId) {
		this.billId = billId;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public Double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(Double billAmount) {
		this.billAmount = billAmount;
	}

	public Double getDueAmount() {
		return dueAmount;
	}

	public void setDueAmount(Double dueAmount) {
		this.dueAmount = dueAmount;
	}

	public LocalDate getBillDate() {
		return billDate;
	}

	public void setBillDate(LocalDate billDate) {
		this.billDate = billDate;
	}

	public Boolean getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(Boolean paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

}
