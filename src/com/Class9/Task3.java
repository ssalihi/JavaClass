package com.Class9;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		/*Write a program that reads a range of integers (start and end point), provided
         * by a user and then from that range prints the sum of the even and odd integers.
		 */
		Scanner scan;
		scan=new Scanner (System.in);
		System.out.println("Please start number and end number");
		int sN=0; int eN=0; 
		int sumodd=0; int sumeven=0;
		sN=scan.nextInt();
		eN=scan.nextInt();
		for (int a=sN; a<=eN; a++) {
			if (a%2==0) {
				sumeven+=a;
				
			} else {
				sumodd+=a;
			}
			
		}
		System.out.println("The sum of odd numbers in your range is " +sumodd+ " and sum of odd numbers in your range "+sumeven);
/*Ask user to enter the item they want to buy and  the price for the item.
 * Then ask user to pay for it.
 * Every time user enters money accumulate the amount and tell user how much is left to pay off the amount.
 * Whenever user done with payments tell them "Thank you for shopping!"
 */
		System.out.println("-----------------------------------------------------Task-2");
		Scanner input;
		String item;
		int price=0;
		int pay=0; int total=0;
		input=new Scanner (System.in);
		System.out.println("Please enter the item you buy");
		item=input.nextLine();
		System.out.println("Please enter the price");
		price=input.nextInt();
		while (price>total) {
			System.out.println("Enter Paayment : ");
			pay=input.nextInt();
			total+=pay;
			if (price==total) {
				System.out.println("Your payment is exact");
			} else if (price<total) {
				System.out.println("cash back "+ (total-price));
			} else {
				System.out.println("Remaining balace "+ (total-price));
			}
		}
		
		System.out.println("Thank you for shopping");
		
				
		
	}

}
