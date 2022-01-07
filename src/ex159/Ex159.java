package ex159;

import java.util.Arrays;
import java.util.Collections;

public class Ex159 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer array[] = new Integer[] { 1, 4, 17, 7, 25, 3, 100 };
		int k = 3;

		System.out.println("Original Array: ");

		System.out.println(Arrays.toString(array));

		System.out.println(k + " largest elements of the said array are:");

		Arrays.sort(array, Collections.reverseOrder());
		for (int i = 0; i < k; i++)
			System.out.print(array[i] + " ");
	}
}