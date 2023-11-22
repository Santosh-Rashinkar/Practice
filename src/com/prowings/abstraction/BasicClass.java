package com.prowings.abstraction;

public abstract class BasicClass {

	public static int additionOfNumber(int a, int b) {

		return 0;
	}

	static {
		System.out.println("inside static block");

		{
			System.out.println("inside instance block");
		}
	}

	public abstract void Subtraction();

	public static void main(String[] args) {

		System.out.println("main method ");

		additionOfNumber(20, 30);

	}
}
