package com.class26_this;

public class Students {
String fullName;
int age;
public Students(String fullName, int age) {
	//this is used to differentiate between local and instance variables
	this.fullName=fullName;
	this.age=age;
	
}
public void displayDetail() {
	
	System.out.println("Student full name is "+fullName+" and is age ="+age);
}
public static void main(String[] args) {
	Students obj=new Students("Sekander Salihi", 30);//
	obj.displayDetail();
}
}
