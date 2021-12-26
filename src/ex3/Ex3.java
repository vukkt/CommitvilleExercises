package ex3;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please insert the first number: ");
		int firstNumber = scanner.nextInt();

		System.out.println("Please insert the second number: ");
		int secondNumber = scanner.nextInt();

		int result = firstNumber / secondNumber;

		System.out.println("The divison is being initiated...\nThe result is " + result);
	}

}
