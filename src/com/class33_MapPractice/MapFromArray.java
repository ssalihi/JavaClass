package com.class33_MapPractice;
import java.util.*;
public class MapFromArray {

	public static void main(String[] args) {
		                  // 1           2         3             4         5
		String [] names= {"Sekander", "Abasin","ShahMahmood", "Muqader", "Bila"};
		Map<Integer, String> nameMap=new LinkedHashMap<>();
		//getting the name of map
		int key=1;
		for (String name:names) {
			nameMap.put(key, name);
			key++;
			
		}
System.out.println(nameMap);
//print key and values using entryset by using loop and iterator
Iterator<Map.Entry<Integer, String>> entry=nameMap.entrySet().iterator();
while(entry.hasNext()) {
	Map.Entry<Integer, String> it=entry.next();
	String a=it.getKey()+" and value"+it.getValue();
	System.out.println(it);
			
}
for (Map.Entry<Integer, String> entrey:nameMap.entrySet()){
	String c=entrey.getKey()+"="+entrey.getValue();
	System.out.println(c);
}
	}

}
