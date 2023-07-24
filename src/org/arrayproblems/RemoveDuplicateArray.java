package org.arrayproblems;

import java.util.Arrays;

public class RemoveDuplicateArray {

	public static void main(String[] args) {
		int[] arr = {1,3,2,3,2,32,12};
		int n = arr.length;
		int[] newarr = new int[arr.length];
		int j=0;
		
		Arrays.sort(arr);
		
		for (int i=0; i<n-1; i++) {
			if(arr[i] != arr[i+1]) {
				newarr[j++] = arr[i];
			}
		}
		newarr[j++] = arr[n-1];
		
		for(int k=0; k<j; k++) {
			System.out.print(newarr[k] + " ");
		}
	}
}
