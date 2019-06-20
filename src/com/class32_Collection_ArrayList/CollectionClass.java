package com.class32_Collection_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionClass {

	public static void main(String[] args) {
		ArrayList<Integer> intergerList=new ArrayList<>();
		intergerList.add(90);
		intergerList.add(33);
		intergerList.add(56);
		intergerList.add(100);
		System.out.println("Collection before soring "+intergerList);
	Collections.sort(intergerList);//class that works with collections(List)
	System.out.println("Collection after sorting "+intergerList);
		
int [] intarray= {12,57,97799,1,0,-123,-3};
Arrays.sort(intarray);//This class contains various method for m
for (int num: intarray) {
	System.out.print(num+" ");
}

	}

}
