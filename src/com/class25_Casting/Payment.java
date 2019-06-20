package com.class25_Casting;

public class Payment {
public void makePayment() {//overriden method
	System.out.println("We can make payment with no fee");
}
public void closePayment() {
	System.out.println("All payment need to be closed");
}
}
class masterCard extends Payment{// overriding method
	public void makePayment () {
		System.out.println("We can do payment with master card with 2% fee");
	}
}
class Visa extends Payment{//overriding method
	public void makePayment() {
		System.out.println("We can make payment with Visa card with 1.5% fee");
	}
	public void annualFee() {
		System.out.println("Visa card has the annual fee");
	}
}