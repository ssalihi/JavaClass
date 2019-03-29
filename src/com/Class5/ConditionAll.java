package com.Class5;

import java.util.Scanner;

public class ConditionAll {

	
		/*
		 * Ask user to enter price and boolean value for sale
		 * Based on the sale we will check the price:
		 * if price<20--> apply discount 20% and give final price
		 * if price is >20 less 100--> apply discount 30% and give final price if price is >100 less 500--> apply discount 50% and give final price
		 */
	public static void main(String[] args) {
		Scanner scan;
		boolean sale;
		int discount;
		int price;
		double finalprice;
		scan=new Scanner(System.in);
		System.out.println(" please enter if there is sale");
		sale=scan.nextBoolean();
		
		if (sale) {
			System.out.println("Please enter price of the item");
			price=scan.nextInt();
			
			System.out.println("let check all discount");
					if (price<20) {
						discount=20;
						finalprice=price-(price*0.2);
					}else if (price>=20 && price<100) {
						discount=30;
						finalprice=price-(price*0.3);	
					} else if (price>=100 && price<500) {
						discount=50;
						finalprice=price-(price*0.5);
					}else {
						discount=75;
						finalprice=price-(price*0.75);
						
					}
					System.out.println("final price is "+ finalprice);
		}else {
			System.out.println("Not interested");
			
		}
		//
		boolean x=true;
		boolean y=false;
		if (x||y) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
				
	}
	

}
