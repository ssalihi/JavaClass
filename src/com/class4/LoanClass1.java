package com.class4;

import java.util.Scanner;

public class LoanClass1 {

	public static void main(String[] args) {
		Scanner DMV=new Scanner(System.in);
		int age;
		System.out.println("Please enter age");
		age= DMV.nextInt();
		if (age>=18) {
			System.out.println("Please issue a licence");
		}else {
			System.out.println("Issue permit");
			// loan
			Scanner loan=new Scanner(System.in);
			int amount;
			System.out.println("Please amount of loan19");
			amount=loan.nextInt();
			if (amount<200000) {
				System.out.println("Please issue a loan");
			}else {
				System.out.println("Reject the loant requaest");
				
	
				
				
			}
			
			
		}
		
		
				

	}

}
