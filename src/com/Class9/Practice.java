package com.Class9;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		/*
		*Write a program that reads a range of integers (start and end point), provided
        * by a user and then from that range prints the sum of the even and odd integers.
		 */
Scanner scan=new Scanner(System.in);
System.out.println("Please enter range of numbers");
int startNumber=0; int endNumber=0;
int sumOfOddNumber=0;  int sumOfEvennumber=0;
startNumber=scan.nextInt();
endNumber=scan.nextInt();

for (int i=startNumber; i<=endNumber; i++ ) {
	if (i%2==0) {
		sumOfEvennumber+=i;
	}else {
		sumOfOddNumber+=i;
	}
}
System.out.println("The sume of even number is "+sumOfEvennumber+" and sum of odd number is "+sumOfOddNumber);
	}

	
}
