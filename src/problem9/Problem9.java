package problem9;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Problem9 {

	public static void main(String[] args) {
		System.out.println("Please enter the number of elements");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		System.out.println("Please enter the elements");

		Queue<Integer> queue = new ArrayDeque<>();
		for (int i = 0; i < size; i++) {
			int element = scanner.nextInt();
			queue.add(element);
		}
		List<Integer> list = getEvenOdd(queue);
		System.out.println(list);
	}

	public static List<Integer> getEvenOdd(Queue<Integer> q) {
		Queue<Integer> evenList = new LinkedList<>();
		Queue<Integer> oddList = new LinkedList<>();
		while (!q.isEmpty()) {
			int ele = q.poll();
			if (ele % 2 == 0) {
				evenList.add(ele);
			} else {
				oddList.add(ele);
			}

		}
		List<Integer> list = new ArrayList<>();
		while (!evenList.isEmpty() || !oddList.isEmpty()) {
			if (!evenList.isEmpty()) {
				list.add(evenList.poll());
			}
			if (!oddList.isEmpty()) {
				list.add(oddList.poll());
			}
		}
		return list;
	}

}
