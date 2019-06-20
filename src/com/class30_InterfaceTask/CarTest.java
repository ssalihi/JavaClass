package com.class30_InterfaceTask;

public class CarTest {

	public static void main(String[] args) {
		
		Car car;
		
		car =new Sedan("blue", 25000, 3000);
		double carPrice=car.calculateSalePrice();
		System.out.println("the price of sedan is "+carPrice);
		
		car =new Truck(2000, "Red", 3000);
		double carPrice1=car.calculateSalePrice();
		System.out.println("the price of truck is "+carPrice1);
	}
}