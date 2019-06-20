package com.class26_SuperKeyWord;

public class SuperWithConstructor {
	public SuperWithConstructor(){
		System.out.println("I am a parent class constructor with no parameter");
	}
	SuperWithConstructor(String str) {
		System.out.println("I am a parent with one parameter");
	}
}
class childOfSuperWithConstructor extends SuperWithConstructor{
	public childOfSuperWithConstructor(){
		//super(); has been added by default by compiler 
		super("Hello");
		System.out.println("I am a child constructor");
	}
}