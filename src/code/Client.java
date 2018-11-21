package code;

import java.util.List;
import java.util.function.Function;

public class Client {

	public static void main(String[] args) {

		// Multiply a and b
		Multiply a = (x, y) -> x * y;
		System.out.println(a.multiply(14, 10));

		// Divide a by b
		Divide b = (x, y) -> x / y;
		System.out.println(b.divide(1, 2));
		
		// Adds 1 to the number
		System.out.println(add1.apply(4));
		
	}
	
	

	interface Multiply {
		int multiply(int a, int b);
	}

	interface Divide {
		double divide(double a, double b);
	}
	
	public static Function<Integer,Integer> add1 = x -> x + 1;
	
	

}
