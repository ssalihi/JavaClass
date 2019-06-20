package com.class27_Abstract;

public class PhoneTest {
	public static void main(String[] args) {
		//we can not create the object of parent (Phone class) but we can create the object of child class and reference to the parent
		Phone obj=new iPhone();// or we can iPhone obj=new iPhone(); as well
		obj.madeCall();
		obj.sendTest();
		obj.unlockPhone();
		obj.viewPicture();
		System.out.println("---------------------------------------------------------------Behavior of samsung");
		Phone obj1=new Samsung();
		obj1.madeCall();
		obj1.sendTest();
		obj1.viewPicture();
		obj1.unlockPhone();
	}
}
