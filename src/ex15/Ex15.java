package ex15;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter first variable: ");
		int firstVariable = scanner.nextInt();

		System.out.println("Please enter second variable: ");
		int secondVariable = scanner.nextInt();

		System.out.println("The first variable is " + firstVariable + ".");
		System.out.println("The second variable is " + secondVariable + ".");

		System.out.println("Initializing swaping of variables...");

		replace(firstVariable, secondVariable);

		System.out.println("The first value is swapped with the second." + "\nThe first value now is " + secondVariable
				+ "." + " The second value is now " + firstVariable + ".");
	}

	private static void replace(int firstVariable, int secondVariable) {
		// TODO Auto-generated method stub
		int a = firstVariable;
		firstVariable = secondVariable;
		secondVariable = a;
		a = 0;

	}

}
