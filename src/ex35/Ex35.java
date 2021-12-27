package ex35;

import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the number of sides on the polygon: ");

		int polygonSides = scanner.nextInt();

		System.out.println("Input the length of one of the sides: ");

		int lengthOfSide = scanner.nextInt();

		double area = ((polygonSides * lengthOfSide * lengthOfSide) / (4 * Math.tan((Math.PI / polygonSides))));

		System.out.println("The area is: " + area);

	}

}
