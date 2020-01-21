package com.app.pojos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "cdacBranch")
public class CdacBranch {
	private Integer branchId;
	private String branchName;
	private LocalDate courseStart, courseEnd;

	@OneToMany(mappedBy = "student",cascade = CascadeType.ALL,orphanRemoval = true)
	private List<Student> students=new ArrayList<Student>();
	
	public CdacBranch() {
		System.out.println("in def CdacBranch ctor");
	}

	public CdacBranch(Integer branchId, String branchName, LocalDate courseStart, LocalDate courseEnd) {
		super();
		this.branchId = branchId;
		this.branchName = branchName;
		this.courseStart = courseStart;
		this.courseEnd = courseEnd;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getBranchId() {
		return branchId;
	}

	public void setBranchId(Integer branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public LocalDate getCourseStart() {
		return courseStart;
	}

	public void setCourseStart(LocalDate courseStart) {
		this.courseStart = courseStart;
	}

	public LocalDate getCourseEnd() {
		return courseEnd;
	}

	public void setCourseEnd(LocalDate courseEnd) {
		this.courseEnd = courseEnd;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	

}
