package ex78;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter two elements of the array: ");

		int firstElement = scanner.nextInt();

		int secondElement = scanner.nextInt();

		ArrayList<Integer> array = new ArrayList<Integer>();

		array.add(firstElement);
		array.add(secondElement);

		System.out.println(checkIfContains(firstElement, secondElement));
	}

	public static boolean checkIfContains(int a, int b) {
		return (a == 4 || a == 7 || b == 4 || b == 7);
	}
}
