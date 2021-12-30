package ex60;

import java.util.Scanner;

public class Ex60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Input a String: ");

		String inputline = scanner.nextLine();

		String[] words = inputline.split("[ ]+");

		System.out.println("Penultimate word: " + words[words.length - 2]);
	}

}
