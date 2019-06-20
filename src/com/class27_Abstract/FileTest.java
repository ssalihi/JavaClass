package com.class27_Abstract;

public class FileTest {

	public static void main(String[] args) {
		JavaFile obj1= new JavaFile();
		obj1.close();
		obj1.edit();
		obj1.open();
		
		System.out.println("----------------------------------------------PDF file");
		File obj2=new PDFFile();
		obj2.close();
		obj2.edit();
		obj2.open();
		
		System.out.println("-----------------------------------------------Word File");
		File obj3= new WordFile();
		obj3.close();
		obj3.edit();
		obj3.open();
	

	}

}
