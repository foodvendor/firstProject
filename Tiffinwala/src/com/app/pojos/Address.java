package com.app.pojos;


public class Address {
	private Integer addressId;
	private String societyName, area;

	public Address() {
		System.out.println("in def Address ctor");
	}

	public Address(Integer addressId, String societyName, String area) {
		super();
		this.addressId = addressId;
		this.societyName = societyName;
		this.area = area;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getSocietyName() {
		return societyName;
	}

	public void setSocietyName(String societyName) {
		this.societyName = societyName;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

}
