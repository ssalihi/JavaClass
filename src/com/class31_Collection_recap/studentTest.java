package com.class31_Collection_recap;

import java.util.ArrayList;

public class studentTest {

	public static void main(String[] args) {
		Student st1=new Student("john", 1);
		Student st2=new Student("a", 2);
		Student st3=new Student("c", 3);
		Student st4=new Student("j", 4);
		
		ArrayList<Student> alist=new ArrayList<>();
		alist.add(st1);
		alist.add(st2);
		alist.add(st3);
		alist.add(st4);
		
		for (Student student: alist) {
			//student.printstudenDetial();
			System.out.println(student.name);
		}


	}

}
