package com.class27_Abstract;

public class ChildSuper extends MainSuper {

		 String name="boy";
		 boolean lettuce=false;
		 char grade='A';

		 void print() {
		     System.out.println(super.name+" "+super.lettuce+" "+super.grade);
		     System.out.println(name+" "+lettuce+" "+grade);

		 }
		 ChildSuper(String a) {
		     super(a);
		     System.out.println("a child with 1 parameter " + a);
		 }

		 ChildSuper(String a, String b) {
		     //super(a, b);
		     System.out.println("a child with 1 parameter " + b);
		 }
		 public static void main(String[] args) {

		     ChildSuper obj = new ChildSuper("hello", "bye");
		     System.out.println("--------------------------------");
		     obj.print();
		     //ChildSuper obj1 = new ChildSuper("yes");
		 }
}
