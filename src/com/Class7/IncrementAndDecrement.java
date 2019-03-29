package com.Class7;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		// post increment & post decrement
		//a++;              a--;
int a=299;
int b=a++; //  first assign--->increment (int b=a; a=a+1)
System.out.println(a);// 300
System.out.println(b);//299
// post decrement x--;
int z=10;
int c=z--;
System.out.println(z);// 9 then decrement
System.out.println(c);// 10  first assign

	}

}
