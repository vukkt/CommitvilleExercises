package ex32;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Input Data:");

		System.out.println("Input first integer:");
		int firstInteger = scanner.nextInt();

		System.out.println("Input second integer:");
		int secondInteger = scanner.nextInt();

		System.out.println("Comparing two integers...");

		if (firstInteger != secondInteger) {
			System.out.println(firstInteger + " != " + secondInteger);
		}
		if (firstInteger > secondInteger) {
			System.out.println(firstInteger + " > " + secondInteger);
		}

		if (firstInteger < secondInteger) {
			System.out.println(firstInteger + " < " + secondInteger);
		}

		if (firstInteger <= secondInteger) {
			System.out.println(firstInteger + " <= " + secondInteger);
		}
	}
}