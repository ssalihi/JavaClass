package com.class32_Collection_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class CreditCardTest {

	public static void main(String[] args) {
		Visa obj=new Visa("Visa Platinum");// we can referrence to parent class
		
		AX ax=new AX("AX Reward");
		
		MasterCard mc=new MasterCard("MC Basic");
		
		ArrayList<CreditCard> alist=new ArrayList<>();
		
		alist.add(obj);
		System.out.println("------------------");
		alist.add(ax);
		System.out.println("------------------");
		alist.add(mc);
		System.out.println("--------------------");
		//alist.add(12); can not store int type object, because 
		//how can I get a name of each card
		for (CreditCard card:alist) {
			System.out.println(card.creditCardName);// we will have three outputs
			card.interestRate();// call the object
			card.annualFee();//
			
			System.out.println("---------------------------------------2nd");
		}
		// how to print in iterator
		Iterator<CreditCard> myIterator=alist.iterator();
		while(myIterator.hasNext()) {
			CreditCard object=myIterator.next();
			object.interestRate();
			
		}
		System.out.println("-----------------------------------------------for loop");
		//Using while to get the object 
		for (int i=0; i<alist.size(); i++) {
			CreditCard obj1=alist.get(i);
			obj1.annualFee();
			
		}

	}

}
