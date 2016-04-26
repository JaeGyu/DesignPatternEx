package sigleton;

public class SingletonCase1 {

	private static final SingletonCase1 sc1 = new SingletonCase1();

	private SingletonCase1() {
		System.out.println("case1 방식으로 생성됨");
	}

	public static SingletonCase1 getInstance() {
		return sc1;
	}
}
