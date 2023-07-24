package org.math;

//Write a program to find the sum of all prime numbers within a given range 
public class PrimeNumber {
	public static void main(String[] args) {
		int num = 23;
		for (int i=0; i<=num; i++ ) {
			if((i % 2) !=0) {
				System.out.print(i + " ");
			}
		}
	}
}
