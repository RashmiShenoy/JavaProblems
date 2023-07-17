package org.math;

public class MoveNegativeNum {
	public static void main(String[] args) {
		int a[]= {-1,-20, 30, 40, 50, -8};
		int newarr[]=new int[a.length];
		
		rearrange(a, newarr);
		
		print(newarr);
	}

	private static void rearrange(int[] a, int[] newarr) {
		int j=0;
		//Moving only negative num to new array
		for(int i=0; i<a.length; i++) {
			if(a[i]<0) {
				newarr[i]=a[i];
				j++;
			}
		}
		
		//Move positive num after negative num by using j's position above
		for(int i=0; i<a.length; i++) {
			if(a[i]>0) {
				newarr[j]=a[i];
				j++;
			}
		}
	}
	
	private static void print(int[] newarr) {
		for (int n=0; n<newarr.length-1; n++) {
			System.out.print(newarr[n]);
			System.out.print(",");
		}
		
	}

}
