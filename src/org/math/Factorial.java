package org.math;

//Find the factorial of a given number.
public class Factorial {

	public static void main(String[] args) {
		//n! = n times n
		int num = 5;
		int fact = 1;
		for (int i=1; i<=5; i++) {
			fact = fact * i;
		}
		
		System.out.println(fact);
	}

}
