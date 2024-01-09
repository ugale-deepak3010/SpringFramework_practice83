package com.SpringBootTest83.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DeepMainClass {

	public static void main(String[] args) {

		System.out.println("Deepak!!");
		ApplicationContext context =  SpringApplication.run(DeepMainClass.class , args);
		
		String[] beanList = context.getBeanDefinitionNames();
		System.out.println(beanList.length);
		for (String beanName : beanList) {
			System.out.println(beanName);
		}
	}

}
