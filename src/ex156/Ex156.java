package ex156;

public class Ex156 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 2350;

		System.out.printf("Original Number: %d\n", n);

		int shift_right_count = 0;
		do {
			n >>= 1;
			shift_right_count++;

		} while (n != 0);
		shift_right_count--;
		System.out.printf("Result: %s\r\n", shift_right_count);
	}
}
