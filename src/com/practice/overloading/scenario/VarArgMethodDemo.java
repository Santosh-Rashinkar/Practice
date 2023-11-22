package com.practice.overloading.scenario;

public class VarArgMethodDemo {

	public void m1(String s, int... nums) {

		int res = 0;

		for (int n : nums) {

			res += n;
		}
		System.out.println(s);
		System.out.println(res);
	}

	public static void main(String[] args) {

		VarArgMethodDemo obj = new VarArgMethodDemo();

		obj.m1("hello", 10, 20, 30);

	}

}
