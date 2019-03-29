package com.Class5;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		/*write a program to find largest of three double values using if-else... if provided by a user must distinct)
		 * 
		 */
double num1;
double num2;
double num3;
Scanner largestNum;
largestNum= new Scanner(System.in);
System.out.println("Please enter 3 double numnbers");
		
num1=largestNum.nextInt();
num2=largestNum.nextInt();

num3=largestNum.nextInt();
 if (num1>num2   && num1>num3) {
	 System.out.println(num1+" is the largest");
 } else if (num2>num1 && num2>num3) {
	 System.out.println(num2+" is the largest"); 
 } else if (num3>num1 && num3>num2) {
	 System.out.println(num3+" is the largest"); 
 } else {
	 System.out.println("Invalid");
 }


	}

}
