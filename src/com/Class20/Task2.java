package com.Class20;

public class Task2 {

	public static void main(String[] args) {
		Task2 obj=new Task2();
		obj.palidrome("mom");
		
	}
public String palidrome (String name) {
	String reverse="";
	for (int a=name.length()-1; a>=0; a--) {
	   reverse=reverse+name.charAt(a);
	}
	if (name.equalsIgnoreCase(reverse)) {
		System.out.println(name+" is palidrom");
	}else {
		System.out.println(name+" is not palidrom");
	}
	return reverse;
}
}
