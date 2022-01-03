package ex105;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> array = new ArrayList<Integer>();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter 5 elements of the array");

		int first = scanner.nextInt();
		int second = scanner.nextInt();
		int third = scanner.nextInt();
		int fourth = scanner.nextInt();
		int fifth = scanner.nextInt();

		array.add(first);
		array.add(second);
		array.add(third);
		array.add(fourth);
		array.add(fifth);

		while (true) {

			if (array.get(0) == array.get(array.size() - 1)) {
				System.out.println("The first element matches the last");
				break;
			} else {
				System.out.println("The first element and the last don't match.");
				break;
			}
		}
	}

}
