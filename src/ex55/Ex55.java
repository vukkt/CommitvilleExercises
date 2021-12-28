package ex55;

import java.util.Scanner;

public class Ex55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Input seconds: ");

		int input = scanner.nextInt();

		int hours = input / 3600;
		int minutes = ((input - (hours * 3600)) / 60);
		int seconds = ((input - (hours * 3600) - minutes * 60));

		System.out.println(input / 3600 + ":" + minutes + ":" + seconds);

	}

}
