package com.class30_Collection;

import java.util.ArrayList;

public class ArrayListTypes {

	public static void main(String[] args) {
		//this is generic arraylist that stores only string object
		ArrayList<String> generic=new ArrayList<>();
		generic.add("Ahmad");
		generic.add("Salihi");
		generic.add("Farhan");
		generic.add("Bilal");
		generic.add("Abasin");
		//generic.add(123); not valid since we have generic arraylist of type of string
		for (String valu:generic) {
			System.out.println(valu);
		}
		System.out.println("-----------------------------------------------------------non-generic");
		
		//the below is non-generic object
		ArrayList alist=new ArrayList();
		alist.add("String");//Storing String
		alist.add(10);//Storing Integer
		alist.add('A');//Storing Character
		alist.add(100.5);//Storing double
		alist.add(true);//Storing boolean
		for (Object values:alist) {
			System.out.println(values);
		}
		ArrayList<Boolean> booleanArrayList=new ArrayList();
		booleanArrayList.add(true);
		booleanArrayList.add(false);
		
		System.out.println(booleanArrayList);
		System.out.println("------------------------------advance loop");
		for (Object val:booleanArrayList) {
			System.out.println(val);
		}
	}

}
