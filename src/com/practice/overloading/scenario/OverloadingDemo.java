package com.practice.overloading.scenario;

public class OverloadingDemo {

	public void m1(int i) {
		System.out.println("m1(int i)");
	}

	public void m1(Integer i) {
		System.out.println("m1(Integer i)");
	}

	public void m1(long i) {
		System.out.println("m1(long i)");
	}

	public void m1(Long i) {
		System.out.println("m1(Long i)");
	}

	public void m1(Number i) {
		System.out.println("m1(Number i)");
	}

	public void m1(Object i) {
		System.out.println("m1(Object i)");
	}

	public static void main(String[] args) {

		OverloadingDemo demo = new OverloadingDemo();

		demo.m1(10); // primitive     

	}

}