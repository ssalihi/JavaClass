package com.Class7;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		// post increment & post decrement
		//a++;              a--;
int a=299;
//int b=a++; //  first assign--->increment (int b=a; a=a+1)//299
int b=++a;// fist increment than assign 300
System.out.println(a);// 300
System.out.println(b);//299
// post decrement x--;
int z=10;
int c=z--;

System.out.println(z);// 9 then decrement (int z=z-1)
System.out.println(c);// 10  first assign(int c=z)
int e=10;
int d=--e;
System.out.println(e);// first decrement then assign the value (int e=e-1) 9
System.out.println(d);// int d=e-1

	}

}
