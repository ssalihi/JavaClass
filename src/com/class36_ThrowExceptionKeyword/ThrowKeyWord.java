package com.class36_ThrowExceptionKeyword;

public class ThrowKeyWord {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		//System.out.println(a/b);//new ArithmeticException
		// if person age is>18 issue driving licence else----throw an exception
//checkEligibility(17);
//twoNumDiv(10, 0);
//userNameChech("a");
		withdrawAmount(5550, 5000);
		
	}
	public static void checkEligibility (int age) {
		if(age>18) {
			System.out.println(" Congratulation on you driver license");
		}else {
			throw new ArithmeticException("You are not eligible to get driver license");
		}
	}
	public static void twoNumDiv(int a, int b) {
		if (b!=0) {
			System.out.println(a/b);
		}else {
			throw new ArithmeticException("We cannot divide by zero");
		}
	}
	public static void userNameChech(String userName) {
		if(userName.length()>2) {
			System.out.println("You username match the condition");
		}else {
			throw new NullPointerException("your user name must be longer than 3 character");
		}
	}
	// create an exception when user it trying to withdraw larger amount that the balance throw an exception that u dont have enough
public static void withdrawAmount(int amount, int balance) {
	if (amount<balance) {
		System.out.println("thanks for using our ATM services");
	} else {
		throw new ArithmeticException("you dont have enough amount in your account");
	}
}
}
