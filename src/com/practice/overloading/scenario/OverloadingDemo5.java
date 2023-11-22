package com.practice.overloading.scenario;

public class OverloadingDemo5 {

	public void m1(Object o) {

		System.out.println("m1()Object o )");
	}

	public void m1(String o) {

		System.out.println("m1(String o)");
	}

	public void m1(Integer o) {

		System.out.println("m1(Integer o)");
	}

	public void m1(Character o) {

		System.out.println("m1(Character o)");

	}

	public void m1(char o) {

		System.out.println("m1(char o)");
	}

	public void m1(int o) {

		System.out.println("m1(int o)");
	}

	public void m1(long o) {

		System.out.println("m1(long o)");
	}

	public static void main(String[] args) {

		OverloadingDemo5 obj = new OverloadingDemo5();

		Character c = 'a';

		obj.m1(c);

	}

}
