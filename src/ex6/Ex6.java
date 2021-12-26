package ex6;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Input first number: ");
		int firstNumber = scanner.nextInt();

		System.out.println("Input second number: ");
		int secondNumber = scanner.nextInt();

		int sum = firstNumber + secondNumber;
		int deduction = firstNumber - secondNumber;
		int multiply = firstNumber * secondNumber;
		int divide = firstNumber / secondNumber;
		int remains = firstNumber % secondNumber;

		System.out.println("Calculating operations...");

		System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
		System.out.println(firstNumber + " - " + secondNumber + " = " + deduction);
		System.out.println(firstNumber + " x " + secondNumber + " = " + multiply);
		System.out.println(firstNumber + " / " + secondNumber + " = " + divide);
		System.out.println(firstNumber + " mod " + secondNumber + " = " + remains);
	}

}
