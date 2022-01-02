package ex81;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter 3 elements of the array: ");

		ArrayList<Integer> array = new ArrayList<Integer>();

		ArrayList<Integer> array2 = new ArrayList<Integer>();

		int firstElement = scanner.nextInt();
		int secondElement = scanner.nextInt();
		int thirdElement = scanner.nextInt();

		array.add(firstElement);
		array.add(secondElement);
		array.add(thirdElement);

		System.out.println("Your array looks like :" + array);

		System.out.println("Initializing swapping of the first and last element. . .");

		array2.add(thirdElement);
		array2.add(secondElement);
		array2.add(firstElement);

		System.out.println("Elements swapped, your array is now: " + array2);
	}

}
