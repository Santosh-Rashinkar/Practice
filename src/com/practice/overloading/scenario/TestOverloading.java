package com.practice.overloading.scenario;

public class TestOverloading {

//	public void m1(StringBuffer sb) {
//
//		System.out.println("StringBuffer - args");
//	}
	public void m1(Object o) {

		System.out.println("Object - args");
	}

	public void m1(String s) {

		System.out.println("String - version ");
	}

	public static void main(String[] args) {

		TestOverloading test = new TestOverloading();

//		test.m1("null");

		test.m1("santosh");

		test.m1(null);

	}

}
