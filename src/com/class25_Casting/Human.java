package com.class25_Casting;

public class Human {
public static void whoAmI() {
	System.out.println("I am Human");
}
}
class Afghan extends Human {
	// we can cannot override static method with instance 
	//public void whoAmI() {
		//System.out.println("I am Afghan");
	//}
}
class pashtun extends Human{
	public static void whoAmI() {
		System.out.println("I am pashtum");
	}
}