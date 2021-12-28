package ex51;

import java.util.Scanner;

public class Ex51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Input a number(string): ");

		String StringInput = scanner.nextLine();

		int ConvertedStringInputToInt = Integer.parseInt(StringInput);

		System.out.println("The integer value is: " + ConvertedStringInputToInt);
	}

}
