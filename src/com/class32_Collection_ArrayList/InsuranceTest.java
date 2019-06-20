package com.class32_Collection_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;



public class InsuranceTest {

	public static void main(String[] args) {
		Car car=new Car("Geico", "Toyota");
		Pet pet=new Pet("United Health", "Dog");
		Health health= new Health("Kaiser");
		
		ArrayList<Insurance> insur=new ArrayList<>();
		insur.add(car);
		insur.add(pet);
		insur.add(health);
		System.out.println("----------------------------------------------------");
		 for (Insurance in:insur) {
			 System.out.println(in.insuranceName);
			
			 in.getQuote();
		 }
		 System.out.println("--------------------------------------------");
		 Iterator <Insurance> myInsurnace=insur.iterator();
		 while(myInsurnace.hasNext()) {
			 Insurance object=myInsurnace.next();
			 object.cancelInsurance();
			 
		 }
		 System.out.println("-------------------------------------------");
		 for (int i=0; i<insur.size(); i++) {
			 Insurance obj1=insur.get(i);
			
			 obj1.getQuote();
		 }
		 
	}

}
