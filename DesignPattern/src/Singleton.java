/**
 * 
 * @author lwang
 * Basic solution, not thread safe.
 */

public class Singleton {
	private static Singleton singleton = null;

	private Singleton(){
		// Exists only to defeat instantiation.
	}
	
	public static Singleton getInstance() {
		if(singleton == null){
			singleton = new Singleton();
		}
		return singleton;
	}

	
}
