package ex58;

import java.util.Scanner;

public class Ex58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Input a Sentence: ");

		String line = scanner.nextLine();

		String upper_case_line = "";

		Scanner lineScan = new Scanner(line);

		while (lineScan.hasNext()) {
			String word = lineScan.next();
			upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
		}
		System.out.println(upper_case_line.trim());
	}

}
