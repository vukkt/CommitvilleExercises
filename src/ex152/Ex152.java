package ex152;

import java.util.Scanner;

public class Ex152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Input first number: ");

		int firstNumber = scanner.nextInt();

		System.out.println("Input second number: ");

		int secondNumber = scanner.nextInt();

		System.out.println("Input third number: ");

		int thirdNumber = scanner.nextInt();

		System.out.println("Input fourth number: ");

		int fourthNumber = scanner.nextInt();

		result(firstNumber, secondNumber, thirdNumber, fourthNumber);

		if (result(firstNumber, secondNumber, thirdNumber, fourthNumber) == true) {
			System.out.println("Numbers are equal!");
		} else {
			System.out.println("Numbers are not equal");
		}

	}

	public static boolean result(int a, int b, int c, int d) {
		return (a == b && b == c && c == d);
	}
}
