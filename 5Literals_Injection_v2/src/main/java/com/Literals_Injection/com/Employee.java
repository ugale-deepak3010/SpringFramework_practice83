package com.Literals_Injection.com;

import org.springframework.beans.factory.annotation.Value;

public class Employee {

	private String empName;
	private int empId;
	private String empOtherSkills;
	@Value("${e.Xskills}")
	private String empXSkills;
	private String current_org;
		
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	@Value("${e.skills}")
	public void setEmpOtherSkills(String empOtherSkills) {
		this.empOtherSkills = empOtherSkills;
		System.err.println("\t\tsetter called by beans");
	}
	public void setEmpXSkills(String empXSkills) {
		this.empXSkills = empXSkills;
	}
	@Value("JLL")
	public void setCurrent_org(String current_org) {
		this.current_org = current_org;
	}
	
	public void showDetails() {
		System.out.println("Employee empName = "+empName);
		System.out.println("Employee empId = "+empId);
		System.out.println("Employee empOtherSkills = "+empOtherSkills);
		System.out.println("Employee current_org = "+current_org);
		System.out.println("Employee empXSkills = "+empXSkills);
	}
	


	
	
	
}
