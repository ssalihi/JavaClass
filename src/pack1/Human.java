package pack1;

public class Human {
	static String eyeColor="Brown";//instance variable
	int height=6;//instance variable
	int weight=180;//instance variable
	String gender="F";//instance variable
	
	String proL="Java";

	void speak() {
		
		String language="English";//Local variable is this 
		System.out.println("Human can speak ");
	}
	void coding () {
		System.out.println("syntax students can do coding "+proL);
	}
	void print () {
		System.out.println(eyeColor);
	}
	
}
