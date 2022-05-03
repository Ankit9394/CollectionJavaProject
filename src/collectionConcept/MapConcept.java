package collectionConcept;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapConcept {
	public static void main(String[] args) {
		/*
		 Using HashMap makes sense only when unique keys are available for the data we want to store. 
		 We should use it when searching for items based on a key and quick access time is
		  an important requirement
		  The reason that HashMap is faster than HashSet is that the HashMap uses the unique keys to 
		  access the values
		*/
		Map<String, Integer> map= new HashMap<>();
		
		map.put("Ankit", 10);
		map.put("Dipali", 20);
		map.put("Bhargav", 30);
		
		
		
		//map.put("Ankit", 40);
		System.out.println(map);
		System.out.println(map.containsKey("Ankit"));
		System.out.println(map.isEmpty());
		System.out.println(map.keySet());
	}

}
