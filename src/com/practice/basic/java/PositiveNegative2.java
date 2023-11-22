package com.practice.basic.java;

public class PositiveNegative2 {

	public static void guessTheNumber(int num) {

		if (num > 0)

			System.out.println("given number is positive");

		else if (num < 0)

			System.out.println("given number is negative");
		else

			System.out.println("given number is zero");
	}

	public static void main(String[] args) {

		guessTheNumber(10);
	}
}
