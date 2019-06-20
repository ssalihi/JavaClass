package com.Class23;

public class Employee {
	public static String department="IT";
 int salary;//default object
 protected int salary1;//protected object
public void getPaid() {
	System.out.println("Employees get's paid "+salary);
}
public static void work() {
	System.out.println("Employee works in "+department+" department");
}
}
