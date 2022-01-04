package ex109;

import java.util.Scanner;

public class Ex109 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("Input a positive integer: ");

		int n = scanner.nextInt();

		if (n > 0) {
			System.out.print("The single digit number is: " + (n == 0 ? 0 : (n % 9 == 0 ? 9 : n % 9)));
		}
	}
}