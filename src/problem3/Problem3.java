package problem3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		System.out.println("Please enter the number of elements");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		System.out.println("Please enter the elements");

		List<Integer> l1 = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			int no = scanner.nextInt();
			l1.add(no);
		}

		int ele = getMaximumNumber(l1);
		System.out.println(ele);
	}

	public static int getMaximumNumber(List<Integer> l1) {
		int maxNumber = Integer.MIN_VALUE;
		for (int i = 0; i < l1.size(); i++) {
			maxNumber = Math.max(maxNumber, l1.get(i));
		}
		return maxNumber;
	}

}
