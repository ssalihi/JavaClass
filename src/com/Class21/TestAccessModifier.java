package com.Class21;

import com.Class20.Task1;// importing the class

public class TestAccessModifier {

	public static void main(String[] args) {
		Task1 obj=new Task1();
		obj.isPalidrom("madam");//accessing public in different package
		System.out.println(obj.name3);// accessing public variable in different package 

	}

}
