package com.practice.basic.loops;

public class ArrayEquality1 {

	public static void main(String[] args) {

		int[] number = { 1, 2, 3 };
		int[] number1 = { 1, 2, 3, 4 };

		if (checkEquality(number, number1))

			System.out.println("Equal");
		else
			System.out.println("not Equal");
	}

	public static boolean checkEquality(int[] number, int[] number1) {

		boolean isEqual = false;

		if (number.length == number1.length) {

			for (int i = 0; i < number.length; i++) {

				if (number[i] == number1[i]) {

					isEqual = true;
				} else {
					isEqual = false;

					return isEqual;
				}
			}
		}

		return isEqual;
	}
}