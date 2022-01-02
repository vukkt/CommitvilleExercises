package ex86;

import java.util.Scanner;

public class Ex86 {

	public static void main(String[] args) {
		int ctr = 0;
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		while (n != 1) {
			System.out.println(n);
			if (n % 2 == 0) {
				n = n / 2;
				ctr += 1;
			} else {
				n = (3 * n + 1) / 2;
				ctr += 1;
			}
		}
		System.out.println(ctr);
		in.close();
	}
}
