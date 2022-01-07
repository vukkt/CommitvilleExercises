package ex183;

import java.util.Scanner;

public class Ex183 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.print("Input a positive integer: ");
		int n = in.nextInt();
		if (n > 0)
			System.out.println(add_digits_until_one(n));
	}

	public static int add_digits_until_one(int n) {
		while (n > 9) {
			int sum_digits = 0;
			while (n != 0) {
				sum_digits += n % 10;
				n /= 10;
			}
			n = sum_digits;
		}
		return n;
	}
}