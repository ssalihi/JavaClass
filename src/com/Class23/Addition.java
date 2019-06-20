package com.Class23;

public class Addition {
	//overloading method by changing number of parameters
public void add(int a, int b) {// this process we call method overloaded.
	System.out.println("Method to add two integers");
	System.out.println(a+b);
}
public void add (int a) {
	System.out.println("Method two add one integer and one 100");
	System.out.println(a+100);
}
public void add(int a, int b, int c ) {
	System.out.println("Method add three integers");
System.out.println(a+b+c);	
}
//2. overloading method by changing the dataType of the parameters
public void add(double a, double b ) {
	System.out.println("method add two double values");
System.out.println(a+b);	
}
public void add(double a, int b ) {
	System.out.println("Method add one double and one interger");
System.out.println(a+b);	
}
public void add(double a, double b, double c ) {
	System.out.println("Method add three double values");
System.out.println(a+b+c);	
}
}