package ex50;

public class Ex50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Divided by 3:");

		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0) {
				System.out.print(i + ",");
			}
		}
		System.out.println("\nDivided by 5:");
		for (int i = 1; i < 100; i++) {
			if (i % 5 == 0) {
				System.out.print(i + ",");
			}
		}
		System.out.println("\nDivided by 3 & 5:");
		for (int i = 1; i < 100; i++) {
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.print(i + ",");
			}
		}
	}

}
