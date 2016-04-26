package singleton;

import static org.junit.Assert.*;

import org.junit.Test;

import sigleton.SingletonCase1;
import sigleton.SingletonCase2;
import sigleton.SingletonCase3;

public class TestSingleton {
	
	@Test
	public void 싱글톤_객체_생성() throws Exception {
		SingletonCase1 case1 = SingletonCase1.getInstance();
		SingletonCase2 case2 = SingletonCase2.getInstance();
		SingletonCase3 case3 = SingletonCase3.getInstance();
	}
}
