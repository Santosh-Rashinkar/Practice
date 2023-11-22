package com.prowings.abstraction;

public class Simple {

	public int method(int i) {

		System.out.println(i);

		return 0;
	}

	 int method(int i, long j) {

		System.out.println(i + j);

		return 0;
	}

	 int method(double d, double e) {

		System.out.println(d + e);

		return 0;
	}

	int method(long a, long b) {

		System.out.println(a + b);

		return 0;
	}

	public static void main(String[] args) {

		Simple s = new Simple();

		s.method(10,40);
		s.method(20, 50);
		s.method(10, 30);
		s.method(10);
	}
}
