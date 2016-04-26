package sigleton;

public class SingletonCase1 {

	private static final SingletonCase1 sc1 = new SingletonCase1();

	private SingletonCase1() {
	}

	public static SingletonCase1 getInstance() {
		return sc1;
	}
}
