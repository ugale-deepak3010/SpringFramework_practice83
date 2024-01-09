package com.SpringFrameTest.com;

public class Bike implements Engine, Color {

	MainEngine mainEngine;
	
	public Bike(MainEngine mainEngine) {	// this case we need to pass object & it's dependency
		// we will create & pass this object using XML not java
		this.mainEngine = mainEngine;
		System.out.println("Bike Constructor is called!");
	}

	String color;
	public void start() {
		if (mainEngine==null) {
			System.out.println("Main engine is not on !");
		}else {
			System.out.println("Bike Started!");
		}
		
	}

	@Override
	public String setColor(String color) {
		this.color = color;
		return null;
	}

	@Override
	public String showColor() {
		// TODO Auto-generated method stub
		System.out.println("Bike color is :" + this.color);
		return null;
	}
}
