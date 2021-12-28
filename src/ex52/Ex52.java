package ex52;

import java.util.Scanner;

public class Ex52 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the first number : ");
		int x = scanner.nextInt();
		System.out.print("Input the second number: ");
		int y = scanner.nextInt();
		System.out.print("Input the third number : ");
		int z = scanner.nextInt();
		System.out.print("The result is: " + sumoftwo(x, y, z));
		System.out.print("\n");
	}

	public static boolean sumoftwo(int p, int q, int r) {
		return ((p + q) == r || (q + r) == p || (r + p) == q);
	}
}