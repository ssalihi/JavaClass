package com.Class17;

public class Greetins1 {

	public static void main(String[] args) {
		//Will create a method that ask a person how are you
		Greetins1 obj=new Greetins1();
		obj.askHowAreYou("Sekander");//
		

	}
	void askHowAreYou(String name) {//here String is formal parameter and name if parameter list
		System.out.println("How are you "+name);
	}
	void askHowAreYou1(String name) {
		System.out.println("How are you "+name);
	}
	void askHowAreYou2(String name) {
		System.out.println("How are you "+name);// method to be called by creating the object and it can be executed
}
}