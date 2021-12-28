package ex54;

import java.util.Scanner;

public class ex54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Input the first number:");
		int firstNumber = scanner.nextInt();

		System.out.println("Input the second number:");
		int secondNumber = scanner.nextInt();

		System.out.println("Input the third number:");
		int thirdNumber = scanner.nextInt();

		System.out.println("The result is " + test_rightmost_digit(firstNumber, secondNumber, thirdNumber, true));

	}

	public static boolean test_rightmost_digit(int x, int y, int z, boolean firstNumbersecondNumberthirdNumber) {
		return (x % 10 == y % 10 || y % 10 == z % 10 || x % 10 == z % 10);
	}
}
