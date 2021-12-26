package ex7;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input a number: ");
		int number = scanner.nextInt();

		for (int i = 1; i < 11; i++) {
			int result = i * number;
			System.out.println(number + " x " + i + " = " + result);
		}
	}

}
