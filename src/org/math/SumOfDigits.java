package org.math;

//Calculate the sum of digits in a number.
public class SumOfDigits {

	public static void main(String[] args) {
		int num = 3984;
		int digit, sum = 0;
		while(num > 0) {
			digit = num % 10;
			sum += digit;
			num = num/10;
		}
		System.out.println(sum);
	}
}
