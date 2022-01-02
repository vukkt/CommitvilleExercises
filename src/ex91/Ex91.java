package ex91;

public class Ex91 {

	public static void main(String[] args) {

		long startTime = System.nanoTime();

		System.out.println("The first 10 natural numbers are:\n");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		long estimatedTime = System.nanoTime() - startTime;
		System.out.println("Estimated time (in nanoseconds) to get the first 10 natural numbers: " + estimatedTime);
	}
}