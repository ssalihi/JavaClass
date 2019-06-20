package com.class26_SuperKeyWord;

public class SuperKeyWord {
String name="Sekander";
public void sayName() {
	System.out.println("My name is "+name);
}
}
class ChildOfSuperKeyord extends SuperKeyWord{
	String name="Neda";
	public void sayName () {
		System.out.println("My dad name is "+super.name);
		System.out.println("My daugther name is "+name);
	}
	public void callingMethods() {
		sayName();// compiler automatically added this.sayName();
		super.sayName();
	}
}
