package com.systex.hr.service;

import com.systex.hr.model.Employee;

public class StaffService {
	public void generateReport(Employee[] staff) {
		for (Employee employee : staff) { //Polymorphism
			System.out.println(employee.getInfo()); //VMI
		}
	}
	
	public int calcAllSalary(Employee[] staff) {
		int allSarary = 0;
		for (Employee employee : staff) { //Polymorphism
			allSarary += employee.getSalary(); //VMI
		}
		
		return allSarary;
	}
}
