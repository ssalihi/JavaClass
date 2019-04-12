package com.Class21;

public class LocalVariables {
// local variables only available within the method. 
	public static void main(String[] args) {
		String name="John";// stored the value
		System.out.println(name);
		LocalVariables obj=new LocalVariables();
		obj.hello(name);
		System.out.println(name);//John
	}
public void hello(String name) {
	name="Jack";
	System.out.println("hello "+name);// we can not have access to variable name1, because it inside of local main method,
}
}
