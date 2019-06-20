package com.class26_this;

public class TestThisKeyWord {

	public static void main(String[] args) {
		ThisKeyWord obj=new ThisKeyWord(10, 10);
		obj.sum(100, 200);
		System.out.println("---------------------------------mulitiplication process");
		ThisKeyWord ob=new ThisKeyWord(12, 12);
		ob.mul(10, 10);
		
		System.out.println("-----------------------------------------------------");
ThisKeyWord obj1=new ThisKeyWord();
obj1.sum(12, 12);
	}

}
