package com.Class16;

public class Car {
String make,model,color;
int door, wheels;
public static void main(String[] args) {// ctrl+space+Enter
	//ClassName variableName=new ClassName();
	// 1. Object:
	Car car1=new Car();//Car=Class Name, car1=VariableName, and new Car(); is creating an object
	car1.make="Honda";
	car1.model="Civic";
	car1.color="Black";
	car1.door=4;
	car1.wheels=4;
	// car honda has 4 wheels
	System.out.println("Car "+car1.make+" has "+car1.wheels+" wheels.");
    // define behavior
	car1.drive();
	car1.reverse();
	car1.stop();
	//2. Object:
	
	Car car2=new Car();
	car2.make="Tesla";
	car2.model="X";
	car2.color="Blue";
	car2.door=4;
	car2.wheels=4;
	//
	//My car is blue Tesla.
	System.out.println("My car is "+car2.color+" "+car2.make+".");
	// we can add more method under same class, but it should be out side of our main method
	}
void drive () {//these are behavior 
	System.out.println("Car can drive ");
}
void reverse() {//these are behavior
	System.out.println("Car can reverse");
}
void stop() {// these are behavior
	System.out.println("Car can stop");
}
}
