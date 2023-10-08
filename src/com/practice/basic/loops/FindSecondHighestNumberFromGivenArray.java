package com.practice.basic.loops;

import java.util.Arrays;

public class FindSecondHighestNumberFromGivenArray {

	public static void main(String[] args) {

		System.out.println("main started!!!");

		int[] numbs = { 10, 8, 20, 12, 5 };

		System.out.println("Original Array : " + Arrays.toString(numbs));

		int secondHighestNumber = findSecondHighestNumber(numbs);

		System.out.println("Second Highest Number from given array is : " + secondHighestNumber);

		System.out.println("main ended!!!");

	}

	public static int findSecondHighestNumber(int[] numbs) {

		int temp = 0;

		for (int i = 0; i < numbs.length; i++) {
			for (int j = i + 1; j < numbs.length; j++) {
				if (numbs[i] > numbs[j]) {
					temp = numbs[i];

					numbs[i] = numbs[j];

					numbs[j] = temp;
				}
			}
		}
		System.out.println("after sorting :" + Arrays.toString(numbs));

		return numbs[numbs.length - 2];
	}
}
