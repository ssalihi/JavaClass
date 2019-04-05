package com.Class17;

public class NoMainMethod {
	String str;
	int num;
	void hello() {
		System.out.println("Hello");
		System.out.println("hello freinds");
		System.out.println("method can be single line or block of code");
	}
    void bye() {
    	System.out.println("Bye");// it is not executable, because we dont have main method
    	
    }
   public static void main(String[] args) {// now we are creating out main method//This will be out method signature
	   NoMainMethod obj=new NoMainMethod();// this is will be our method body
	   obj.hello();// we calling the method of hello
	   //we can not declare one method inside another method. our new method should 
	   obj.bye();
	   
	
}
}
