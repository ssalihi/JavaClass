package com.Class7;

public class WhileLoop {

	public static void main(String[] args) {
		// to eliminate repetition we use Loop
		// types of loop are beloow
		// 1. while loop
		//2. do while loop
		//3. for loop
		//4. enhanced for loop (for each loop)
		
		int a=1;
		while (a<10) {
			System.out.println("Good morning");
			a++;
			
		}
int b=1;
while (b<=5) {
	System.out.println("I am inside of while loop " +b);
	b++;
	
}
System.out.println("I am outside of while loop");		
// if want to print values from 10-20 inclusive;
   int z=10;
   while (z<=20) {
	   System.out.println(z);
	  z++;
   }
// if want to print values from 1-20 inclusive, but  in 1 line with space;
   int q=1;
   while (q<=20) {
	   System.out.print(q+ " ");
	   q++;
   }
   // I want to print values from 10 to 1
int e=10;
while (e>=1) {
	System.out.println(e);
	e--;
}
	}

}
