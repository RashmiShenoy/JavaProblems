package org.math;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {

	// Using stack push pop
	public static void main(String[] args) {
		String str = "()[]{})";
		if(isValid(str))
			System.out.println("Balanced");
		else
			System.out.println("Not balanced");
		
	}

	static boolean isValid(String s) {
		// Using ArrayDeque is faster than using Stack class
		Deque<Character> stack = new ArrayDeque<Character>();
		
		for (int i=0; i<s.length(); i++) {
			char x = s.charAt(i);
			
			if(x =='(' || x == '[' || x == '{') {
				stack.push(x);
				continue;
			}
			// If current character is not opening
            // bracket, then it must be closing. So stack
            // cannot be empty at this point.
			if(stack.isEmpty())
				return false;
			char check;
			switch(x) {
			case')':
				check = stack.pop();
				if(check == '{' || check =='[')
					return false;
				break;
			 case '}':
	                check = stack.pop();
	                if (check == '(' || check == '[')
	                    return false;
	                break;
	 
	            case ']':
	                check = stack.pop();
	                if (check == '(' || check == '{')
	                    return false;
	                break;
			}
		}
		// Check Empty Stack
        return (stack.isEmpty());
		
	}
}
