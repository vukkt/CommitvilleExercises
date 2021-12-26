package ex12;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input first number: ");
		int firstNumber = scanner.nextInt();

		System.out.println("Please input second number: ");
		int secondNumber = scanner.nextInt();

		System.out.println("Please input third number: ");
		int thirdNumber = scanner.nextInt();

		int average = ((firstNumber + secondNumber + thirdNumber) / 3);
		System.out.println("Calculcating average value of three numbers.." + "\nThe average value is " + average);
	}

}
