package ex153;

import java.util.Scanner;

public class Ex153 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Input first number: ");

		double firstNumber = scanner.nextDouble();

		System.out.println("Input second number: ");

		double secondNumber = scanner.nextDouble();

		System.out.println(testIfBetweenZeroAndOne(firstNumber, secondNumber));
	}

	public static boolean testIfBetweenZeroAndOne(double a, double b) {
		return (a > 0 && b > 0 && a < 1 && b < 1);
	}

}