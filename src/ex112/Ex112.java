package ex112;

import java.util.Scanner;

public class Ex112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a number: ");

		int n = scanner.nextInt();

		int n1 = n;
		long ctr = 0;
		while (n != 0) {

			ctr += n / 5;
			n /= 5;
		}
		System.out.printf("Number of trailing zeros of the factorial %d is %d ", n1, ctr);

	}
}