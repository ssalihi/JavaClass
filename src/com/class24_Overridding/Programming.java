package com.class24_Overridding;
/*1. Create a class named ‘Programming’. 
 * While creating an object of the class, 
 * if nothing is passed to it, then the message “I love programming languages” should be printed. 
 * If some String is passed to it, then in place of “programming languages” the value variable should be printed. 
 * Example, if we pass “Java”, then “I love Java” should be printed.
 */
public class Programming {
	public Programming (){
		System.out.println("I love programming languages");
	}

	public Programming (String b){
		System.out.println("I love java"+b);
	}
	public static void main(String[] args) {
		Programming obj=new Programming ();
		
		Programming obj2=new Programming (" ");

	}
	
	
	
	}
