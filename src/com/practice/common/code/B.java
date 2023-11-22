package com.practice.common.code;

public class B extends A {

	void m2() {

		System.out.println("child class method m2()");
	}

	public static void main(String[] args) {

		B b = new B();
		
		b.m1();
		b.m2();
		
	}
}
