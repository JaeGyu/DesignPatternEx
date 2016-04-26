package sigleton;

public class SingletonCase2 {

	private static volatile SingletonCase2 instance = null;

	private SingletonCase2() {
	}

	public static SingletonCase2 getInstance() {
		if (instance == null) {
			synchronized (SingletonCase2.class) {
				if (instance == null) {
					instance = new SingletonCase2();
				}
			}
		}

		return instance;
	}

}
