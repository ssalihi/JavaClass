package com.class24_Overridding;

public class TestingParent {

	public static void main(String[] args) {
		String a;
		a="10";
		Parent parent=new Parent();
		parent.love();
		parent.work();

		System.out.println("-------------------------------child object");
		Child child=new Child();
		child.love();
		child.cry();
		child.work();
		System.out.println("-----------------------------------------------------type casting");
		Parent obj=new Child();// type casting
		//Child obj1=new Parent();//not possible because child object is smaller and we can not out in bigger (parent) object
		obj.love();//child loves parent
		obj.work();//parent work
		//obj.cry();// not accessible
		System.out.println("----------------------------------------------------------");
		Parent obj1= new grandChild();
		obj1.love();
				

	}

}
