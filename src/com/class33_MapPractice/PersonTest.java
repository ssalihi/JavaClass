package com.class33_MapPractice;
import java.util.*;

public class PersonTest {

	public static void main(String[] args) {
		//Person p4=new Person("Sekander", "Salihi", 34, 60);
		//p4.userDetials();
		Map<Integer, Person> personMap=new HashMap<>();
		personMap.put(101, new Person("Omar", "Aytekin", 25,60));
		personMap.put(102, new Person("Sekander", "Salihi", 34, 55));
		//personMap.put(103, p4);
		Collection<Person> person=personMap.values();
		for (Person per:person) {
			per.userDetials();
		}

	}

}
