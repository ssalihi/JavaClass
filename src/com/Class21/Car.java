package com.Class21;

public class Car {
    public String color;//null by default Value of string is null
    public static int totalCars;//0
    
	public static void main(String[] args) {
		Car car1=new Car();
		car1.color="White";
		
		totalCars++;
		
		Car car2=new Car();
		car2.color="Block";
		totalCars++;
		
       System.out.println("Total car we made is "+totalCars);
	}

}
