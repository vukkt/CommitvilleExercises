package ex80;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please inter 3 elements of the array: ");

		ArrayList<Integer> array = new ArrayList<Integer>();

		int firstElement = scanner.nextInt();
		int secondElement = scanner.nextInt();
		int thirdElement = scanner.nextInt();

		array.add(firstElement);
		array.add(secondElement);
		array.add(thirdElement);

		System.out.println(Math.max((Math.max(secondElement, thirdElement)), firstElement));
	}

}
