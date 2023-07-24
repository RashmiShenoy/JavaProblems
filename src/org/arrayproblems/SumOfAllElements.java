package org.arrayproblems;

//Find the sum of all elements in an array.
public class SumOfAllElements {

	public static void main(String[] args) {
		int[] arr = {1,3,3,4};
		
		int count = 0;
		for(int i=0; i<=arr.length-1; i++) {
			count += arr[i];
		}
		System.out.println(count);
	}
}
