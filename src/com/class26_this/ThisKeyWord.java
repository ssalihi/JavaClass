package com.class26_this;

public class ThisKeyWord {
int num1, num2;
public ThisKeyWord() {
	System.out.println("No parameter here");
}
public ThisKeyWord(int num1, int num2) {// 
	this.num1=num1;
	this.num2=num2;
}
public void sum(int num1, int num2) {//these are local variables
	System.out.println("The sum local variables is ="+(num1+num2));	
System.out.println("The sum of instance variables is ="+(this.num1+this.num2));// we refer to instance variables

}
public void mul(int num1, int num2) {
	System.out.println("The mulitiplication of instance variables is ="+(this.num1*this.num2));
	System.out.println("The mulitiplication  local variables is ="+(num1*num2));	
}
}
