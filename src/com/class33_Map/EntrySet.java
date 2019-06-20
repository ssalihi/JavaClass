package com.class33_Map;
import java.util.*;
public class EntrySet {

	public static void main(String[] args) {
		Map<String, Integer> classroom=new LinkedHashMap<>();
		classroom.put("Table", 20);// Entry<key, Value>
		classroom.put("Chairs", 60);//Entry<String, Integer>
		classroom.put("screen", 3);
		classroom.put("Student",60);
		classroom.put("Isntructor", 3);
		System.out.println(classroom);
       for( Map.Entry<String, Integer> entry:classroom.entrySet()){
    	   System.out.println(entry.getKey()+"="+entry.getValue());
       }
       System.out.println("----------------------------------------Iterator");
       Iterator <Map.Entry<String, Integer>> room=classroom.entrySet().iterator();
       while (room.hasNext()) {
    	   Map.Entry<String, Integer> entryset=room.next();
    	   System.out.println(entryset.getKey()+"="+entryset.getValue());
       }
	}

}
