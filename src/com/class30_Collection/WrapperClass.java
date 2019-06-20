package com.class30_Collection;

public class WrapperClass {

	public static void main(String[] args) {
		int i=10;
		
		Integer i1=new Integer(10);//Boxing
		System.out.println(i1);
		
		int num=i1.intValue();//un-boxing
		System.out.println(num);
		
		int a=i1.valueOf(i);
		
		System.out.println(a);
		
		

	}

}
