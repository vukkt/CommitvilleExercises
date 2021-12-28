package ex49;

import java.util.Scanner;

public class Ex49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Input a number: ");

		int numbercheck = scanner.nextInt();

		if (numbercheck % 2 == 0) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

}
