package com.Class9;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// leap year
		int leapYear;
		Scanner scan=new Scanner (System.in);
		for (int a=1; a<10; a++) {
		System.out.println("Please enter the year");
		leapYear=scan.nextInt();
		
		if (leapYear%4!=0) {
			System.out.println("It is not a leap year, please try again");
		}else  {
			System.out.println("It is a leap yeaar");
			break;
			
		}	
		}
	}
	}


