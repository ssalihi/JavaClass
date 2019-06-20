package com.class28_Abstract;

public abstract class Vehicle {// this partial abstraction becuase we have one method (stop method) with implementation
static int vehiclecount;
	// int vehiclecount;//if we remove static in test class we cannot call it through instance, in this case we need to class through 
    // its own object variable
	Vehicle(){
		vehiclecount++;
	}
//public static abstract void gps(){} // cannot have static abstract methods
//private abstract void speed(); // we cannot have private abstract methods
//public abstract final void break(); we cannot have abstract method as final	
public abstract void start();
public abstract void drive();
public void stop() {
	System.out.println("Stop vehicle by pressing break");
}
public static void displayToyotaVehicles() {
	System.out.println("Total vehicles we build ="+vehiclecount);
}
}
abstract class Car extends Vehicle{// if we do not want to have implementation we make it abstract (our child class
	/*Car(){---------->be default create a constructor and by default inside child constructor we call parent class constructor
	 * super(); added by default
	 * }
	 */
	public String make;//instance variable allowed in the abstract class
	Car(String make){
		this.make=make;
	}
	
}
class BMW extends Car{
	/*BMW(){---------->be default create a constructor and by default inside child constructor we call parent class constructor
	 * super(); added by default
	 * }
	 */
	BMW(String make){// we create constructor of BMW because we have parametrized constructor in Car parent class
		super(make);
	}

	@Override
	public void start() {
		System.out.println("BMW car starts with remote");	
	}

	@Override
	public void drive() {
		System.out.println("BMW car drives fast");	
	}
	
}
class Toyota extends Car{

	Toyota(String make) {
		super(make);
		
	}

	@Override
	public void start() {
		System.out.println("Toyota car push button");
		
	}

	@Override
	public void drive() {
		
		System.out.println("Toyota car drives safe");	
	}
	
}


