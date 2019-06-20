package com.class26_thisconstructor;

public class ThisWithConstructor {
public ThisWithConstructor() {
	System.out.println("I am inside constructor with no parameters");
	System.out.println("I have no parameter");
}
public ThisWithConstructor(String str) {
	this ();
	System.out.println("I am inside with constructor with one parameter");
	System.out.println("I have one parameter "+str);
}
public ThisWithConstructor(String str1, String str2) {
	this(str1);// calling constructor with one parameter
	System.out.println("I am inside constructor with two parameters");
	System.out.println("I have two parameters "+str1+" "+str2);
}
public static void main(String[] args) {
	//ThisWithConstructor obj=new ThisWithConstructor();
	//ThisWithConstructor obj1= new ThisWithConstructor("Hello");
	ThisWithConstructor obj2=new ThisWithConstructor("Hello","Bye");
	/*1.I am inside constructor with no parameters
	 * 2.I have no parameter
     * 3.I am inside with constructor with one parameter
     * 4.I have one parameter Hello
     * 5.I am inside constructor with two parameters
     * 6.I have two parameters Hello Bye
	 */
}
}
