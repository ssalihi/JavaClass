package com.class25_Casting;

public class PaymentTest {

	public static void main(String[] args) {
		Payment parent=new Payment();
		parent.makePayment();
		
		masterCard mc=new masterCard();
		mc.makePayment();
		
		Visa v=new Visa();
		v.makePayment();
        v.annualFee();
        //Runtime or dynamic polymorphism has been achieved.
        //pay-reference variable and patment is type
        //new masterCard(); --is creating an object
        System.out.println("-------------------------------------------runtime polymorphism");
        Payment pay=new masterCard();//object of child class
        pay.closePayment();
        pay.makePayment();
        System.out.println("--------------------------------child class execution");
        Payment pay1=new Visa();
        pay1.closePayment();
        pay1.makePayment();
        //pay1.annuallFee(); 
        }

}
