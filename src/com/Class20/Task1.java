package com.Class20;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Create a method that will take 1 parameter as as string and return reversed String.
		 * Method should visibiy wihting same package.
		 */
		Task1 obj=new Task1();
		String a=obj.stringName("sekander");
System.out.println(a);// we have the value and need to print to it

        obj.isPalidrom("mom");
        
System.out.println(obj.isPalidrom("hello"));
System.out.println("-------------------------------------------------------------------2nd task");
        String []array= obj.getWordFromString("Have a good night student");
         for (int i=0; i<array.length; i++) {
        	 System.out.println(array[i]);
         }
         System.out.println("----------------------------------------------enhave loop");
         for (String word:array) {// enhance loop
        	 System.out.println(word);
         }
	}
	protected String stringName (String name) {
		String reverse="";
		for (int a=name.length()-1; a>=0; a--) {
			reverse=reverse+name.charAt(a);
		}
		return reverse;
	}
	/*
	 * Create a method that will take a String and return whether String is palidrom or Not
	 * Method should availble to all classes within your project
	 */
	public boolean isPalidrom(String name) {
		boolean flag=false;
		String reverse="";
		for (int a=name.length()-1; a>=0; a--) {
			reverse=reverse+name.charAt(a);
	}
		if (reverse.equalsIgnoreCase(name)) {
			flag= true;
} 
	return flag;

}
	/*
	 * create a method that will take string and return a array of word form that string.
	 * method should be available to only within same class
	 * 
	 */
	private String [] getWordFromString(String str) {
		String []array=str.split(" ");
		return array;
	}
}
