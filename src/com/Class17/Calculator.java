package com.Class17;

public class Calculator
{
	
public int sum (int x, int y) {
	//int sum=x+y;
	System.out.println("the "+(x+y));
	return x+y;
}
 public int sub (int x, int y) {
	return x-y;
	
}
public int div (int x, int y) {
	return x/y;
	
}
public int mul (int x, int y) {
	return x*y;
	
}
public static void main(String[] args) {
	Calculator obj=new Calculator();
	int a=obj.sub(10, 5);
	int b=obj.sum(10, 5);
	int c=obj.mul(5, 5);
	int d=obj.div(25, 5);
	//System.out.println("the sum of two numbers is:" +b);
	//System.out.println("the substract of two numbers is:" +a);
	//System.out.println("the mulitplicationn of two numbers is:" +c);
	//System.out.println("the division of two numbers is:" +d);
	
}
}
