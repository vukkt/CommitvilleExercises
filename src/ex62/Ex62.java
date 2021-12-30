package ex62;

import java.util.Scanner;

public class Ex62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Input the first number : ");

		int firstNumber = scanner.nextInt();

		System.out.println("Input the second number : ");

		int secondNumber = scanner.nextInt();

		System.out.println("Input the third number : ");

		int thirdNumber = scanner.nextInt();

		System.out.println("The result is " + compareNumbers(firstNumber, secondNumber, thirdNumber));
	}

	public static boolean compareNumbers(int x, int y, int z) {
		return ((x >= 20 && x < Math.abs(z - y)) || (y >= 20 && y < Math.abs(x - z))
				|| (z >= 20 && z < Math.abs(x - y)));
	}
}
