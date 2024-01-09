package com.SpringFrameTest.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);// you can comment it.
		
	
		// IOC container with Loose Couple 
		//-------------------	Dependency injections	----------
				// object must be pass while creating beans.		
		@SuppressWarnings("resource")
		ApplicationContext context =   new ClassPathXmlApplicationContext("beans.xml");		//com/SpringFrameTest/com/beans.xml
		
		
		Engine key = (Engine) context.getBean("engine");
				
				
		new Key().runLooseCouple(key);
		
		
		Color color = (Color) context.getBean("Vcolor");
		color.showColor();		
		
		
		Engine engine = (Engine) context.getBean("engine");
		engine.start();	// beans constructor will call only once not every time!	
		Engine engine3 = (Engine) context.getBean("engine");
		engine3.start();	// beans constructor will call only once not every time!	
		Engine engine4 = (Engine) context.getBean("engine");
		engine4.start();	// beans constructor will call only once not every time!	
		
		
		
	}

}
