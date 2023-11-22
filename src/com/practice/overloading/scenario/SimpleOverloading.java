package com.practice.overloading.scenario;

public class SimpleOverloading {

	public void method(int i) {

		System.out.println("int i");

	}

	void method(int i, long j) {

		System.out.println("int i ,long j");

	}

	void method(double d, double e) {

		System.out.println("double d ,double d");

	}

	void method(long a, long b) {

		System.out.println("long a ,long b");

		
	}

	public static void main(String[] args) {

		SimpleOverloading s = new SimpleOverloading();

		s.method(10,20);
	}
}
