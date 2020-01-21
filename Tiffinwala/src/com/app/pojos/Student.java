package com.app.pojos;

public class Student {

	private Integer ID,Age,CdacBranchId,AddressId;
	private String Name,Email,Gender,Password;
	
	public Student() {
		System.out.println("In default ctor");
	}
	
	public Student(Integer age, Integer cdacBranchId, Integer addressId, String name, String email, String gender) {
		super();
		Age = age;
		CdacBranchId = cdacBranchId;
		AddressId = addressId;
		Name = name;
		Email = email;
		Gender = gender;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public Integer getAge() {
		return Age;
	}

	public void setAge(Integer age) {
		Age = age;
	}

	public Integer getCdacBranchId() {
		return CdacBranchId;
	}

	public void setCdacBranchId(Integer cdacBranchId) {
		CdacBranchId = cdacBranchId;
	}

	public Integer getAddressId() {
		return AddressId;
	}

	public void setAddressId(Integer addressId) {
		AddressId = addressId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	
	
}
