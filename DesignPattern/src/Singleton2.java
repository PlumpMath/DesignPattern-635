/**
 * Thread safe solution.
 * @author lwang
 *
 */
public class Singleton2 {

	private static class InstanceLoader {
		public static final Singleton2 instance = new Singleton2();
	}

	public static Singleton2 getInstance() {
		return InstanceLoader.instance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
