package ex63;

import java.util.Scanner;

public class Ex63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Input the first number : ");

		int firstNumber = scanner.nextInt();

		System.out.println("Input the second number : ");

		int secondNumber = scanner.nextInt();

		System.out.println("Result " + result(firstNumber, secondNumber));
	}

	public static int result(int x, int y) {

		if (x == y)
			return 0;
		if (x % 6 == y % 6)
			return (x < y) ? x : y;
		return (x > y) ? x : y;
	}
}
