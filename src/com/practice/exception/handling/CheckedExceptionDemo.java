package com.practice.exception.handling;

import java.io.IOException;

class CheckedExceptionDemo {

	int age;
	String name;

	public CheckedExceptionDemo(int age, String name) {
		super();
		System.out.println("constructor started");
		this.age = age;
		this.name = name;

		System.out.println(age);
		System.out.println(name);
		System.out.println("constructor Ended");
	}

	public static void main(String[] args) throws IOException {

		System.out.println("main started ");

		CheckedExceptionDemo d = new CheckedExceptionDemo(22, "Ram");

		d.myMethod();

		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");

		System.out.println("main ended");
	}

	public int myMethod() throws IOException {

		int a = 10, b = 0;

		try {
			a = a / b;
		} catch (ArithmeticException e) {

			System.out.println("Cannot divide by zero");

		} finally {
			System.out.println("finally is executed");
		}
		return a;

	}
}