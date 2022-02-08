package problem8;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Problem8 {

	public static void main(String[] args) {
		System.out.println("Please enter the number of elements");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		System.out.println("Please enter the elements");

		Deque<Integer> deque = new ArrayDeque<>();
		for (int i = 0; i < size; i++) {
			int element = scanner.nextInt();
			deque.add(element);
		}
		List<Integer> list = getAlternativeSeq(deque);
		System.out.println(list);
	}

	public static List<Integer> getAlternativeSeq(Deque<Integer> q) {
		List<Integer> list = new ArrayList<>();
		while (!q.isEmpty()) {
			list.add(q.pollLast());
			if (!q.isEmpty())
				list.add(q.pollFirst());

		}
		return list;
	}

}
