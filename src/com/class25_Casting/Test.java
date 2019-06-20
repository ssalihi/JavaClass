package com.class25_Casting;

public class Test {
public static void main(String[] args) {
	Student stu=new SyntaxStudent();
	stu.study();
	stu.doHomeWork();
	stu.attendClass();
	//stu.doResearch(); Private members can never been inherited 
}
}
