package com.class26_Overriding;

public class TestBank {

	public static void main(String[] args) {
		
		Bank obj1=new Bank();
		
		System.out.println(" the balance is :"+obj1.getBalance());
		
		BankA obj2=new BankA();
		obj2.getBalance();
		System.out.println(" the balance is :"+obj2.getBalance());
		
		BankB b=new BankB();
		System.out.println(" the balance is :"+b.getBalance());
		
		BankC c=new BankC();
		c.getBalance();
		System.out.println(" the balance is :"+c.getBalance());
		
		//BankD d=new BankD();
		//d.gma();
		//System.out.println(" the balance is :"+d.gma());
		// refernce to parent call
		
		
		Bank amount;
		amount=new Bank();
		amount.getBalance();
		System.out.println("The balance is "+amount.getBalance());
		System.out.println("-------------------------------------------------------Giving reference to bankA");
		amount=new BankA();
		amount.getBalance();
		System.out.println("The balance is "+amount.getBalance());
		System.out.println("-------------------------------------------------------Giving reference to bankB");
		amount=new BankB();
		amount.getBalance();
		System.out.println("The balance is "+amount.getBalance());
		System.out.println("-------------------------------------------------------Giving reference to bankC");
		
		amount=new BankC();
		amount.getBalance();
		System.out.println("The balance is "+amount.getBalance());
		
		amount=new BankD();
		amount.getBalance();
		System.out.println("The balance is "+amount.getBalance());
		
	}

}
