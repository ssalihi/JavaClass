package com.class3;

public class RelationalOperators {

	public static void main(String[] args) {
		int a=19;
		int b=5;
		boolean result=a>b;
		boolean result2=a==b;
		System.out.println(result);
		System.out.println(result2);// those relational operation use where we have "if" condition.
		//compare 2 numbers and if a is larger than b----> print
		if (a>b) {
			System.out.println("a is lager than b");// this will be printed when the condition is true. 
				
		} else {
		System.out.println("b is larger than a"); // if condition is false, this line is going to be printed.
		}
		//declare price and if price is higher than expected price---> I will not buy anything
		double shoesPrice=39.99;
		double allowedPrice=31.99;
		if (shoesPrice<=allowedPrice) {
			System.out.println("I am buying those shoes");//if condition true this will be printed
	}   else {
	
		System.out.println("I am not buying those shoes");//if condition is false this will be printed
	}
		System.out.println("I am continues code");//this statement is independent statement and does not belong to any of above two statements.
		
	

	}

}
