package com.Annotation_Based_configuration.com;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration	// this annotation is acts like beans.xml file.
@ComponentScan(basePackages = "com.Annotation_Based_configuration.com")	// Time consuming process!
public class MyConfigClass {
	
//	@Bean
//	SoftwareEngineer softwareEngineer() {
//		return new SoftwareEngineer();
//	}
//
//    @Bean
//    Company company() {
//    	Company company= new Company();
//    	company.setSoftwareEngineer(softwareEngineer());
//		return company;
//	}

}
