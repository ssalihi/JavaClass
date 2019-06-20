package com.class34_ExceptionIntro;

public class ExceptionHandling {

	public static void main(String[] args) {
	System.out.println("Beginging of the code");
	try {
	Thread.sleep(2000);
	} catch (InterruptedException e) {
		System.out.println("Iam a catch block code");
		e.getMessage();
	}
	System.out.println("the end of the program");
	//InterruptedException e=new InterruptedException();
	}

}
