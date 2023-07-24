package org.arrayproblems;

//Find the missing number in an array of consecutive numbers
public class FindMissingNumber {

	public static int MissingNumber(int[] arr, int size) {
		int sum1 = ((size)*(size+1))/2;
		int sum2 = 0;
		for(int i=0; i<size-1; i++)
			sum2 += arr[i];
		return sum1-sum2;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,7,8};
		
		System.out.println(MissingNumber(arr,arr.length));
	}

}
