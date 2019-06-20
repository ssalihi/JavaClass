package com.class34_ExceptionIntro;

import java.beans.IntrospectionException;

public class ChildtoParentException {

	public static void main(String[] args) {
		int [] array={17,99,8};
		
		try {
			Thread.sleep(2000);//Interrupted exception occurred
		System.out.println(array[3]);// new ArrayIndexOutOfBoundsException
		}catch (InterruptedException e) {//first put the child and than parent when they related to each other
			
		} catch (ArithmeticException e) {
		} catch(Exception e) {// Exception e is parent and can handle any kind of exception
			
		//}catch (InterruptedException e) {// it will give the error because this child exception 
			
		//}
System.out.println("Code after exception");
//ArrayIndexOutOfBoundsException e=new ArrayIndexOutOfBoundsException();
//Exception e1=new ArrayIndexOutOfBoundsException();
	}
	}
}
