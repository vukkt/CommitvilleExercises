package ex107;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> array = new ArrayList<Integer>();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter 5 elements of the array: ");

		int firstElement = scanner.nextInt();
		int secondElement = scanner.nextInt();
		int thirdElement = scanner.nextInt();
		int fourthElement = scanner.nextInt();
		int fifthElement = scanner.nextInt();

		array.add(firstElement);
		array.add(secondElement);
		array.add(thirdElement);
		array.add(fourthElement);
		array.add(fifthElement);

		System.out.println("You've succesfully added 5 elements into the array: " + array);

	}

}
