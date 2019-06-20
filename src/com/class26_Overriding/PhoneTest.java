package com.class26_Overriding;

public class PhoneTest {

	public static void main(String[] args) {
		System.out.println("-------------------------------------objec tof parent class");
   Phone phone =new Phone();
  phone.makeCall();
  phone.hasCamera();
  
  System.out.println("---------------------------------------------Object f iphone");
  iPhone iphone=new iPhone();
  iphone.hasCamera();
  iphone.makeCall();
  
  System.out.println("--------------------------------------Nokia object");
   Nokia nokia= new Nokia();
   nokia.makeCall();
   nokia.hasCamera();
   nokia.cannotBreak();
   
   System.out.println("--------------------------------------------Sansum object");
   
   Samsung samsung=new Samsung();
   samsung.hasCamera();
   samsung.makeCall();
   
   System.out.println("-------------------------------------------object of iPhone using phone refrence");
   Phone p=new iPhone();
   p.makeCall();
   p.hasCamera();
   //p.cannotBreak();  method is undefined 
   System.out.println("---------------------------------------assigning iPhone object");
   Phone parentPhone;// Phone(Parent) reference variable is parentPhone
   parentPhone=new iPhone();// 
   parentPhone.hasCamera();
   parentPhone.makeCall();
   System.out.println("---------------------------------------assigning samsung object");
   parentPhone=new Samsung();//// runtime polymorphism method creating of object of child class reference to the object of parent class
   parentPhone.hasCamera();
   parentPhone.makeCall();
   System.out.println("---------------------------------------assigning nokia object");
   parentPhone= new Nokia();
   parentPhone.hasCamera();
   parentPhone.makeCall();
  // parentPhone.cannotBreak(); cannot access because it is not defined in parent (Phone Class)
	}

}
