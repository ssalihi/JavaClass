package com.class34_ExceptionIntro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
/*Create a static method that will return a List of Exceptions.
*Inside your method create objects of 4 exception classes and store them inside your list.
*Call your method inside main and print name and details of all Exception objects.
 * 
 */
    public static void list() {
        try {
            
    System.out.println(11/ 0);
            
        } catch (ArithmeticException e) {
            
            System.out.println(e);
            
            
    }
        try {
            Thread.sleep(2000);
        }
        catch(InterruptedException e) {
            System.out.println(e);
        }
        
        try {
            Thread.sleep(2000);
        }
        catch(InterruptedException e) {
            System.out.println(e);
        }
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter number");
        
        
        try {
            int num1=scan.nextInt();
            System.out.println(num1);
        }
        
        catch(InputMismatchException e) {
            System.out.println(e);
        

    }
        int[] array = { 1, 2, 3 };
        try {

            
            System.out.println(array[6]);}
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        
        Task2 play=new Task2();
        play.list();

    }

}

