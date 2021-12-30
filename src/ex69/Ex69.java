package ex69;

import java.util.Scanner;

public class Ex69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Insert a string with even length :");

			String inputString = scanner.nextLine();
			int i = inputString.length() / 2;
			if (inputString.length() % 2 == 0) {
				System.out.println(inputString.substring(0, i));
				break;
			} else {
				System.out.println("You haven't entered a string with even length. Please try again.\n");
			}
		}
	}

}
