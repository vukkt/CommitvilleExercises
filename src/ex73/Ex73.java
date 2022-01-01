package ex73;

import java.util.Scanner;

public class Ex73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please insert first string: ");

		String firstString = scanner.nextLine();

		System.out.println("Please insert second string: ");

		String secondString = scanner.nextLine();

		if (firstString.length() == 0) {
			System.out.println("#" + secondString.substring(secondString.length() - 1, secondString.length()));
		}
		if (secondString.length() == 0) {
			System.out.println(firstString.substring(0, 1) + "#");
		}
		if (firstString.length() != 0 && secondString.length() != 0) {
			System.out.println(firstString.substring(0, 1) + ""
					+ secondString.substring(secondString.length() - 1, secondString.length()));
		}
	}
}
