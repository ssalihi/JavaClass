package com.Class21;

public class Dog {

	
		static String breed="Husky";
		static int paws=4;
		String name;
		int weight;
		int heigth;
		public static void main(String[] args) {
			Dog dog1=new Dog();
			Dog dog2=new Dog();
			Dog dog3=new Dog();
			//dog1
			dog1.name="Mardy";
			dog1.weight=60;
			dog1.heigth=40;
			dog1.getDogProperties();
			//dog2
			breed="pug";
			dog2.name="Waffle";
			dog2.weight=100;
			dog2.heigth=90;
			dog2.getDogProperties();
			//dog3
			
			dog3.name="Lucy";
			dog3.weight=20;
			dog3.heigth=30;
			dog3.getDogProperties();
			// 3 ways of accessing of static variables
			//System.out.println(breed);// can access by its name
			//System.out.println(Dog.breed);// can access by it class name
			//System.out.println(dog3.breed);// can access by it object reference, but this not preffered 
		}
		public void getDogProperties() {
			System.out.println(name+" is a breed "+breed+" and weigth is "+weight+" and heigth is "+heigth);
		}

	}


