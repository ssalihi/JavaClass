package com.class28_Abstract;

public class VehicleTest {

	public static void main(String[] args) {
		Car car=new BMW("BMW");
		car.drive();
		car.start();
		car.stop();
		car.displayToyotaVehicles();
		System.out.println("Total number of vehicle ="+Vehicle.vehiclecount);
		//System.out.println(car.vehiclecount);// when there is not static for variable
		System.out.println("------------------------------------------------");
		new BMW("BMW");
		new Toyota("RA4");
		BMW.displayToyotaVehicles();
		
		System.out.println("Total number of vehicle ="+Vehicle.vehiclecount);

	}

}
