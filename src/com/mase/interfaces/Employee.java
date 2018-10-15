/*
 * Chapter 9: Interfaces - S15
 * 15/10/2018
 * A class that implements two interfaces
*/
package com.mase.interfaces;

import java.text.NumberFormat;

public class Employee implements Printable, DepartmentConstants {
	private int department;
	private String firstName;
	private String lastName;
	private double salary;
	
	public Employee(int department, String lastName, String firstName, double salary) {
		this.department = department;
		this.lastName = lastName;
		this.firstName = firstName;
		this.salary = salary;
	}
	
	public void print() {
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		System.out.println("Name:\t" + firstName + " " + lastName);;
		System.out.println("Salary:\t" + currency.format(salary));
		
		String dept = "";
		if (department == ADMIN) {
			dept = "Administration";
		} else if (department == EDITORIAL) {
			dept = "Editorial";
		} else if (department == MARKETING) {
			dept = "Marketing";
		}
		
		System.out.println("Dept:\t" + dept);
	}
}
