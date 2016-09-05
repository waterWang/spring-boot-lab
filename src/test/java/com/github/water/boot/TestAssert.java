package com.github.water.boot;


public class TestAssert {

	public static void main(String[] args) {
		TestAssert at = new TestAssert();
		at.assertMe(true);
		at.assertMe(false);

	}

	private void assertMe(boolean boo) {
		assert boo ? true : false;
//		System.out.println("true condition");
	}

}
