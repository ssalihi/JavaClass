package com.class31_Collection_recap;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {

	public static void main(String[] args) {
		/*Create an arraylist of cars and retrieve all the values using 4 different ways.
		 * 
		 */
		ArrayList<String> cars=new ArrayList<String>();
		cars.add("Tesla");
		cars.add("Toyota");
		cars.add("Benz");
		cars.add("Honda");
		
	
		System.out.println("-------------------------for loop");
		
		for (int i=0; i<cars.size(); i++) {
			String car=cars.get(i);
			System.out.println(car);
		}
		System.out.println("-----------------------------------Advace loop");
		
		for (Object car: cars) {
			
		}
		System.out.println(cars);
		System.out.println("---------------------------3. way using advance iterator");
		Iterator ca=cars.iterator();
		while(ca.hasNext()) {
			System.out.println(ca.next());
		}
		System.out.println("---------------------------4. way while loop");
		int a=0;
		while(cars.size()>a) {
			String myCar=cars.get(a);
			System.out.println(myCar);
			a++;
			
		}
	}

}
