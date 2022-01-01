package ex71;

import java.util.Scanner;

public class Ex71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String concat;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the first string: ");

		String firstString = scanner.nextLine();

		System.out.println("Please enter the second string: ");

		String secondString = scanner.nextLine();

		while (true) {

			if (firstString.length() >= 1 && secondString.length() >= 1) {
				System.out.println(firstString.substring(1) + "" + secondString.substring(1));

				break;
			} else {
				System.out.println("Please enter a string with length more than 1");
			}
		}
	}

}
