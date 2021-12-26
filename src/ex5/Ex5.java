package ex5;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Test Data:");

		System.out.println("Input first number:");
		int firstNumber = scanner.nextInt();

		System.out.println("Input second number:");
		int secondNumber = scanner.nextInt();

		int result = firstNumber * secondNumber;

		System.out.println(firstNumber + " x " + secondNumber + " = " + result);
	}

}
