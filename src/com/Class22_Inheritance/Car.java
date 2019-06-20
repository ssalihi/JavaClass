package com.Class22_Inheritance;

public class Car {
public static String make="Toyota";
String color, model;// only declare the instance variable 
int doors;
boolean engine;

Car() {// this is our constructor and hold the same name as our class name.
	System.out.println("I am a contructor");
	System.out.println("Hello from constructor");
}


public static void main(String[] args) {
	Car obj=new Car();//Car is our class name, obj is reference variable , = sign is assigning operator, new is a keyword that creats
	// an object, and Car (); it looks like a method and it is called constructor 
	System.out.println(obj.color);//null// in this point constructor initialize the value to all those variable those
	System.out.println(obj.doors);
	System.out.println(obj.engine);
	hello();
}
public static void hello() {
	//before using local variable we have to initialize it
	String name;
	//System.out.println(name); compiler will give us an error
	System.out.println("I am a static hello method");
}
}
