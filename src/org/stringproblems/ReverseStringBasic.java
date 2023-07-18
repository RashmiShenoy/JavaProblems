package org.stringproblems;

import java.util.Scanner;

public class ReverseStringBasic {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input the String to be reversed : ");
		
		String origstr = scanner.nextLine();
		scanner.close();
		
		String words[] = origstr.split("\\s");
		String revstr = "";
		
		for (int i=0 ; i<words.length; i++) {
			String word = words[i];
			String revword = "";
			for (int j=word.length()-1; j>=0; j-- ) {
				revword += word.charAt(j);
			}
			revstr += revword + " ";
		}
		System.out.println("Reversed string is : " + revstr);
	}
}
