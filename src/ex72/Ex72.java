package ex72;

import java.util.Scanner;

public class Ex72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please insert a string :");

		String inputString = scanner.nextLine();

		while (true) {
			if (inputString.length() < 3) {
				for (int i = 0; i < 3; i++) {
					System.out.print("#");
				}
				break;
			} else {
				System.out.println(inputString.substring(0, 3));
				break;
			}
		}
	}

}
