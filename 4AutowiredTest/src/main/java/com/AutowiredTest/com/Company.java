package com.AutowiredTest.com;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Company {

	Dept dept;
	
	
//	public Company() {
//		System.out.println("Company constructor!");
//	}
	
	
	//@Autowired // Qualifier for @Autowired not is optional
	public Company( @Qualifier("dept2")  Dept dept) {
		this.dept = dept;
		System.out.println("constructor ");
	}

	
	public void setDept(HRDept dept) {
			this.dept = dept;
			System.out.println("com dept setter");
		}

	public Dept getDept() {
		return dept;
	}

	

	public void work() {
		if (dept==null) {
			System.out.println("No client, No Work!");
		} else {
			dept.work();
		}
	}
}
