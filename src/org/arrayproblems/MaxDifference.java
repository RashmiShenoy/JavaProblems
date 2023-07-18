package org.arrayproblems;


//Given an array arr[] of integers, find out the maximum difference 
//between any two elements such that larger element appears after the smaller number.

public class MaxDifference {
	public static void main(String[] args) {
		int arr[] = {2, 3, 10, 6, 4, 8, 102};
		int temp=0;
		//iterate twice and move smaller to left
		//minus first index and last index digit so largest-smallest
		
		
		for (int i=0; i< (arr.length-1); i++) {
			for (int j=(i+1); j<arr.length; j++) {
				if(arr[i]>arr[j])
				{
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				}
			}
		}
		System.out.println("Sorted array is :");
		
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		
		System.out.println("\n");
		
		int n = 0;
		int size = arr.length;
		int diff = arr[size-1] - arr[n];
		System.out.println("Difference between smallest : " + arr[n] + " and largest element : " + arr[size -1] + " is = " + diff);
	}
}
