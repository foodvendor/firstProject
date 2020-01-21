package com.app.pojos;

import java.time.LocalDate;

public class Order {
	private Integer orderId, studentId, branchId, addressId, menuId;
	private LocalDate date;

	public Order() {
		System.out.println("in def Order ctor");
	}

	public Order(Integer orderId, Integer studentId, Integer branchId, Integer addressId, Integer menuId,
			LocalDate date) {
		super();
		this.orderId = orderId;
		this.studentId = studentId;
		this.branchId = branchId;
		this.addressId = addressId;
		this.menuId = menuId;
		this.date = date;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public Integer getBranchId() {
		return branchId;
	}

	public void setBranchId(Integer branchId) {
		this.branchId = branchId;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public Integer getMenuId() {
		return menuId;
	}

	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

}
