package chpater04.collection;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {

		System.out.println((isValidParentheses("(())(()()())") ? "Valid" : "InValid") + " Parentheses");
		System.out.println((isValidParentheses("(())(()()())()") ? "Valid" : "InValid") + " Parentheses");
		System.out.println((isValidParentheses("((())((()())())") ? "Valid" : "InValid") + " Parentheses");
		System.out.println((isValidParentheses("()())") ? "Valid" : "InValid") + " Parentheses");
	}

	private static boolean isValidParentheses(String expr) {
		Stack<Character> stack = new Stack<>();

		for (char c : expr.toCharArray()) {

			if (c == '(') {
				stack.push(c);
				continue;
			}

			if (stack.isEmpty()) {
				return false;
			}

			stack.pop();

		}
		return stack.isEmpty();
	}

}
