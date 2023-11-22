package com.practice.method.overriding;

class Parent1 {

	public void m1(int i) {

		System.out.println("parent m1 method");
	}

	private void m1(String i) {

		System.out.println("string m1 method");
	}

	public static void main(String[] args) {

		Parent1 p1 = new Parent1();

		p1.m1(20);

		p1.m1("null");
	}

}
