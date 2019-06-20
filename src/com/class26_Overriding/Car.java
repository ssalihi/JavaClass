package com.class26_Overriding;

public class Car {
public void drive() {
	System.out.println("Car drives");
}
public void drive (int speed) {// parent method is overloading within same class by changing of parameter
	System.out.println("Car drives with speed"+speed);
}
}
class BMW extends Car{
	public void drive () {
		System.out.println("BMW drives fast");
	}
}
class Toyota extends Car{
	public void drive () {
		System.out.println("totyota drive safely");
		
	}
}