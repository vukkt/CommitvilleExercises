package ex160;

import java.util.Arrays;

public class Ex160 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer array[] = new Integer[] { 1, 4, 17, 7, 25, 3, 100 };

		int k = 3;
		System.out.println("Original Array: ");
		System.out.println(Arrays.toString(array));

		System.out.println(k + " smallest elements of the said array are:");

		Arrays.sort(array);

		for (int i = 0; i < k; i++)
			System.out.print(array[i] + " ");
	}
}