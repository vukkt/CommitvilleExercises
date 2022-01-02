package ex85;

import java.util.Scanner;

public class Ex85 {
	static String test = "Hello";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a string");

		Scanner scanner = new Scanner(System.in);

		String inputString = scanner.nextLine();

		System.out.print(checkString(inputString, test));

	}

	public static boolean checkString(String checker, String test) {
		return (checker.equals(test));

	}
}