package com.Class23;

public class ConstructorOverloading {
	ConstructorOverloading (){
		System.out.println("I am a constructor with no parameters");
	}
	ConstructorOverloading (String str) {
		System.out.println("I am constructor with on string parameter");
	}
	ConstructorOverloading(String str, String str2){
		System.out.println("I am a constructor with 2 string parameters");
	}
	ConstructorOverloading (int a){
		System.out.println("I am a constructor with one int parameters");
	}
}
