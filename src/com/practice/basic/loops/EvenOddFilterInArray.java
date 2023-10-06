package com.practice.basic.loops;

public class EvenOddFilterInArray {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		System.out.println("Even numbers:");

		EvenNumbers(numbers);

		System.out.println("\nOdd numbers:");

		OddNumbers(numbers);
	}

	public static void EvenNumbers(int[] numbers) {

		for (int number : numbers) {

			if (number % 2 == 0) {

				System.out.print(number + " ");
			}
		}
	}

	public static void OddNumbers(int[] numbers) {

		for (int number : numbers) {

			if (number % 2 != 0) {

				System.out.print(number + " ");
			}
		}
	}
}