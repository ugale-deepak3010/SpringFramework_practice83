package com.Annotation_Based_configuration.com;

import org.springframework.stereotype.Component;

@Component("Company")
public class Company {
	
	public void showInfo() {
		System.out.println("Hello Details !!");
	} 

}
