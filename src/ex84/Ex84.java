package ex84;

import java.util.Scanner;

public class Ex84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter a string : ");

		String inputString = scanner.nextLine();

		System.out.println(inputString.substring(inputString.length() - 3, inputString.length()) + inputString
				+ inputString.substring(inputString.length() - 3, inputString.length()));
	}

}
