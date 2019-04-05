package com.Class17;

public class Greeting {
	public static void main(String[] args) {
	Greeting obj= new Greeting();
	obj.hello();
	obj.largest(20,10);// calling method find the larger and passing value compare 20 and 10
	obj.largest(30, 31);//calling method find the larger and passing value compare 30 and 31
     // how find largest number
	obj.hellToInstructor("Sekander");// we give different value for our data
	}
	void largest(int a, int b) {// by specifying our parameter in method we can pass different number// int is formal parameter,
	if (a>b) {                   // a and b are parameter list
		System.out.println("a is larger");// method is reusable code
	}else {
		System.out.println("b is larger");
	}	
	}
	void hellToInstructor (String name){
		System.out.println("hello "+name);
	}
	void hello() {//this is our method signature, and what is ever in out method is called method body
	System.out.println("Hello");// we use method to be our code our clean.
	
	}

}
