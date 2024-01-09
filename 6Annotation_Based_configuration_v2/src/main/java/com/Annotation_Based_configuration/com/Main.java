package com.Annotation_Based_configuration.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
		
		@SuppressWarnings("resource")
//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfigClass.class);
		
		Company company = (Company) context.getBean("company");
		
		System.err.println("---- beans created! ------");
		
		company.showInfo();
		
		company.softwareEngineer.development();
	}

}
