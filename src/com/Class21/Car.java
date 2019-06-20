package com.Class21;

public class Car {
    public String color;//null by default Value of string is null
    public static int totalCars;//0+1=1+2=3
    
	public static void main(String[] args) {
		Car car1=new Car();
		car1.color="White";
		
		totalCars++;
		
		Car car2=new Car();
		car2.color="Block";
		totalCars++;
		
		Car car3=new Car ();
		car3.color="Blue";
		totalCars++;
		
		Car car4=new Car();
		 car3.color="Red";
		 totalCars++;
		 
		
		
       System.out.println("Total cars we made are "+totalCars);
	}

}
