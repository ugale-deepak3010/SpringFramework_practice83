package com.Literals_Injection.com;

public class Employee {

	private String empName;
	private int empId;
	private String empOtherSkills;
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setEmpOtherSkills(String empOtherSkills) {
		this.empOtherSkills = empOtherSkills;
	}
	
	public void showDetails() {
		System.out.println("Employee empName = "+empName);
		System.out.println("Employee empId = "+empId);
		System.out.println("Employee empOtherSkills = "+empOtherSkills);
	}
	
	
}
