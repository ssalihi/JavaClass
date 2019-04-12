package com.Class21;

public class InstanceVariables {
    String name="John";//this is instance variable 
    
	public static void main(String[] args) {
	String name="Anna";	//this local variable
    System.out.println(name);
    System.out.println("---------changing of local variable--------");
    name="Olga";
    System.out.println(name);
    //Creating object 1
    InstanceVariables obj=new InstanceVariables();// if we want of print the name john we have to create the object
    System.out.println(obj.name);//john;
    System.out.println("---------Changing value of instace value------------------");
    obj.name="Jack";
    System.out.println(obj.name);//Jack
    //Creating second object
    InstanceVariables obj1=new InstanceVariables();
    System.out.println(obj1.name);
	}
	

}
