package com.SpringFrameTest.com;

public class MainEngine {

	public MainEngine(Licence licence) {
		if (licence==null) {
			System.out.println("You don't have Licence! starting main engine!");
		}else {
			System.out.println("Main Engine is started! you have License");
		}
		
	}
}
