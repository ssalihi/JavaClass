package pack1;

public class Application1 {
public static void main(String[] args) {
	Animal dog=new Animal();// dog is local variable or instance or our object name
	
	System.out.println("---------------------------------------This dog");
	
	System.out.println(dog.age);
	System.out.println(dog.weight);
	System.out.println(dog.breed);
	System.out.println(dog.name);
	dog.canBark();
	
	
	dog.name="Joe";// we static in Animal class
	dog.age=40;// we static in Animal class
	System.out.println(dog.age);
	
	
	Animal dog2=new Animal();
	
	System.out.println("---------------------------------------This dog2");
	
	System.out.println(dog2.age);
	System.out.println(dog2.weight);
	System.out.println(dog2.breed);
	System.out.println(dog2.name);
	
	Animal dog3=new Animal();
	
	System.out.println("---------------------------------------This dog3");
	
	System.out.println(dog3.age);
	System.out.println(dog3.weight);
	System.out.println(dog3.breed);
	System.out.println(dog3.name);
	
	int my_array[] = {1,2,3,4,5,6,7,8,9,10};
 int[] array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
	System.out.println("Printing the minumum values");
	System.out.println(Minimum.minOfValues(my_array));
	System.out.println(Minimum.maxOfValues(my_array));
	Minimum.minOfValues(my_array);
}
}
