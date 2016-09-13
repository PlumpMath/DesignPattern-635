/**
 * 
 * @author lwang Do it in loop way
 */
public class Fibonacci2 {

	public static long fibonacci(int n) {
		if (n <= 1)
			return n;
		else {
			long f[] = new long[n + 1];
			f[0] = 0;
			f[1] = 1;
			for (int i = 2; i <= n; i++)
				f[i] = f[i - 1] + f[i - 2];

			return f[n];
		}
	}

	public static void main(String[] args) {
		System.out.println(fibonacci(1));
		System.out.println(fibonacci(2));
		System.out.println(fibonacci(10));
		System.out.println(fibonacci(50));
	}

}
