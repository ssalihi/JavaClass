package com.class2;

public class VariableChange {
public static void main (String[] args) {
	//values of variable can be changed

	String firstname="David";
	String lastName="Alex";
	System.out.println(firstname);
	System.out.println(lastName);
	char grade='B';
	System.out.println(grade);
	// char grade='A'; do not work
	
	grade='A';
	System.out.println(grade);
	
	String city="Woodbridge";
	System.out.println(city);
	city="New York"; //value of variable is changed
	System.out.println(city);
	
	
	
	
}
}
