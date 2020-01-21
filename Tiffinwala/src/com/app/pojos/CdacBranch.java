package com.app.pojos;

import java.time.LocalDate;

public class CdacBranch {
	private Integer branchId;
	private String branchName;
	private LocalDate courseStart, courseEnd;

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

}
