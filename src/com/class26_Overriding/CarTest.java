package com.class26_Overriding;

public class CarTest {

	public static void main(String[] args) {
		Car car1=new BMW();// runtime polymorphism method creating of object of child class reference to the object of parent class
		car1.drive();//BMW drives fast will be executing
        
		Car car2=new Toyota();// runtime polymorphism method creating of object of child class reference to the object of parent class
		car2.drive();
		
	}

}
