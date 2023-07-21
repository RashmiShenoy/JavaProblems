package org.algorithms;

import java.util.Scanner;

public class CountSayStringBuid {

	public static String countAndSay(int n) {
		String val = "1";
		System.out.print(val);
		
		for (int i = 0; i<n-1; i++) {
			//Get first character value
			char c = val.charAt(0);
			
			StringBuilder sb = new StringBuilder();
			int count = 1;
			
			//Iterate to find count of consecutive num
			for (int j=1; j<val.length(); j++) {
				//If the char is not same as next
				if(c!= val.charAt(j)) {
					//As soon as int stops repeating itself do the following
					sb.append(count);
					//then append the int itself
					sb.append(c);
					//set count to 0 to start for next char
					count = 0;
					//set to next char in the sequence
					c = val.charAt(j);
				}
				//Increment count if sequence is not ended
				count++;
			}
			sb.append(count);
			sb.append(c);
			System.out.print(", " + sb);
			//Convert final values to string
			val = sb.toString();
		}
		return val;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total num for sequence:");
		int num = sc.nextInt();
		String str = countAndSay(num);
		System.out.println(str);
	}

}
