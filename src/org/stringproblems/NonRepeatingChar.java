package org.stringproblems;

public class NonRepeatingChar {
	public static void main(String[] args) {
		String str= "mayiknowyourname";
		boolean flag = true;
		//Given a string str consisting of lowercase Latin Letters, the task is to find the first non-repeating character in S.
		
		if(str.length()==0)
			System.out.println("Empty string");
		
		// if current character is the last occurrence in the string
		for (char i : str.toCharArray()) {
			//index of returns first occurrence of string
			//last index of returns position of last occurrence of string
			if(str.indexOf(i) == str.lastIndexOf(i))
			{
				System.out.println("First non repeating character is: " + i);
				flag = false;
				break;
			}
		}
		
		if(flag)
			System.out.println("There is no non repeating character");
	}

}
