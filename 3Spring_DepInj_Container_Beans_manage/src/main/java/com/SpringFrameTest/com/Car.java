package com.SpringFrameTest.com;

public class Car implements Engine, Color {
	String color;
	
	public void start() {
		System.out.println("Car Started!");
	}

	@Override
	public String setColor(String color) {
		this.color = color;
		return null;
	}

	@Override
	public String showColor() {
		System.out.println("Car color is :" + this.color);
		return null;
	}
}
