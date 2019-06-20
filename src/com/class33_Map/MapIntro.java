package com.class33_Map;


import java.util.*;

public class MapIntro {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<>();
		map.put(101, "John");
		map.put(102,"Jane");
		map.put(103, "Kate");
		map.put(104,"James");
		System.out.println("-----------------------------------how to retreive or access value or key");
		System.out.println(map);
		System.out.println(map.get(102));// base on key values not index
		System.out.println("-----------------------------------how to check the size of map");
		System.out.println(map.size());//4
		System.out.println("-----------------------------------how to update values or keys");
		map.replace(103, "Sekander");
		System.out.println(map.get(103));//Sekander
		System.out.println("-----------------------------------how to remove key/value");
		map.remove(104);//Will remove james
		map.remove("James");
		System.out.println(map.size());//3
		System.out.println("-----------------------------------how to check if there are any values in the map");
		System.out.println(map.isEmpty());//false
		System.out.println("-------------------how to check if specific key/value is there or not");
		System.out.println(map.containsValue("Sekander"));//
		System.out.println("---------------------------map can store duplicated value but not key ");
		map.put(105, "Jane");
		map.put(101, "A");
		System.out.println(map);
		map.put(101, "Ahamd");
		System.out.println(map);
		System.out.println("----------------adding null ket with some value");
		map.put(null, "Some value");
		System.out.println(map);
		System.out.println("-------------------------------------------------Adding null key with null value");
		map.put(null, null);
		System.out.println(map);
		
		
		

	}

}
