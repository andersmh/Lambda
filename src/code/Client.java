package code;

import java.util.List;

public class Client {

	public static void main(String[] args) {

		// Multiply a and b
		Multiply a = (x, y) -> x * y;
		System.out.println(a.multiply(14, 10));

		Divide b = (x, y) -> x / y;
		System.out.println(b.divide(1, 2));

	}

	interface Multiply {
		int multiply(int a, int b);
	}

	interface Divide {
		double divide(double a, double b);
	}

}
