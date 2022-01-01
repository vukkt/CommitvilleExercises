package ex76;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex76 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ArrayList<Integer> array = new ArrayList<Integer>();
		ArrayList<Integer> array2 = new ArrayList<Integer>();

		System.out.println("please enter 5 elements of the first array");

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

		System.out.println("please enter 5 elements of the second array");

		int first2 = scanner.nextInt();
		int second2 = scanner.nextInt();
		int third2 = scanner.nextInt();
		int fourth2 = scanner.nextInt();
		int fifth2 = scanner.nextInt();

		array.add(first2);
		array.add(second2);
		array.add(third2);
		array.add(fourth2);
		array.add(fifth2);

		System.out.println("Succesfully created an array of 5 elements :" + array);
		if (Integer.valueOf(first).equals(fifth)) {
			System.out.println("true");

		} else {
			System.out.println("false");
		}

	}
}
