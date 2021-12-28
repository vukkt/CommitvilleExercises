package ex53;

import java.util.Scanner;

public class Ex53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the first number : ");
		int x = scanner.nextInt();
		System.out.print("Input the second number: ");
		int y = scanner.nextInt();
		System.out.print("Input the third number : ");
		int z = scanner.nextInt();
		System.out.print("The result is: " + test(x, y, z, true));
		System.out.print("\n");
	}

	public static boolean test(int p, int q, int r, boolean xyz) {
		if (xyz)
			return (r > q);
		return (q > p && r > q);
	}
}