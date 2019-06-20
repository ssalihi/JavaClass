package com.class26_this;

public class ThisWithMethod {
public void m1() {
	System.out.println("I am m1 method");
}
public void m2() {
	this.m1();//by default "this" compiler is added so we dont need to use "this"
	System.out.println("I am m2 method");
}
public static void main(String[] args) {
	ThisWithMethod obj=new ThisWithMethod();
	obj.m2();//first will be m1 method executed and then m2.
}
}
