package com.class26_SuperKeyWord;

public class Employee {
String name, lastName;
Employee (){
	System.out.println("I am parent class constructor");
}
Employee(String name, String lastName){
	this.name=name;
	this.lastName=lastName;
	
}
Employee (int num, String lastName){
    num=num;
    this.lastName=lastName;
}
}
class Tester extends Employee{
	int salary;
	Tester(String name, String lastName,int salary ){
		super(name, lastName);
		this.salary=salary;
		
	}
	public void displayDetails() {
		System.out.println("Employee "+name+" "+lastName+" has salary of "+salary);
	}
}
