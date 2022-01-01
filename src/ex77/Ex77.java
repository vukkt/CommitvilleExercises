package ex77;

import java.util.Scanner;

public class Ex77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please insert 3 elements of the first array:");

		int firstElementOfFirstArray = scanner.nextInt();
		int secondElementOfFirstArray = scanner.nextInt();
		int thirdElementOfFirstArray = scanner.nextInt();

		int[] array = new int[3];

		array[0] = firstElementOfFirstArray;
		array[1] = secondElementOfFirstArray;
		array[2] = thirdElementOfFirstArray;

		System.out.println("Please insert 3 elements of the second array:");

		int firstElementOfSecondArray = scanner.nextInt();
		int secondElementOfSecondArray = scanner.nextInt();
		int thirdElementOfSecondArray = scanner.nextInt();

		int[] array2 = new int[3];

		array2[0] = firstElementOfSecondArray;
		array2[1] = secondElementOfSecondArray;
		array2[2] = thirdElementOfSecondArray;

		int[] array3 = new int[2];

		array3[0] = array[0];
		array3[1] = array2[2];

		System.out.println("New Array: [" + array3[0] + ", " + array3[1] + "]");

	}

}
