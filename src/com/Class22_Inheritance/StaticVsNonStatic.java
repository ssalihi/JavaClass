package com.Class22_Inheritance;

public class StaticVsNonStatic {
     public String name="John";// we can have access to our entire project// this instance variable 
     public static String lastName="Snow";// Static variable 
     public static String job="QA Engineer";
     
	public static void main(String[] args) {
		StaticVsNonStatic obj=new StaticVsNonStatic();
		obj.getInfo();
		getIfo1();// within same class we can call it by using method/variable name
		System.out.println(lastName);
	}
	//non-Static method can have an access both to instance and static variables
	public void getInfo () {
		System.out.println("My name is "+name+" and my last name is "+lastName+".");
	}
	//Static method can have an access only to static variable
	public static void getIfo1() {
		//System.out.println("My name is "+name+" and my last name is "+lastName+".");
		// will get an error because name is instance variable
		System.out.println("I am static method");
	}

}
