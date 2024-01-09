package com.Annotation_Based_configuration.com;

import org.springframework.stereotype.Component;

@Component
public class SoftwareEngineer implements Engineer {

	public void development() {
		System.out.println("Software Developement");
	}
}
