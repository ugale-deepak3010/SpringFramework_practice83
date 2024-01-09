package com.Annotation_Based_configuration.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



//	we can do @Autowored same as @Value annotation
//	We can apply it on 
//	1.	Constructor
//	2.	Setter
//	3.	Property / Variable


@Component("company")
public class Company {
	
	@Value("${company.name}")
	String companyName;
	
	@Autowired
	@Qualifier("softwareEngineer")	// it's overriding @Primary also.
	Engineer engineer;
	
	public void showInfo() {
		System.out.println("Hello Details !! \tName: "+companyName);
	} 

}
