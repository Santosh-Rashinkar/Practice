package com.prowings.abstraction;

public class B extends A {

	public static void main(String[] args) {

		B b = new B();

		b.printHello();

		b.printStatus();

		b.addition(10, 30);
	}

	@Override
	public void printStatus() {

	}

	@Override
	public void addition(int number1, int number2) {

		int res = number1 + number2;

		System.out.println("Addition is : " + res);
	}

}