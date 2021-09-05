package com.greatlearning.oops.model;

public class AdminDepartmentClass extends SuperDepartmentClass{

	public String departmentName() {
		return "Admin Department";
	}

	public String getTodaysWork() {
		return "Complete your documents Submission";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

}
