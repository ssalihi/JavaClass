package com.Class17_2;

import com.Class17.Calculator;

public class Application {
public static void main(String[] args) {
	//ScannerMethod obj=new ScannerMethod();
	//Calculator operation =new Calculator();
	//int x=10, y=100;
	//int d=operation.sum(x, y);
     //System.out.println(d);
	Application app=new Application();
	char a=app.example5('B');
	app.example();
	app.example2(null);
	
	System.out.println(a);
}
void example () {
	System.out.println("No return value and no parameters");
}
void example2(String name) {
	System.out.println("No return value but with parameter:"+name);
}
boolean example3 () {
	System.out.println("with return value and no parameters");
	return true;
}
String example4(String name) {
	System.out.println("No return value but with parameter:"+name);
	return name;
}

char example5(char name) {
		System.out.println("No return value but with parameter:"+name);
		return name;
}
long example6(char name) {
	System.out.println("No return value but with parameter:"+name);
	return name;
}
}
