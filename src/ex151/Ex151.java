package ex151;

public class Ex151 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = (101 + 0) / 3;
		double b = 3.0e-6 * 10000000.1;
		boolean c = true && true;
		boolean d = false && true;
		boolean e = (false && false) || (true && true);
		boolean f = (false || false) && (true && true);

		System.out.println("(101 + 0) / 3)-> " + a);
		System.out.println("(3.0e-6 * 10000000.1)-> " + b);
		System.out.println("(true && true)-> " + c);
		System.out.println("(false && true)-> " + d);
		System.out.println("((false && false) || (true && true))-> " + e);
		System.out.println("(false || false) && (true && true)-> " + f);
	}
}
