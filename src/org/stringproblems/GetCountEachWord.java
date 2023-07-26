package org.stringproblems;

import java.util.HashMap;

public class GetCountEachWord {

	public static void main(String[] args) {
		String str = "This is very very tall building";
		String[] arr = str.split(" ");
		
		HashMap<String, Integer> map = new HashMap<>();

		//First method
		for (String word : arr) {
			// Asking whether the HashMap contains the
			// key or not. Will return null if not.
			Integer integer = map.get(word);
			if (integer == null)
				// If not present put 1
				map.put(word, 1);
			else {
				// If already present increment
				map.put(word, integer + 1);
			}
		}
		System.out.println("First method : " + map);
	
		//Second method
		HashMap<String, Integer> map2 = new HashMap<>();
		for(String word: arr) {
			if(map2.containsKey(word))
				map2.put(word, map2.get(word)+1);
			else
				map2.put(word, 1);
		}
		
		System.out.println("Second method : " + map2);
	}

}
