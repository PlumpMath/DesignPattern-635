
/**
 * 
 * @author lwang
 *	A recursive way to calculate fibonacci number.
 */
public class Fibonacci {

	public Fibonacci() {

	}

	public static long fibonacci(long n) {
		if (n <= 1) {
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n-2);
		}

	}

	public static void main(String[] args) {
		System.out.println(fibonacci(2));
		System.out.println(fibonacci(10));
		System.out.println(fibonacci(100));
	}

}
