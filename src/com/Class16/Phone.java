package com.Class16;

public class Phone {
String color, series,brand;
int memory, size;
boolean wifi;
public static void main(String[] args) {
	Phone iphone=new Phone();
	iphone.color="Golden";
	iphone.series="X Max";
	iphone.memory=32;
	iphone.size=8;
	iphone.wifi=true;
	iphone.brand="Apple";
	iphone.camera();
	iphone.batterylife();
	iphone.sound();
	
	///
	Phone galaxy=new Phone();
	galaxy.color="Black";
	galaxy.series="Note 9";
	galaxy.memory=32;
	galaxy.size=10;
	galaxy.wifi=true;
	galaxy.brand="Andriod";
	
	galaxy.camera();
	galaxy.batterylife();
	galaxy.sound();
	
}
void camera() {
	System.out.println(brand+ " has High quality pixel");
}
void sound() {
	System.out.println(brand+" has High quality sound");
}
void batterylife() {
System.out.println(brand+" has Long time of battery life");
}
}
