package collectionConcept;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionSet {

	public static void main(String[] args) {
		//In Java, HashSet is commonly used if we have to access elements randomly.
		//It is because elements in a hash table are accessed using hash codes
		//null value not allowed
		//insertion order not followed
		Set<String> hashset= new HashSet<>();
		
		
		hashset.add("Ankit");
		hashset.add("Dipali");
		hashset.add("Bhargav");
		hashset.add("Win");
		hashset.add(null);
		hashset.add(null);
		
	
		System.out.println(hashset);
		System.out.println(hashset.size());
		
		for(String s: hashset) {
			System.out.println(s);
		}
	}

}
