package problem4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		System.out.println("Please enter the number of elements");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		System.out.println("Please enter the elements");

		List<String> l1 = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			String s = scanner.next();
			l1.add(s);
		}

		List<String> l2 = getSortedStrings(l1);
		System.out.println(l2);
	}

	public static List<String> getSortedStrings(List<String> l1) {
		List<String> l2 = new ArrayList<>();
		for (int i = 0; i < l1.size(); i++) {
			l2.add(l1.get(i));
		}
		Collections.sort(l2, (a, b) -> a.length() - b.length());
		return l2;
	}

}
