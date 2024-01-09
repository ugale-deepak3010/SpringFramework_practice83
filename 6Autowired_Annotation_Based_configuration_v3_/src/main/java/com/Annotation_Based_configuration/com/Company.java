package com.Annotation_Based_configuration.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



//	we can do @Autowored same as @Value annotation
//	We can apply it on 
//	1.	Constructor
//	2.	Setter
//	3.	Property / Variable


@Component("company")
public class Company {
	
	@Autowired
	SoftwareEngineer softwareEngineer;
	
	
	public void setSoftwareEngineer(SoftwareEngineer softwareEngineer) {
		this.softwareEngineer = softwareEngineer;
		System.out.println("I am setter");
	}


	public Company(SoftwareEngineer softwareEngineer) {
		this.softwareEngineer = softwareEngineer;
		System.out.println("Constructor is called!");
	}


	public void showInfo() {
		System.out.println("Hello Details !!");
	} 

}
