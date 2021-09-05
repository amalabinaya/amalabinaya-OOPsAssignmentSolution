package com.greatlearning.oops.main;

import com.greatlearning.oops.model.*;

public class DriverClass {
	
	public static void main(String[] args) {
		
		AdminDepartmentClass adminObject = new AdminDepartmentClass();
		HrDepartmentClass hrObject = new HrDepartmentClass();
		TechDepartmentClass techObject = new TechDepartmentClass();

		System.out.println("Welcome to "+ adminObject.departmentName());
		System.out.println(adminObject.getTodaysWork());
		System.out.println(adminObject.getWorkDeadline());
		System.out.println(adminObject.isTodayAHoliday());

		System.out.println("\nWelcome to "+hrObject.departmentName());
		System.out.println(hrObject.doActivity());
		System.out.println(hrObject.getTodaysWork());
		System.out.println(hrObject.getWorkDeadline());
		System.out.println(hrObject.isTodayAHoliday());

		System.out.println("\nWelcome to "+techObject.departmentName());
		System.out.println(techObject.getTodaysWork());
		System.out.println(techObject.getWorkDeadline());
		System.out.println(techObject.getTechStackInformation());
		System.out.println(techObject.isTodayAHoliday());

	}

}
