package org.arrayproblems;

public class FindRepeatElement {
	public static void main(String[] args) {
		FindRepeatElement rep = new FindRepeatElement();
		int arr[]= {4, 2, 4, 5, 2, 3, 1};
		int arr_size = arr.length;
		rep.printRepeat(arr, arr_size);
	}
	
	void printRepeat(int arr[], int size) {
		int i,j;
		System.out.print("Repeating elements are : ");
		for(i=0; i< size -1; i++) {
			for(j=i+1; j< size; j++) {
				if(arr[i]==arr[j])
					System.out.print(arr[i]+" ");
			}
		}
	}
}
