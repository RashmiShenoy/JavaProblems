package org.arrayproblems;

import java.util.HashSet;
import java.util.Set;

//Find the common elements between two arrays
public class FindCommonBetweenTwoArray {

	public static void FindCommonElements(String[] arr1, String[] arr2) {
		Set<String> set = new HashSet<>();
		for (int i = 0; i < arr1.length - 1; i++) {
			for (int j = 0; j <= arr2.length - 1; j++) {
				if (arr1[i] == arr2[j]) {
					set.add(arr1[i]);
					break;
				}
			}
			for(String i1 : set) {
				System.out.print( i1 + " " );
			}
		}
	}
	
	public static void main(String[] args) {
		String[] arr1= { "Article", "in", "Geeks", "for", "Geeks" };
		String[] arr2 = { "Geeks", "for", "Geeks" };
		FindCommonElements(arr1,arr2);
	}
}
