package org.stringproblems;

//Given string str, we need to print the reverse of individual words.
public class ReverseWord {
	public static void main(String[] args) {
		//Using in built String builder
		
		String str = "Hi my name is Rashmi";
		
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		sb.reverse();
		System.out.println(sb);
	}

}
