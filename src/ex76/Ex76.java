package ex76;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex76 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ArrayList<Integer> array = new ArrayList<Integer>();
		ArrayList<Integer> array2 = new ArrayList<Integer>();

		System.out.println("Please enter 5 elements of the first array: ");

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

		System.out.println("Succesfully created first array of 5 elements :" + array + "\n");

		System.out.println("Please enter 5 elements of the second array: ");

		int first2 = scanner.nextInt();
		int second2 = scanner.nextInt();
		int third2 = scanner.nextInt();
		int fourth2 = scanner.nextInt();
		int fifth2 = scanner.nextInt();

		array2.add(first2);
		array2.add(second2);
		array2.add(third2);
		array2.add(fourth2);
		array2.add(fifth2);

		System.out.println("Succesfully created second array of 5 elements :" + array2 + "\n");

		if (Integer.valueOf(first).equals(first2) && Integer.valueOf(fifth).equals(fifth2)) {
			System.out.println("true");

		} else {
			System.out.println("false");
		}

	}
}
