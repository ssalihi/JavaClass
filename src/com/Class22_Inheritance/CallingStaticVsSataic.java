package com.Class22_Inheritance;

public class CallingStaticVsSataic {

	public static void main(String[] args) {
		
		StaticVsNonStatic obj=new StaticVsNonStatic();
	    // non-static member can be accessable only through obj
		System.out.println(obj.name);
		obj.getInfo();
		//access static member by using className they belong to
		// static members can only be accessable through its class name
		System.out.println(StaticVsNonStatic.lastName);
		System.out.println(StaticVsNonStatic.job);
		StaticVsNonStatic.getIfo1();// it is available because it static in StaticVsNonStatic class.
		

	}

}
