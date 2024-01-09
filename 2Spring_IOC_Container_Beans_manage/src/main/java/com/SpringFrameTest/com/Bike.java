package com.SpringFrameTest.com;

public class Bike implements Engine, Color {

	String color;
	public void start() {
		System.out.println("Bike Started!");
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
