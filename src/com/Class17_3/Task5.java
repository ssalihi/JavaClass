package com.Class17_3;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// 
		Scanner scan=new Scanner (System.in);
		int gN=20;
		int num=0;
		for (int n=1; n<=30; n++) {
			System.out.println("Guess a number between 1 to 30 please");
			num=scan.nextInt();
			if (num<gN) {
				System.out.println("Your number is small");
			} else if (num>gN) {
				System.out.println("Your number is large");
			} else {
				System.out.println(" Congratulation...You got it!");
				break;
			}
		}
		
///
		 Scanner input;
	        int secret, userNumber;
	        
	        secret=13;
	        input=new Scanner(System.in);
	        System.out.println("Please enter any number from 1 to 20");
	        do {
	            
	            userNumber=scan.nextInt();
	            
	            if (userNumber<secret) {
	                System.out.println("Number is too small, try again");
	            }else if (userNumber>secret){
	                System.out.println("Number is too large,  try again");
	            }
	        }while(secret!=userNumber);
	        
	        System.out.println("Congratulations!!You got it!");
	    }
		
	
}

