package com.class33_MapPractice;
import java.util.*;

public class MapReview {
//Create a map of grocery products and it is quantity
	public static void main(String[] args) {
		Map<String, Integer> groceryMap=new LinkedHashMap<>();
		groceryMap.put("Milk", 1);
		groceryMap.put("Breads",2);
		groceryMap.put("Egg", 12);
		groceryMap.put("Coffe",2);
		groceryMap.put("Potato", 2);
		groceryMap.put("Cookies",3);
		System.out.println(groceryMap);
		groceryMap.put("Cheese", 1);
		System.out.println(groceryMap.size());
		
		groceryMap.replace("Egg", 18);
		System.out.println(groceryMap.containsKey("Milk"));
		System.out.println(groceryMap);
		groceryMap.remove("Cheese");
		//Retrieving all keys+values using ketSet();
		Set<String> keyset=groceryMap.keySet();
		for (String key:keyset) {
			System.out.println("Key is "+key+" And values are "+groceryMap.get(key));
		}
		System.out.println("-----------------------------------------Iterator");
		Iterator<String> keyIt=keyset.iterator();
		while(keyIt.hasNext()) {
			String key=keyIt.next();
			System.out.println(key+":"+groceryMap.get(key));
		}
		System.out.println("--------------------------------------------------2nd way");
		for (String key:groceryMap.keySet()) {
			System.out.println("Key is "+key+" And values are "+groceryMap.get(key));
		}
		System.out.println("-----------------------------------------2nd way iterator");
		Iterator<String> KeyIt=groceryMap.keySet().iterator();
		while(keyIt.hasNext()) {
			String key=keyIt.next();
			System.out.println(key+":"+groceryMap.get(key));
		}
		//Retreiving all values using:
		Collection<Integer> val=groceryMap.values();
		for (Integer value:val) {
			System.out.print(value+" ");
		}
       System.out.println("------------------------------other way");
       for (Integer value:groceryMap.values()) {
    	   System.out.print(value+" ");
       }
       System.out.println("------------------------------------------iterator");
       Iterator<Integer> valIt=groceryMap.values().iterator();
       while(valIt.hasNext()) {
    	   System.out.println(valIt.next()+" ");
       }
       //retrieving all keys+values using entryset();
       System.out.println("-----------------------retrieving all keys+values using entryset();");
      // Set<Map.Entry<String, Integer>> setOfEntries=groceryMap.entrySet();
       for (Map.Entry<String, Integer>entry:groceryMap.entrySet()){
    	   String a=entry.getKey()+entry.getValue();
    	  
    	   System.out.println(a);
    	   
    	   System.out.println(entry.getKey()+":"+entry.getValue());
       }
       System.out.println("-------------------------iterator");
       Iterator<Map.Entry<String, Integer>> it= groceryMap.entrySet().iterator();
       while(it.hasNext()) {
    	 Map.Entry<String, Integer> entery=it.next();
    	 String b=entery.getKey()+" and value is "+entery.getValue();
    	 System.out.println(b);
       }
   }

}
