package com.Annotation_Based_configuration.com;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class HardwareEngineer implements Engineer {

	public void development() {
		System.out.println("Hardware Developement");
	}
}
