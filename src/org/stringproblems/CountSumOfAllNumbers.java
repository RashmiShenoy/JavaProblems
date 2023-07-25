package org.stringproblems;

public class CountSumOfAllNumbers {

	public static void main(String[] args) {
		String str = "123rashmi123";
		
		int sum = 0;
			
		for(int i=0 ; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(Character.isDigit(ch))
				sum += Character.getNumericValue(ch);
		}
		
		
		System.out.println(sum);
	}

}
