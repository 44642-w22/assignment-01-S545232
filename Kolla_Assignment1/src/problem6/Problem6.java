package problem6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Problem6 {

	public static void main(String[] args) {
		System.out.println("Please enter the number of elements as even number");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		System.out.println("Please enter the elements");

		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < size; i++) {
			int element = scanner.nextInt();
			stack.push(element);
		}
		List<Integer> list = getList(stack);
		System.out.println(list);
	}

	public static List<Integer> getList(Stack stack) {
		List<Integer> list = new ArrayList<>();
		int size = stack.size();
		for (int i = 0; i < size / 2; i++) {
			list.add((Integer) stack.pop());
		}
		List<Integer> tempList = new ArrayList<>();
		for (int i = size / 2; i < size; i++) {
			tempList.add((Integer) stack.pop());
		}
		Collections.reverse(tempList);
		list.addAll(tempList);
		return list;
	}

}
