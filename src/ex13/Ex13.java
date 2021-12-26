package ex13;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Test Data:");

		System.out.println("Enter width: ");
		double width = scanner.nextDouble();

		System.out.println("Enter height: ");
		double height = scanner.nextDouble();

		double area = (width * height);
		double perimeter = (2 * (width + height));

		System.out.println("Area is " + width + " * " + height + " = " + area);
		System.out.println("Perimeter is " + "2 * (" + width + " + " + height + ")" + " = " + perimeter);

	}

}
