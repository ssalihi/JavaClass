package com.Class22_Inheritance;

public class Child2 extends Parents {
	public static void main(String[] args) {
		
	
Child2 obj=new Child2();
System.out.println("Chil2 eye color is "+obj.eyeColor);
System.out.println("Chil2 hair color is "+obj.hairColor);
System.out.println("Chil2 has "+obj.nose+" nose");
obj.canSwim();
obj.playCricket();

Parents obj1= new Parents();

//obj1.playCricket(); not accessible 

}
	public void canSwim() {
		System.out.println("Child2 can swim");
	}
	public void playCricket() {
		System.out.println("Chil2 can play cricket");
	}
}

