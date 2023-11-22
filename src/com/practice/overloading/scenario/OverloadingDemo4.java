package com.practice.overloading.scenario;

public class OverloadingDemo4 {

	public void m1(Object o) {

		System.out.println("m1()Object o )");
	}

	public void m1(Integer o) {

		System.out.println("m1(Integer o)");
	}

//	public void m1(Long i) {
//
//		System.out.println("m1(Long o)");
//
//	}

	public void m1(Number o) {

		System.out.println("m1(Number o)");
	}

	public void m1(String o) {

		System.out.println("m1(String o)");
	}

	public void m1(Boolean o) {

		System.out.println("m1(Boolean o)");
	}

	public void m1(int o) {

		System.out.println("m1(int o)");
	}

	public static void main(String[] args) {

		OverloadingDemo4 obj = new OverloadingDemo4();

		obj.m1("null");

	}

}
