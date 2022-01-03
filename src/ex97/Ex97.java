package ex97;

public class Ex97 {

	public static void main(String[] args) {

		int[] array_nums = { 10, 20, 10, 50, 20, 13, 50 };
		boolean testd = false;
		int result = 0;
		int x = 10;

		for (int i = 0; i < array_nums.length - 1; i++) {
			if (array_nums[i] == x && array_nums[i + 1] == x) {
				System.out.printf(String.valueOf(true));
				result = 1;
			}

			if (i <= array_nums.length - 3 && array_nums[i] == x && array_nums[i + 2] == x) {
				System.out.printf(String.valueOf(true));
				result = 1;
			}
		}

		if (result == 0) {
			System.out.printf(String.valueOf(false));
		}
		System.out.printf("\n");
	}
}
