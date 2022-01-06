package ex117;

import java.util.Scanner;

public class Ex117 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Input a positive integer: ");

		int positiveInteger = scanner.nextInt();

		int sqrt = (int) Math.sqrt(positiveInteger);

		System.out.println("Square root of " + positiveInteger + " is: " + sqrt);
	}

}
