package com.class27_Abstract;

public abstract class File {
	/*Create a class File that will have the following behaviors: 
	 * open, edit, close. Edit and close are implemented method while open is an abstract.
	 *  Create 3 subclasses: JavaFile, WordFile, PDFFile that will provide specific implementation of open behaviour: 
	 *  Exmaple: to open .java file we need notepad++ or sublime tex, to open .doc file we need Microsoft word to be installed
	 * 
	 */
public abstract void open();

	

public void edit() {
	System.out.println("you can edit file");
}
public void close() {
	System.out.println("you can close any file");
}
}
class JavaFile extends File{
	public void open() {
		System.out.println("you can read java file through Java");
		
	}
	
}
class WordFile extends File {
	public void open() {
		 System.out.println("you can see word file in word");	
		}
	
}
class PDFFile extends File{
	public void open () {
		System.out.println("you can see pdf in pdf");
	}
	public void print() {
		System.out.println("you can print");
	}
}	



