package sigleton;

public class SingletonCase3 {
	private SingletonCase3() {
		System.out.println("case3방식으로 생성됨");
	}

	private static class SingleHolder {
		public static final SingletonCase3 INSTANCE = new SingletonCase3();
	}

	public static SingletonCase3 getInstance() {
		return SingleHolder.INSTANCE;
	}
}
