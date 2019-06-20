package com.class29_Interface;

public interface TakesScreenShot {
	String fileExtension="png";//by default this public static final (it is mean this variable is constant and unchangeable) variable, and it has to be defined
	//it is mean we have to initialized the variable. 
 void takesScreenShot();
 //from java 8 we can have defined methods
 static void m1() {
	 System.out.println("Static m1 method");
 }
 default void m2() {
	 System.out.println("Default m2 method");
 }
}
