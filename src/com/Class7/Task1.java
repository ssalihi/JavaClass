package com.Class7;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		double price=0;
		Scanner scan;
		scan=new Scanner (System.in);
		do {
			System.out.println("Please enter a price");
			price=scan.nextDouble();
		}while (price!=1.99);//(when we use do we dont need to use quarry barackets ({}), still we can use it) 
			System.out.println("Please enjoy your soda");
		
	}

}
