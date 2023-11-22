package com.practice.overloading.scenario;

public class Test2 {

	public void m1(int i, float j) {

		System.out.println("int i, float j");
	}

	public void m1(float i, int j) {

		System.out.println("float i, int j");
	}

	public static void main(String[] args) {

		Test2 t = new Test2();

		t.m1(10.5f, 20);

		t.m1(10, 30f);
		
//		t.m1(10, 10); // ambiguous error
		
//		t.m1(10.4f, 10.4f); // cannot find symbol

	}

}
