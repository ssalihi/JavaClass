package com.class24_Overridding;

public class Parent {
public void love () {
	System.out.println("I love my parents");
}
public void work() {
	System.out.println("Parents work");
}
}
class Child extends Parent {
	public void love() {
		System.out.println("Child loves parent");
	}
	public void cry() {
		System.out.println("Child crys");
	}
}
class grandChild extends Parent{
	public void love(){
		System.out.println("Parents love their grand children");
	}
}
