package ex33;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sumofdigits = 0;
		double digits = 0;
		int cast = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input an integer");

		int input = scanner.nextInt();

		int x = input;

		String convertIntAndCountString = String.valueOf(x);
		int length = convertIntAndCountString.length();

		for (int i = length; i <= length && i > 0; i--) {

			digits = x % 10;
			sumofdigits += digits;
			cast = (int) sumofdigits;
		}
		System.out.println("This is the sum of its digits " + cast + ".");
	}
}
