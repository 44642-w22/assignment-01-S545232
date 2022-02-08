package problem2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		System.out.println("Please enter the number of elements");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		System.out.println("Please enter the elements");

		List<Integer> l1 = new LinkedList<>();
		for (int i = 0; i < size; i++) {
			int element = scanner.nextInt();
			l1.add(element);
		}
		int k = scanner.nextInt();
		List<List<Integer>> l2 = getPairSum(l1, k);
		System.out.println(l2);
	}

	public static List<List<Integer>> getPairSum(List<Integer> l1, int k) {
		List<List<Integer>> l2 = new ArrayList<>();
		for (int i = 0; i < l1.size() - 1; i++) {

			if (l1.get(i) + l1.get(i + 1) == k) {
				l2.add(new ArrayList<Integer>());
				l2.get(l2.size() - 1).add(l1.get(i));
				l2.get(l2.size() - 1).add(l1.get(i + 1));
			}

		}
		return l2;
	}

}
