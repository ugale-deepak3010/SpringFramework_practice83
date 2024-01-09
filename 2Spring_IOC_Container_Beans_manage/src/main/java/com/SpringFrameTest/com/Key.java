package com.SpringFrameTest.com;

public class Key {
	
	public void runTightCouple(Bike bike) {
		new Bike().start();
	}
	
	public void runLooseCouple(Engine key) {
		key.start();
	}
}
