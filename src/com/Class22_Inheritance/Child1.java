package com.Class22_Inheritance;

public class Child1 extends Parents {// the keyword for inheritance is extends
	String hairType="Curly";
	
public static void main(String[] args) {
	Child1 obj=new Child1();
	System.out.println("Child1 eye color "+obj.eyeColor);
	System.out.println("Child1 hair color "+obj.hairColor);
	System.out.println("Child1 haas "+obj.nose+" nose");
	System.out.println("Child hair type is "+obj.hairType);
	obj.sing();
	obj.playTennis();
	
	Parents parentObj=new Parents();
	//parentObj.hairType(); not accessible in parent class
	//parentObj.playTennis(); not accessible in parent class
}
public void playTennis() {
	System.out.println("Child 1 can plat tennis");
}
}
