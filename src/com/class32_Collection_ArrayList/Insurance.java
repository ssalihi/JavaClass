package com.class32_Collection_ArrayList;

public abstract class Insurance {
	/*Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote 
	 * and cancelInsurance. Create 3 subclasses Car, Pet, Health.
	 *  Car class has it’s own attribute as carModel and Class Pet has petType attribute.
       * Create 3 objects of the sub classes and store them in ArrayList. 
	 * Using 1 reference variable access methods from different classes.
	 */
public String insuranceName;
public Insurance(String insuranceName) {
this.insuranceName=insuranceName;
}
public abstract void getQuote();
public abstract void cancelInsurance();

}
class Car extends Insurance{
	public String model;

	public Car(String insuranceName, String model) {
		super(insuranceName);
		this.model=model;
		
	}

	@Override
	public void getQuote() {
		System.out.println("I got the qouation for my " + model+ " car from "+insuranceName);
		
	}

	@Override
	public void cancelInsurance() {
		System.out.println("I cancel insurance of my  "+model+" from  "+insuranceName);
		
	}
	
}
class Pet extends Insurance{
	public String petName;

	public Pet(String insuranceName, String petName) {
		super(insuranceName);
		this.petName=petName;
		
	}

	@Override
	public void getQuote() {
		System.out.println("I got the qouation for my pet from "+insuranceName);
		
	}

	@Override
	public void cancelInsurance() {
		System.out.println("I cancel my pet insurance from "+insuranceName);
		
	}
	
}
class Health extends Insurance{

	public Health(String insuranceName) {
		super(insuranceName);
		
	}

	@Override
	public void getQuote() {
		System.out.println("I got the qouation for my Heath from "+insuranceName);
		
	}

	@Override
	public void cancelInsurance() {
		System.out.println("I cancel my Health insurance from "+insuranceName);
		
	}
	
}
