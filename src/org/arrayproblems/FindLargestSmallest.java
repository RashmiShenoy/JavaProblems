package org.arrayproblems;

//To find largest, smallest, second largest, second smallest in an array

public class FindLargestSmallest {
	public static void main(String[] args) {
		int arr[] = { 3, 6, 67, 8, 99, 22 };
		int size = arr.length;
		int temp = 0;
		System.out.println("Sorted array is : ");
		for (int i = 0; i < (arr.length - 1); i++) {
			for (int j = (i + 1); j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			System.out.print(" ");
		}
		System.out.println("\n");
		System.out.println("Smallest element is : " + (arr[0]));
		System.out.println("Second largest element is : " + (arr[size - 2]));
		System.out.println("Largest element is : " + (arr[size - 1]));
	}
	
	

}
