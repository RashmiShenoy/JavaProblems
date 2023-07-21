package org.algorithms;

public class NumerPalindrome {

	public static void main(String[] args) {
		int num = 3553;
		int temp = 0;
		int remainder;
		int orignum = num;
		
		while(num!=0) {
			remainder = num % 10;
			temp = (temp * 10) + remainder;
			num = num / 10;
		}
		
		if (orignum == temp) {
			System.out.println("Num is palindrome");
		}
		else
			System.out.println("Num not palindrome");
	}

}
