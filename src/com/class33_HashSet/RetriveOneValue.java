package com.class33_HashSet;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RetriveOneValue {

	public static void main(String[] args) {
		Set<String> car=new LinkedHashSet<>();
		car.add("Toyota");
		car.add("Honda");
		car.add("Audi");
		car.add("BMW");
		car.add("Ford");
		// 1.Way we convert to arraylist(a. to add collection name)
		System.out.println("------------------------------------------------------1st way converting to arraylist");
		List <String> list=new ArrayList<>(car);// we have only one collection and that is car
		System.out.println("List of collection "+list);
		System.out.println(list.get(2));
		//b.-
		List <String > list2=new ArrayList<>();
		list2.addAll(car);
		System.out.println("list2 collection "+list2);
		//2. way convert to array
		System.out.println("------------------------------------------------------2nd way converting to array");
		Object[] array=car.toArray();
System.out.println(array[1]);
	}

}
