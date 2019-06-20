package com.class26_Overriding;

public class ClassA {
public final void phone() {
	System.out.println("This is Iphone");
}
public final void phone (String A) {
	System.out.println("My phone has best camera");
}
}

class B extends ClassA{
	//public final void phone1() {
		//System.out.println("This is good phone");
	//}
}
