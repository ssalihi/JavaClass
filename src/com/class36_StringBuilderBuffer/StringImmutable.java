package com.class36_StringBuilderBuffer;

public class StringImmutable {

	public static void main(String[] args) {
		// There is two to create String 
		//1. Using String Literal 
		String str="Hello";
		//2. using new keyword by creating an object
		String str1=new String("str");
		
		str=str.toUpperCase();
		str=str.replace("O", "a");
		System.out.println(str);// HELLa

	}

}
