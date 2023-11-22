package com.practice.method.overriding;

class MethodHiding_1 {

	public static void m1() {

		System.out.println("MethodHiding_1 m1() method  is static method");
	}
}

public class MethodHiding2 extends MethodHiding_1 {

	public static void m1() {

		System.out.println("MethodHiding2 m1() method is static method");
	}

	public static void main(String[] args) {

		MethodHiding_1.m1();
		MethodHiding2.m1();

		System.out.println("This is method Hiding example");
	}
}
