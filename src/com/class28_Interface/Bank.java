package com.class28_Interface;

public interface Bank {
// by default compiler adds public and abstract to every method
	//static String name1; we cannot have static variable inside interface, unless initlized it
static String name="Bank";// by default all variables inside the interface are public static final
void hasChecking();
void hasSaving();
void hasCreditCard();
//static void hasLoan(); cannot have static abstraction method

}
class BOA implements Bank{
	public void hasChecking() {
		System.out.println("BOA has 2 checking accounts");
	}
	public void hasSaving() {
		System.out.println("BOA has 2 saving accounts");	
	}
	public void hasCreditCard() {
		System.out.println("BOA has 10 different credit cards");	
	}	
}
class PNC implements Bank{
	public void hasChecking() {
		System.out.println("PNC has three checking accounts");	
	}
	public void hasSaving() {
		System.out.println("PNC has 3 saving accounts");	
		
	}
	public void hasCreditCard() {
		System.out.println("BOA has 7 different credit cards");
		
	}
	
}

