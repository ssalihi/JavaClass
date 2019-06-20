package com.class26_Overriding;

public class Phone {
public void makeCall() {
	System.out.println("phone Can make a phone call");
}
public void hasCamera() {
	System.out.println("Phone has camera");
}
}
class iPhone extends Phone{
	public void makeCall() {
		System.out.println("Can make a face time");
	}
	public void hasCamera() {
		System.out.println("Iphone has dual HD camera");
	}
}
class Nokia extends Phone{
	public void cannotBreak() {
		System.out.println("Nokia is unbreakable");
	}
}
class Samsung extends Phone{
	public void hasCamera() {
		System.out.println(" samsung has HD camera");
	}
	public void makeCall() {
		System.out.println(" samsung can do call");
	}
}
	
