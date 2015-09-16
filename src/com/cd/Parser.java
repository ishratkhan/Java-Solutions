package com.cd;

import java.util.Scanner;
import java.util.Stack;

public class Parser {
	//{}()
	//({()})
	//{}(
	public static void main(String []argh)
	{
		Parser X=new Parser();
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			System.out.println(X.checkParenthesisBalance(in.next()));
		}
		
	}
	
	public boolean checkParenthesisBalance(String str) {
		char[] chars=str.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		char cAtZero =  chars[0];
		
		if(cAtZero == '}' || cAtZero == ']' || cAtZero == ')' || chars.length%2 !=0)
			return false;

		for (char c : chars) {
			if (c == '{' || c == '[' || c == '(') {
				stack.push(c);
				continue;
			}

			else if (c == '}' && !stack.empty() && stack.peek() == '}') {
				stack.pop();
				continue;
			}

			else if (c == ']' && !stack.empty() && stack.peek() == ']') {
				stack.pop();
				continue;
			}

			else if (c == ')' && !stack.empty() && stack.peek() == ')') {
				stack.pop();
				continue;
			} else {
				if (c == '}' || c == ']' || c == ')') {
					stack.push(c);
				}

			}

		}
		return stack.isEmpty();
	}
	
}
