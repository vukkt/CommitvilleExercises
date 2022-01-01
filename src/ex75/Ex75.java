package ex75;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex75 {

	public static void main(String[] args) {
		int y = 10;
		ArrayList<Integer> array = new ArrayList<Integer>();

		Scanner scanner = new Scanner(System.in);

		System.out.println("please enter 5 elements of the array");

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
		System.out.println("Succesfully created an array " + array);
		if (Integer.valueOf(first).equals(fifth)) {
			System.out.println("true");

		} else {
			System.out.println("false");
		}

	}
}
