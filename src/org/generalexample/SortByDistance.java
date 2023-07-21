package org.generalexample;

import java.util.LinkedHashMap;
import java.util.Map;

public class SortByDistance {

	public static void main(String[] args) {
		//Linked hashmap maintains order
		Map<String, Integer> hashmap = new LinkedHashMap<String, Integer>();

		hashmap.put("class1", 1);
		hashmap.put("class2", 12);
		hashmap.put("class3", 22);
		hashmap.put("class4", 39);

		boolean res = checkSort(hashmap);

		if (res == true)
			System.out.println("Given values are sorted");
		else
			System.out.println("Given values are not sorted");

	}

	public static boolean checkSort(Map<String, Integer> map) {
		int i = 0;
		int prev = 0;
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getValue());
			// Condition only once to get first value
			if (i == 0) {
				prev = entry.getValue();
				i = 1;
				continue;
			}
			// Compare if first is greater than second value then not sorted
			if (prev > entry.getValue()) {
				return false;
			}
			// Set the second value to prev and continue iteration
			prev = entry.getValue();
		}
		return true;
	}
}
