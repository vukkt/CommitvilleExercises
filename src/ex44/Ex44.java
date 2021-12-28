package ex44;

import java.util.Scanner;

public class Ex44 {
	// all we did here is basic concatenation of strings after conversion integer to
	// string and printed out the output
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Input number: ");

		int inputNumber = scanner.nextInt();

		String ConvertIntegerToString = Integer.toString(inputNumber);

		System.out.println(ConvertIntegerToString + " + " + ConvertIntegerToString + ConvertIntegerToString + " + "
				+ ConvertIntegerToString + ConvertIntegerToString + ConvertIntegerToString);
	}

}
