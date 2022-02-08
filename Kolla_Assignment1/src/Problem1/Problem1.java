package Problem1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		System.out.println("Please enter the number of elements");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		System.out.println("Please enter the elements");
		
		List<Integer> ll1 = new LinkedList<>();
		for (int i = 0; i < size; i++) {
			int element = scanner.nextInt();
			ll1.add(element);
		}

		List<Integer> ll2 = getPerfectNumbers(ll1);
		System.out.println(ll2);
	}

	public static List<Integer> getPerfectNumbers(List<Integer> ll1) {
		List<Integer> ll2 = new LinkedList<>();
		for (int i = 0; i < ll1.size(); i++) {
			int num = ll1.get(i);
			int sum = 0;
			for (int j = 1; j < num; j++) {
				if (num % j == 0) {
					sum += j;
				}
			}
			if (sum == num) {
				ll2.add(num);
			}

		}
		return ll2;
	}

}
