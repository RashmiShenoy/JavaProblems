package org.stringproblems;

import java.util.HashMap;
import java.util.Iterator;

//Count of strings whose prefix match with the given string to a given length
public class TotalUniquePrefix {

	public static String getLongestPrefix(String[] strArr) {
		if(strArr.length==0) return "";
		String minStr = getMinString(strArr);
		
		int minPrefix = minStr.length();
		for(int i=0; i<strArr.length;i++) {
			int j;
			for(j=0; j<minPrefix; j++) {
				if(minStr.charAt(j)!=strArr[i].charAt(j))
					break;
			}
			if(j<minPrefix)
				minPrefix = j;
		}
		return minStr.substring(0,minPrefix);
	}
	
	public static String getMinString(String[] strArr) {
		String minStr = strArr[0];
		for(int i=1; i<strArr.length;i++) {
			if(strArr[i].length() < minStr.length())
				minStr = strArr[i];
		}
		return minStr;
	}
	
	public static void main(String[] args) {
		 String[] arr = {"para", "paraofparas", "paper", "piper", "param", "papa", "paps"};
	     System.out.println("Longest prefix: " + getLongestPrefix(arr));
	}
}
