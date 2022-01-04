package ex106;

import java.util.Arrays;

public class Ex106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array_nums = { 11, 15, 13, 10, 45, 20 };
		System.out.println("Original Array: " + Arrays.toString(array_nums));

		if (array_nums.length > 1) {
			int first = array_nums[0];

			for (int i = 1; i < array_nums.length; i++)
				array_nums[i - 1] = array_nums[i];

			array_nums[array_nums.length - 1] = first;
			System.out.println("New Array: " + Arrays.toString(array_nums));
		}
	}
}