package org.arrayproblems;

public class RotateArrayEasy {
	public static void main(String[] args) {
		int[] nums = {10,4,55,2,3,4,34};
		int k = 3;
		for(int i=1; i<=k; i++) {
			leftSwapOfElement(nums);
		}
		for(int j=0; j<nums.length; j++)
		System.out.print(nums[j]+ " ");
	}
	
	public static void leftSwapOfElement(int[] nums) {
		int temp = nums[0];
		for(int i=0; i< nums.length-1; i++) {
			nums[i] = nums[i+1];
		}
		nums[nums.length - 1] = temp;
	}
}
