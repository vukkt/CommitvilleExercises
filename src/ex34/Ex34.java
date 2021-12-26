package ex34;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		double Area;
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input the length of a side of the hexagon:");
		int side = scanner.nextInt();

		Area = (6 * side * side) / (4 * (Math.tan((Math.PI / 6))));

		System.out.println("The area of the hexagon is: " + Area);
	}

}
