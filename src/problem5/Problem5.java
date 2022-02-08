package problem5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Problem5 {

	public static void main(String[] args) {
		System.out.println("Please enter the input from among ([, ], {, }, (, ))");
		Scanner scanner = new Scanner(System.in);
		String inputExpression = scanner.next();
		boolean isBalanced = isBalancedExpression(inputExpression);
		System.out.println(isBalanced);
	}

	public static boolean isBalancedExpression(String s) {
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			char topEle = st.isEmpty() ? '#' : st.peek();
			if (c == ')') {
				if (topEle == '(')
					st.pop();
				else
					return false;
			} else if (c == ']') {
				if (topEle == '[')
					st.pop();
				else
					return false;
			} else if (c == '}') {
				if (topEle == '{')
					st.pop();
				else
					return false;
			} else
				st.push(c);

		}
		return st.isEmpty();
	}

}
