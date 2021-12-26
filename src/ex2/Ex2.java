package ex2;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please insert first number:");

		int firstNumber = scanner.nextInt();

		System.out.println("Please insert second number:");

		int secondNumber = scanner.nextInt();

		System.out.println("Calculating sum of numbers...");

		int result = firstNumber + secondNumber;

		System.out.println("The sum is " + result);
	}

}
