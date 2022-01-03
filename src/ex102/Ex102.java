package ex102;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count10and30 = 0;
		ArrayList<Integer> array = new ArrayList<Integer>();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter 4 elements of the array: ");

		int firstElement = scanner.nextInt();
		int secondElement = scanner.nextInt();
		int thirdElement = scanner.nextInt();
		int fourthElement = scanner.nextInt();

		array.add(firstElement);
		array.add(secondElement);
		array.add(thirdElement);
		array.add(fourthElement);

		System.out.println("Checking if any element equals to 10 or 30...");

		for (int i = 0; i < array.size(); i++) {
			if (array.get(i) == 10 || array.get(i) == 30) {
				count10and30++;
			}
		}
		if (count10and30 > 0) {
			System.out.println("There is 10 or 30 in an array");
		} else {
			System.out.println("There isn't 10 or 30 in an array");
		}

	}
}
