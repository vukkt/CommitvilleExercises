package ex56;

import java.util.Scanner;

public class Ex56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("insert first number: ");

		int firstNumber = scanner.nextInt();

		System.out.println("insert second number: ");

		int secondNumber = scanner.nextInt();

		System.out.println("insert third number: ");

		int thirdNumber = scanner.nextInt();

		System.out
				.println("The result divided by the third number is " + result(firstNumber, secondNumber, thirdNumber));
	}

	public static int result(int firstNumber, int secondNumber, int thirdNumber) {
		if (firstNumber % thirdNumber == 0)
			return (secondNumber / thirdNumber - firstNumber / thirdNumber + 1);
		return (secondNumber / thirdNumber - firstNumber / thirdNumber);

	}
}
