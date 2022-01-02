package ex92;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int countEven = 0;
		int countOdd = 0;
		ArrayList<Integer> array = new ArrayList<Integer>();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter 5 elements into the array: ");

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

		for (int i = 0; i < array.size(); i++) {
			if (array.get(i) % 2 == 0) {
				++countEven;

			} else {
				++countOdd;
			}
		}

		System.out.println("Your array contains following elements: " + array);

		System.out.println("Number of even elements is " + countEven + ", and number of odd is " + countOdd);
	}

}
