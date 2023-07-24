package org.math;

//Swap two numbers without using a temporary variable.
public class SwapNumber {

	public static void main(String[] args) {
		int num1 = 5, num2 = 6;
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("After swapping " + "num1 is " + num1 + " num2 is " + num2);

	}

}
