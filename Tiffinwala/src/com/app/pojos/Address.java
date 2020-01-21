package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
@Entity
@Table(name = "address")
public class Address {
	private Integer addressId;
	private String societyName, area;

	@OneToMany(mappedBy = "student",cascade = CascadeType.ALL,orphanRemoval = true)
	private List<Student> students=new ArrayList<Student>();
	
	public Address() {
		System.out.println("in def Address ctor");
	}

	public Address(Integer addressId, String societyName, String area) {
		super();
		this.addressId = addressId;
		this.societyName = societyName;
		this.area = area;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

}
