package problem10;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Problem10 {

	public static void main(String[] args) {
		System.out.println("Please enter the number of characters");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		System.out.println("Please enter the characters");

		Deque<Character> deque = new ArrayDeque<>();
		for (int i = 0; i < size; i++) {
			char c = scanner.next().charAt(0);
			deque.add(c);
		}
		
		System.out.println("Please enter the number of elements");
		int size1 = scanner.nextInt();
		System.out.println("Please enter the elements");
		
		List<Integer> a = new ArrayList<>();
		for (int i = 0; i < size1; i++) {
			int element = scanner.nextInt();
			a.add(element);
		}

		String result = getDeque(deque, a);
		System.out.println(result);
	}

	public static String getDeque(Deque<Character> q, List<Integer> a) {
		char ele = '$';
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) == 0) {
				;

				if (ele != '$')
					q.addFirst(ele);
			}
			if (a.get(i) == 1 && !q.isEmpty())
				ele = q.pollFirst();
		}
		StringBuilder sb = new StringBuilder();
		while (!q.isEmpty()) {
			sb.append(q.poll());
		}
		return sb.toString();
	}

}
