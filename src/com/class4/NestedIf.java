package com.class4;

public class NestedIf {
/*
 * write a program to check work eligibility 
 * if user is younger than <16---not allowed work
 * otherwise--> allow to work. if user is younger than 64---> go to work otherwise  your life
 */
	public static void main(String[] args) {
	int age=18;
	int eligAge=16;
	int retAge=64;
	
	if (age>eligAge) {
		System.out.println("you are eligible to work");
	}else {
		System.out.println("U ar not eligible to work");
	} if (age<retAge) {
		System.out.println("Go work Hard");
	}else {
		System.out.println("enjoy your rest of life");
		
	}

	}

}
