package org.math;

public class ArmstrongNumSimple {
	/*
	 * 153 -> 1 5 3
	 * 1*1*1 + 5*5*5 + 3*3*3
	 * 1 + 125 + 27
	 * = 153
	 * 
	 * Input value * cube of individual digits gives back same input is called Armstrong number
	 * */
	
	public static void main (String[] args) {
		int n = 153;
		int temp = n;
		int r;
		int sum = 0;
		
		while(n>0) {
		r = n % 10; // to split numbers from original
		n = n/10;
		sum = sum + r * r * r;
		}
		
		if (temp == sum)
			System.out.println("Given number is Armstrong");
		else
			System.out.println("Not an Armstrong number");
	}

}
