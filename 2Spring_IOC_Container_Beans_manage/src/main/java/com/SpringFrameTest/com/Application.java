package com.SpringFrameTest.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);// you can comment it.
		
		new Key().runTightCouple(new Bike());
		//new Key().runTightCouple(new Car());//Error
		
		new Key().runLooseCouple(new Car());
		new Key().runLooseCouple(new Bike());
		
		// IOC container with Loose Couple 
				
		@SuppressWarnings("resource")
		ApplicationContext context =   new ClassPathXmlApplicationContext("beans.xml");//com/SpringFrameTest/com/beans.xml
		
		
		Engine key = (Engine) context.getBean("engine");
				
		// just change in xml file so object can change Car to Bike or whatever 
		
		new Key().runLooseCouple(key);
		//new Key().runLooseCouple(new Bike()); 
		
		Color color = (Color) context.getBean("engine");
		color.showColor();		
		
	}

}
