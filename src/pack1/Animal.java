package pack1;

public class Animal {
/*
 * Create a class Animal have properties like breed, weight, age name and method line canBrak, isWild
 * Make the name variable static
 * Create another class called application 
 * from this application class create 3 instances/object of it and print the properties and functions/methods
 */
	String breed="Husky";
	int weight=100;
    static int age=15;
	static String name="George";
	
	boolean canBark () {
		return true;
	}
	boolean isWild() {
		return true;
	}
}
