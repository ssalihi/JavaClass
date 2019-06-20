package com.class27_thisTask;

public class Student {
/*
1. Write program as a student class   that has instance variables name and address. 
Create a constructor that will initialize those variables. Print name & address of given  student by the displayInfo method.
 * 
 */
	
	String name;
	String addres;
	
	public Student (String name, String address) {
		this.name="salihi";
		this.addres="woodbrige";

	}	
	public void display() {
		System.out.println("Student name is "+name+" live in  "+addres);	
	}
	
	public static void main(String[] args) {
		Student task1=new Student("Salihi", "Woodbrige");
	task1.display();
		
	}
}

