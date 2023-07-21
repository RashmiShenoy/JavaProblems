package org.algorithms;

public class StringPalindrome {

	public static void main(String[] args) {
		String str = "Madam";
		String revstr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revstr = revstr + str.charAt(i);

		}

		if (str.toLowerCase().equals(revstr.toLowerCase())) {
			System.out.println("String is palindrome");
		} else
			System.out.println("String not palindrome");

	}

}
