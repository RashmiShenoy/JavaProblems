package org.stringproblems;

import java.util.HashMap;

public class CountEachChar {
	public static void main(String[] args) {
		String str = "Rashmiiiiii";
		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
		
		for(int i = 0; i <=str.length()-1 ; i++) {
			//Put character and increment count if already present
			if(hashmap.containsKey(str.charAt(i))) {
				int count = hashmap.get(str.charAt(i));
				hashmap.put(str.charAt(i), ++count);
			}
			//If not present then add count as 1 initially
			else
			{
				hashmap.put(str.charAt(i), 1);
			}
		}
		System.out.println(hashmap);
	}

}
