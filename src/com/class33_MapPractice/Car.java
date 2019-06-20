package com.class33_MapPractice;

public class Car {
public String model;
public String make;

public Car(String make, String model) {
	this.make=make;
	this.model=model;
	
}
public void printCarDetail() {//inside static method we only have access to static vairable 
	System.out.println("Make is "+make+" and model "+model);
}
}
