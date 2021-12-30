package ex68;

import java.util.Scanner;

public class Ex68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Input a string :");
			String input = scanner.nextLine();
			if (input.length() >= 3) {
				for (int i = 0; i < 4; i++) {
					System.out.print(input);

				}
				break;
			} else {
				System.out.println("Your string was too short. Please make sure it is at least 3 letters long\n");
			}
		}
	}
}
