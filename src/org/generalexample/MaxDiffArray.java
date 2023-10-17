package org.generalexample;

import java.util.Arrays;

// Find maximum difference with input array as = [23,67,1,6,97,21,7]

public class MaxDiffArray {

	public static void main(String[] args) {
		int[] arr = {23,67,1,6,97,21,7};
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++)
		System.out.print(arr[i] + ",");
		System.out.println("\n");
		
		System.out.println("Maximum difference is " + ((arr[arr.length-1])-arr[0]));

	}

}
