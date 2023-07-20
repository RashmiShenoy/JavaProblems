package org.math;

//Get the sum of 4 largest integers of array
public class FindFourLargest {

	public static void main(String[] args) {
		int[] arr = { 4, 5, -2, 3, 1, 2, 6, 6 };
		int size = arr.length;
				
		int[] sortarr = LargestFour(arr);	
		for (int i = 0; i < size ; i++)
			System.out.print(sortarr[i] + ",");

		System.out.println("\n");
		int sum = 0;
		
		//test
		//total = size = 8, 4th largest = arr[4] arr[5] arr[6] arr[7]
		System.out.println(sortarr[size-1]);
		//sum = (arr[size-4] + arr[size-3] + arr[size-2] + arr[size-1]);
		for (int i = 1; i <= 4; i++) {
			sum += sortarr[size - i];
			System.out.println(sum);
		}
		System.out.println("Sum of 4 largest integers " + sum);

	}

	public static int[] LargestFour(int[] arr) {
		int size = arr.length;
		int temp;
		// Find 4 largest in array
		for (int i = 0; i <= size - 1; i++) {
			for (int j = i; j <= size - 1; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}
