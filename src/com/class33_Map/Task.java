package com.class33_Map;

import java.util.*;

public class Task {

	public static void main(String[] args) {
		/*Create a map of a building. Store floor number and it is associated company name. 
		 * (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
   Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map
		 * 
		 */
Map<Integer, String> map=new HashMap<>();
map.put(1, "Google");
map.put(2, "Syntax");
map.put(3, "Twitter");
map.put(4, "CGI");
map.put(5, "Samsung");
map.put(6, "Nokia");
map.put(7, "Voda");
map.put(4, "Mictorsoft");
map.put(3, "Orcle");
map.put(2, "Facebook");
System.out.println(map);
System.out.println(map.size());
map.replace(4, "ITtechnology");
System.out.println(map);
map.remove(7);
System.out.println(map);
map.put(6, "Facebook");
System.out.println(map);
map.put(5, "Iphone");
System.out.println(map);
System.out.println(map.size());


	}

}
