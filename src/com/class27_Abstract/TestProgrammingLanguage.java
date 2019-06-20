package com.class27_Abstract;

public class TestProgrammingLanguage {

	public static void main(String[] args) {
		ProgrammingLanguage obj1=new Java();
		obj1.understandLogic();
		obj1.knowSyntax();
		obj1.debug();
		obj1.writeCode();
		System.out.println("--------------------------------------------------------------------behavior of Csharp");
		
		ProgrammingLanguage obj2=new CSharp();
		obj2.understandLogic();
		obj2.knowSyntax();
		obj2.debug();
		obj2.writeCode();

	}

}
