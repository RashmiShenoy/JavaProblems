package org.math;

public class ArmstrongNumbers {
	public static void main(String[] args) {
		/*
		 * A positive integer of n digits is called an Armstrong number of order n
		 * (order is the number of digits) if. abcd… = pow(a,n) + pow(b,n) + pow(c,n) +
		 * pow(d,n) + ….
		 */

		ArmstrongNumbers ob = new ArmstrongNumbers();
		int x = 153;
		System.out.println(ob.isArmstrong(x));
		x = 1253;
		System.out.println(ob.isArmstrong(x));

	}

	int power(int x, int y) {
		if (y == 0)
			return 1;
		if (y % 2 == 0)
			return power(x, y / 2) * power(x, y / 2);
		return x * power(x, y / 2) * power(x, y / 2);
	}

	/* Function to calculate order of the number */
	int order(int x) {
		int n = 0;
		while (x != 0) {
			n++;
			x = x / 10;
		}
		return n;
	}

	// Function to check whether the given number is
	// Armstrong number or not

	boolean isArmstrong(int x) {
		// Calling order function
		int n = order(x);
		int temp = x, sum = 0;
		while (temp != 0) {
			int r = temp % 10;
			sum = sum + power(r, n);
			temp = temp / 10;
		}

		// If satisfies Armstrong condition
		return (sum == x);
	}
}
