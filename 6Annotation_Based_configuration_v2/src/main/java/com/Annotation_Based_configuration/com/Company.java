package com.Annotation_Based_configuration.com;

import org.springframework.stereotype.Component;

@Component("company")
public class Company {
	
	SoftwareEngineer softwareEngineer;
	
	public void setSoftwareEngineer(SoftwareEngineer softwareEngineer) {
		System.out.println("I'm Engineer Setter!!");
		this.softwareEngineer = softwareEngineer;
	}

	public void showInfo() {
		System.out.println("Hello Details !!");
	} 

}
