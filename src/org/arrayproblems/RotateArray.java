package org.arrayproblems;

//Rotate an array to the right by a given number of steps
public class RotateArray {

	public static void main(String[] args) {
		int[] arr = {4,5,6,7,8};
		int j, last = 0;		
		
		//last = arr[4] = 8
		for(int i=0; i<arr.length-1; i++) {
			last = arr[arr.length-1];
		}
		
		//start iterating from last arr[4] = arr[3] = 7 and continue till all are assigned
		//shift elements to right
		for(j = arr.length-1; j > 0; j--) {
			arr[j] = arr[j-1];
		}
		
		//assign last element to first of array
		arr[0] = last;
		
		for(int i=0; i<arr.length; i++)
		System.out.print(arr[i] + " ");
	}

}
