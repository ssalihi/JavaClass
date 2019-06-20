package com.class32_Collection_ArrayList;

public abstract class CreditCard {
public String creditCardName;
public CreditCard(String creditCardName) {
	this.creditCardName=creditCardName;
}
public void openAccount() {
	System.out.println(" Open "+creditCardName+" credit card");
}
public abstract void interestRate();
public abstract void annualFee();
}
class Visa extends CreditCard{

	public Visa(String creditCardName) {
		super(creditCardName);
		
	}

	@Override
	public void interestRate() {
		System.out.println(creditCardName+" card has the interest rate of 25%");
		
	}

	@Override
	public void annualFee() {
		System.out.println(creditCardName+" card has the annaul fee of $250");
		
	}
	
}
class AX extends CreditCard{

	public AX(String creditCardName) {
		super(creditCardName);
		
	}

	@Override
	public void interestRate() {
		System.out.println(creditCardName+" card has the interest rate of 25%");
		
	}

	@Override
	public void annualFee() {
		System.out.println(creditCardName+" card has the annaul fee of $250");
		
	}
	
}
class MasterCard extends CreditCard{

	public MasterCard(String creditCardName) {
		super(creditCardName);
		
	}

	@Override
	public void interestRate() {
		System.out.println(creditCardName+" card has the interest rate of 25%");
		
	}

	@Override
	public void annualFee() {
		System.out.println(creditCardName+" card has the annaul fee of $250");
		
	}
	
}