package com.class24_Overridding;

public class Bank {
public int chargeIneret() {// public class can be only once 
	return 0;
}
}
//child class
class BOA extends Bank{
	@Override //annotation
	public int chargeIneret() {
		return 2;
	}
}
// child class
class PNC extends Bank{
	@Override //Annotation
	public int chargeIneret() {
		return 3;
	}
}
