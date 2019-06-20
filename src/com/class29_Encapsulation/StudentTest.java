package com.class29_Encapsulation;

public class StudentTest {

	public static void main(String[] args) {
		Student obj=new Student();
		Student obj1=new Student();
		obj.setName("Sekander");
		obj.setAge(34);
		obj1.setName("Farhan");
		obj1.setAge(3);
		
		System.out.println(obj.getName()+" is "+obj.getAge());
		
		System.out.println(obj1.getName()+" is "+obj1.getAge());
		

	}
}
