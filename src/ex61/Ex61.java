package ex61;

import java.util.Scanner;

public class Ex61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Input a word:");

		String input = scanner.nextLine();

		input = input.trim();

		char[] array = input.toCharArray();

		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i]);
		}

	}

}
