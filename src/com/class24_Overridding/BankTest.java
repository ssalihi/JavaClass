package com.class24_Overridding;

public class BankTest {

	public static void main(String[] args) {
		Bank bank=new Bank();//JVM will call the main method
		BOA boa=new BOA();
		PNC pnc=new PNC();
		
		int interestRate;
		interestRate=bank.chargeIneret();
		System.out.println("Bank charges ineterst ="+interestRate);
		
		interestRate=boa.chargeIneret();
		System.out.println("Bank charges ineterst ="+interestRate);
		
		interestRate=pnc.chargeIneret();
		System.out.println("Bank charges ineterst ="+interestRate);
			
		

	}

}
