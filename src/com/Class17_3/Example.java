package com.Class17_3;

public class Example {

	public static void main(String[] args) {
		/*
		 * I want to print pattern
		 * 12345 for four times (we have 4 rows and five columns)
		 */
      Example a=new Example();
      a.pattern();
	}
  void pattern (){
for (int i=1; i<8; i++) {// it shows numbers of rows
	for (int y=1; y<8; y++) {// it shows numbers of columns
		System.out.print(i);
	}
	System.out.println();// it creates new line then print (y)
}
}
}