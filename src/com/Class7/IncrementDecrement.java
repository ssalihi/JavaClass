package com.Class7;

public class IncrementDecrement {

	public static void main(String[] args) {
		int x=1;
		x=x+1;
		System.out.println(x);
		int y=1;
		y+=1;
		System.out.println(y);
		
		// there is anther way to increment and that is (++)
		
		int s=1;
		s++;
		System.out.println(s);
		int v=10; // decrement operator
		v--;
		System.out.println(v);
		
		int a=10;
		int b=++a;// preincrement =first increment --> assign
		System.out.println(b);// 11
		System.out.println(a);//
		 int c=12;
		int d=c++;//postincrement = first assign-->increment
	
		System.out.println(d);//12
		System.out.println(c);//13
		
		int q=100;
		int p=q--; //first we assign then decrement
		System.out.println("Value of e "+p);//100
		System.out.println("Value of q is "+q);//99
		
		int h=50;
		int g=--h;//first decrement than assign
		System.out.println("Value of h is" +h);
		System.out.println("Value of g "+g);
		
		

	}

}
