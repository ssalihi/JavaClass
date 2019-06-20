package com.class25_Casting;

public class SyntaxStudent extends Student{
	public void study() {
		 System.out.println("Syntax Students must study HARD");
	 }
	protected void doHomeWork() {
		 System.out.println("Syntax Students must do Repl");
	 }
	void attendClass(){
		System.out.println("Syntax Students must attend the ALL classes and takes notes"); 
	 }
	private void doResearch() {//private method cannot be overriding 
		 System.out.println("Syntax Students must do Google research");
	 }
}
