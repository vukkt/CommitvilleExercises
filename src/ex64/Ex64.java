package ex64;

import java.util.Scanner;

public class Ex64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Input the first number :");

		int firstNumber = scanner.nextInt();

		System.out.println("Input the second numbber :");

		int secondNumber = scanner.nextInt();

		System.out.println("Result: " + inspectCommonDigit(firstNumber, secondNumber));

	}

	public static boolean inspectCommonDigit(int x, int y) {

		if (x <= 25 || y >= 75)
			return false;
		int a = x % 10;
		int b = y % 10;

		x /= 10;
		y /= 10;

		return (x == y || x == b || a == y || a == b);
	}
}
