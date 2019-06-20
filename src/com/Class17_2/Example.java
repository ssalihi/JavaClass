package com.Class17_2;

public class Example {

	public static void main(String[] args) {
		/*
		 * I want to print pattern
		 * 12345 for four times (we have 4 rows and five columns)
		 */
      Example a=new Example();
      a.pattern();
      a.pattern2();
	}
  void pattern (){
for (int i=1; i<8; i++) {// it shows numbers of rows
	for (int y=1; y<6; y++) {// it shows numbers of columns
		System.out.print(i);
	}
	System.out.println();// it creates new line then print (y)
	
}
System.out.println("--------------------------------------------------------2nd example");
}
 
  void pattern2() {
	  for (int i=0; i<5; i++) {
		  for (int j=0; j<5; j++) {
			  System.out.print(i);
		  }
		  System.out.println();
	  }
  }
}