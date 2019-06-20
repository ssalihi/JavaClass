package com.class28_Interface;

public class BankTest {

	public static void main(String[] args) {
		Bank bank=new BOA();
		bank.hasChecking();
		bank.hasCreditCard();
		bank.hasSaving();
		System.out.println("-------------------------------------------------------------------");
		Bank bank1=new PNC();
		bank1.hasChecking();
		bank1.hasCreditCard();
		bank1.hasSaving();

	}

}
