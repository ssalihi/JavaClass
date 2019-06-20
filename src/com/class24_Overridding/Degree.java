package com.class24_Overridding;

public class Degree {
public void getDegree() {
	System.out.println("I got degree");
}
}
class Undergraduate extends Degree {
	public void getDegree() {
		System.out.println("I am an undergraduate");
	}
}
class Postgraduate extends Degree {
	public void getDegree() {
		System.out.println("I am an postgraduate");
	}
}