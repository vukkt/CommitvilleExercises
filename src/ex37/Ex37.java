package ex37;

import java.util.Scanner;

public class Ex37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Input a string: ");
		// input into array and read from behind in for loop below
		char[] stringInput = scanner.nextLine().toCharArray();

		System.out.println("Reverse string: ");

		for (int i = stringInput.length - 1; i >= 0; i--) {
			System.out.print(stringInput[i]);
		}
	}

}
