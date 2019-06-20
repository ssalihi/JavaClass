package com.class25_Casting;

public class Parent {
Parent (){
System.out.println("I am parent constructor");	
}
}
class Child extends Parent{
	//Parent(){// we can not overriding the constructor
		//System.out.println("I am a child constructor");
	//}
	Child (){
		System.out.println("I am a child constructor");
	}
}