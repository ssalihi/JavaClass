package com.class33_HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetOverview {

	public static void main(String[] args) {
		Set <String> classDays=new LinkedHashSet<String>();//if we add linked we will get all elements in order
		classDays.add("Tuesday");
		classDays.add("Wednesday");
		classDays.add("Thurday");
		classDays.add("Saturday");
		classDays.add("Sunday");
		
		System.out.println(classDays);
		System.out.println("-------------------------------------------------------------advance loop");
		for (String day:classDays) {
			System.out.print(day);
		}
		System.out.println("--------------------------Iterator");
		
Iterator <String> days=classDays.iterator();
while(days.hasNext()) {
	System.out.print(days.next());
}

	}

}
