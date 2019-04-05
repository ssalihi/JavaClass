package com.Class17;

public class Task2 {

	public static void main(String[] args) {
		Task2 obj=new Task2();
		obj.num(3,6);
		
	}
	void num(int a, int b) {
		if (a%2==0 && b%2==0) {
		System.out.println("Both number are even");	
		}else {
			System.out.println("It is odd");
		}
	}

}
