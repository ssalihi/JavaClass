package com.Class20;

public class TestAccessModifiers {

	public static void main(String[] args) {
		Task1 obj=new Task1();// we are creating the obj of task1 class here to have the access
        obj.isPalidrom("madam");// access public method within same package
        obj.stringName("hello");// accessing protected method
        System.out.println(obj.name1);//accessing default variable
        System.out.println(obj.name2);// accessing protected variable
        System.out.println(obj.name3);//accessing private variable
        //System.out.println(obj.name);// cannot have access to private variable
	}

}
