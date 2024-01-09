package com.Annotation_Based_configuration.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Company company = (Company) context.getBean("Company");
		
		company.showInfo();

		
		/*
		 * Company_2 company_2 = (Company_2) context.getBean("company_2");
		 * 
		 * company_2.hello();
		 */
		
	}

}
