package problem7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Problem7 {

	public static void main(String[] args) {
		System.out.println("Please enter the number of elements");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		System.out.println("Please enter the elements");

		Queue<Integer> queue = new LinkedList<>();
		for (int i = 0; i < size; i++) {
			int element = scanner.nextInt();
			queue.add(element);
		}

		int number = getDecimalNumber(queue);
		System.out.println(number);
	}

	public static int getDecimalNumber(Queue queue) {
		int n = 0;
		int size = queue.size();
		size--;
		int base = 2;
		while (!queue.isEmpty()) {
			int element = (int) queue.poll();
			n = n + (element * (int) Math.pow(base, size));
			size--;
		}
		return n;
	}

}
