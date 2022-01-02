package ex83;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> array = new ArrayList<Integer>();
		ArrayList<Integer> array2 = new ArrayList<Integer>();
		ArrayList<Integer> multipliedValuesArray = new ArrayList<Integer>();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter first 4 elements of the first array");

		int firstElementOfFirstArray = scanner.nextInt();
		int secondElementOfFirstArray = scanner.nextInt();
		int thirdElementOfFirstArray = scanner.nextInt();
		int fourthElementOfFirstArray = scanner.nextInt();

		array.add(firstElementOfFirstArray);
		array.add(secondElementOfFirstArray);
		array.add(thirdElementOfFirstArray);
		array.add(fourthElementOfFirstArray);

		System.out.println("First array is : " + array);

		System.out.println("Please enter first 4 elements of the second array");

		int firstElementOfSecondArray = scanner.nextInt();
		int secondElementOfSecondArray = scanner.nextInt();
		int thirdElementOfSecondArray = scanner.nextInt();
		int fourthElementOfSecondArray = scanner.nextInt();

		array2.add(firstElementOfSecondArray);
		array2.add(secondElementOfSecondArray);
		array2.add(thirdElementOfSecondArray);
		array2.add(fourthElementOfSecondArray);

		System.out.println("Second array is : " + array2);

		multipliedValuesArray.add(firstElementOfFirstArray * firstElementOfSecondArray);
		multipliedValuesArray.add(secondElementOfFirstArray * secondElementOfSecondArray);
		multipliedValuesArray.add(thirdElementOfFirstArray * thirdElementOfSecondArray);
		multipliedValuesArray.add(fourthElementOfFirstArray * fourthElementOfSecondArray);

		System.out.print("Multiplied values of same index in previous two arrays create the following array :"
				+ multipliedValuesArray);
	}

}
