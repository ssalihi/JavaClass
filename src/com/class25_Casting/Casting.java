package com.class25_Casting;

public class Casting {

	public static void main(String[] args) {
		double a=10;//changing from int to double and it is called implicit/automatic/widening and done automatically by complier
		System.out.println(a);
		
		System.out.println("------------------------------------------------------Expliciti casting");
        // converting double to int or small number to bigger number and called it Explicit/Manual/Narrowing and done by programmer
		double b=10.0;
		int c=(int)b;
		System.out.println(c);
		double d=11.3;
		int e=(int)d;//11
		System.out.println(e);
		
		
		
		
		System.out.println("--------------------------------------------------------3rd example");
		int i=130;
		//byte by=130;  --->compiler do not allow
		byte by=(byte)i;//-126 some time it change the original value during expliciting casting 
		
		System.out.println(by);
		
		System.out.println("----------------------------------------4th example");
		
		double y=2.7;
		int r=(int)y;
		System.out.println(r);//2
		Payment pay=new masterCard();// creating the object of Child class(masterCard) it is called upcasting 
		//masterCard mc=new Parent();//complier does not allow to creat the object of parent class in reference of child class
		//masterCard mc=(masterCard)new Payment();// changing child class to parent class it is called downcasting
	}

}
