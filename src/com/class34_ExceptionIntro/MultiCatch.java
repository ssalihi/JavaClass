package com.class34_ExceptionIntro;

public class MultiCatch {

	public static void main(String[] args) {
		System.out.println("Begining of the code");
try {
	Thread.sleep(2000);// new InterruptedException(); object will created 
	System.out.println(10/0);//new ArithmeticException(); object will created
}catch (ArithmeticException e) {
	// to print name and details of exception, there different method to print it
	//1.
	//e.printStackTrace();// name of the E and detail
	//2.
	//System.out.println(e);// will print name of E and details
	//3.
	System.out.println(e.getMessage());//  this will only print the details
	System.out.println("Code of Arithematic Exception Code");
} catch (InterruptedException e) {
	System.out.println("Code of Interrupted exception");
}
System.out.println("End of code");
//System.out.println("End of code");
//System.out.println("End of code");
//System.out.println("End of code");
	}

}
