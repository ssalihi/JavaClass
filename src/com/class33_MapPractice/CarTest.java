package com.class33_MapPractice;
import java.util.*;
public class CarTest {

	public static void main(String[] args) {
		// will create a map in which we will store the carNumber and car object 
		Car obj1=new Car("Toyota", "Corolla");
		Car obj2=new Car("Honda", "Accord");
		Car obj3=new Car("Lada", "Prior");
		obj1.printCarDetail();
        obj2.printCarDetail();
        obj3.printCarDetail();
        System.out.println("----------------------------------------------------Maping");
        Map<Integer, Car> carMap=new HashMap<>();
        //carMap.put(1, obj1) ;
        //carMap.put(2, obj2);
       // carMap.put(3, obj3);
        carMap.put(1,new Car("BMW", "x*"));
        carMap.put(2, new Car("Audi","R8"));
        carMap.put(3, new Car("Mercedez", "cls"));
        
        Collection<Car> carValues=carMap.values();
       for (Car car:carValues) {
    	   car.printCarDetail();
       }
	}


}
