package com.class30_InterfaceTask;

public class TestMark {

	public static void main(String[] args) {
		A obj= new A(100,100,100);
		obj.getPercentage();
System.out.println("perctentage of three subjects is ="+obj.getPercentage());

B obj1=new B(100,90,90,95);
System.out.println("Percentage of four subjects is ="+obj1.getPercentage());


	}

}
