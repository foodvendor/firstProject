package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {

	private Integer iD, age, cdacBranchId;
	private String name, email, gender, password;

	@ManyToOne()
	@JoinColumn(name = "cdac_branch_id")
	private CdacBranch cdacBranch;
	
	@ManyToOne()
	@JoinColumn(name = "address_id")
	private Integer addressId;
	public Student() {
		System.out.println("In default ctor");
	}

	public Student(Integer iD, Integer age, Integer cdacBranchId, Integer addressId, String name, String email,
			String gender, String password) {
		super();
		this.iD = iD;
		this.age = age;
		this.cdacBranchId = cdacBranchId;
		this.addressId = addressId;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.password = password;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getiD() {
		return iD;
	}

	public void setiD(Integer iD) {
		this.iD = iD;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getCdacBranchId() {
		return cdacBranchId;
	}

	public void setCdacBranchId(Integer cdacBranchId) {
		this.cdacBranchId = cdacBranchId;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student [iD=" + iD + ", age=" + age + ", cdacBranchId=" + cdacBranchId + ", addressId=" + addressId
				+ ", name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}

}
