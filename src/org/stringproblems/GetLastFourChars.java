package org.stringproblems;

public class GetLastFourChars {
	public static void main(String[] args) {
		
		//Using substring function
		String str = "sdwueuiweiu";
		String lastchar = "";
		if(str.length() > 4) {
			lastchar = str.substring(str.length()-4);
		}
		else {
			lastchar = str;
		}
		System.out.println(lastchar);
	}
}
